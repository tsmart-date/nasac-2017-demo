package org.apache.xalan.xsltc.compiler;

import java.util.Vector;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.generic.InstructionList;
import org.apache.xalan.xsltc.compiler.util.ClassGenerator;
import org.apache.xalan.xsltc.compiler.util.ErrorMsg;
import org.apache.xalan.xsltc.compiler.util.MethodGenerator;
import org.apache.xalan.xsltc.compiler.util.NamedMethodGenerator;
import org.apache.xalan.xsltc.compiler.util.Type;
import org.apache.xalan.xsltc.compiler.util.TypeCheckError;
import org.apache.xalan.xsltc.compiler.util.Util;
import org.apache.xml.utils.XML11Char;






























public final class Template
  extends TopLevelElement
{
  private QName _name;
  private QName _mode;
  private Pattern _pattern;
  private double _priority;
  private int _position;
  private boolean _disabled = false;
  private boolean _compiled = false;
  private boolean _simplified = false;
  


  private boolean _isSimpleNamedTemplate = false;
  
  public Template() {}
  
  private Vector _parameters = new Vector();
  
  public boolean hasParams() {
    return _parameters.size() > 0; }
  
  public boolean isSimplified()
  {
    return _simplified;
  }
  
  public void setSimplified() {
    _simplified = true;
  }
  
  public boolean isSimpleNamedTemplate() {
    return _isSimpleNamedTemplate;
  }
  
  public void addParameter(Param param) {
    _parameters.addElement(param);
  }
  
  public Vector getParameters() {
    return _parameters;
  }
  
  public void disable() {
    _disabled = true;
  }
  
  public boolean disabled() {
    return _disabled;
  }
  
  public double getPriority() {
    return _priority;
  }
  
  public int getPosition() {
    return _position;
  }
  
  public boolean isNamed() {
    return _name != null;
  }
  
  public Pattern getPattern() {
    return _pattern;
  }
  
  public QName getName() {
    return _name;
  }
  
  public void setName(QName qname) {
    if (_name == null) _name = qname;
  }
  
  public QName getModeName() {
    return _mode;
  }
  


  public int compareTo(Object template)
  {
    Template other = (Template)template;
    if (_priority > _priority)
      return 1;
    if (_priority < _priority)
      return -1;
    if (_position > _position)
      return 1;
    if (_position < _position) {
      return -1;
    }
    return 0;
  }
  
  public void display(int indent) {
    Util.println('\n');
    indent(indent);
    if (_name != null) {
      indent(indent);
      Util.println("name = " + _name);
    }
    else if (_pattern != null) {
      indent(indent);
      Util.println("match = " + _pattern.toString());
    }
    if (_mode != null) {
      indent(indent);
      Util.println("mode = " + _mode);
    }
    displayContents(indent + 4);
  }
  
  private boolean resolveNamedTemplates(Template other, Parser parser)
  {
    if (other == null) { return true;
    }
    SymbolTable stable = parser.getSymbolTable();
    
    int us = getImportPrecedence();
    int them = other.getImportPrecedence();
    
    if (us > them) {
      other.disable();
      return true;
    }
    if (us < them) {
      stable.addTemplate(other);
      disable();
      return true;
    }
    
    return false;
  }
  

  private Stylesheet _stylesheet = null;
  
  public Stylesheet getStylesheet() {
    return _stylesheet;
  }
  
  public void parseContents(Parser parser)
  {
    String name = getAttribute("name");
    String mode = getAttribute("mode");
    String match = getAttribute("match");
    String priority = getAttribute("priority");
    
    _stylesheet = super.getStylesheet();
    
    if (name.length() > 0) {
      if (!XML11Char.isXML11ValidQName(name)) {
        ErrorMsg err = new ErrorMsg("INVALID_QNAME_ERR", name, this);
        parser.reportError(3, err);
      }
      _name = parser.getQNameIgnoreDefaultNs(name);
    }
    
    if (mode.length() > 0) {
      if (!XML11Char.isXML11ValidQName(mode)) {
        ErrorMsg err = new ErrorMsg("INVALID_QNAME_ERR", mode, this);
        parser.reportError(3, err);
      }
      _mode = parser.getQNameIgnoreDefaultNs(mode);
    }
    
    if (match.length() > 0) {
      _pattern = parser.parsePattern(this, "match", null);
    }
    
    if (priority.length() > 0) {
      _priority = Double.parseDouble(priority);

    }
    else if (_pattern != null) {
      _priority = _pattern.getPriority();
    } else {
      _priority = NaN.0D;
    }
    
    _position = parser.getTemplateIndex();
    

    if (_name != null) {
      Template other = parser.getSymbolTable().addTemplate(this);
      if (!resolveNamedTemplates(other, parser)) {
        ErrorMsg err = new ErrorMsg("TEMPLATE_REDEF_ERR", _name, this);
        
        parser.reportError(3, err);
      }
      
      if ((_pattern == null) && (_mode == null)) {
        _isSimpleNamedTemplate = true;
      }
    }
    
    if ((_parent instanceof Stylesheet)) {
      ((Stylesheet)_parent).addTemplate(this);
    }
    
    parser.setTemplate(this);
    parseChildren(parser);
    parser.setTemplate(null);
  }
  












  public void parseSimplified(Stylesheet stylesheet, Parser parser)
  {
    _stylesheet = stylesheet;
    setParent(stylesheet);
    
    _name = null;
    _mode = null;
    _priority = NaN.0D;
    _pattern = parser.parsePattern(this, "/");
    
    Vector contents = _stylesheet.getContents();
    SyntaxTreeNode root = (SyntaxTreeNode)contents.elementAt(0);
    
    if ((root instanceof LiteralElement)) {
      addElement(root);
      root.setParent(this);
      contents.set(0, this);
      parser.setTemplate(this);
      root.parseContents(parser);
      parser.setTemplate(null);
    }
  }
  
  public Type typeCheck(SymbolTable stable) throws TypeCheckError {
    if (_pattern != null) {
      _pattern.typeCheck(stable);
    }
    
    return typeCheckContents(stable);
  }
  
  public void translate(ClassGenerator classGen, MethodGenerator methodGen) {
    ConstantPoolGen cpg = classGen.getConstantPool();
    InstructionList il = methodGen.getInstructionList();
    
    if (_disabled) { return;
    }
    String className = classGen.getClassName();
    
    if ((_compiled) && (isNamed())) {
      String methodName = Util.escape(_name.toString());
      il.append(classGen.loadTranslet());
      il.append(methodGen.loadDOM());
      il.append(methodGen.loadIterator());
      il.append(methodGen.loadHandler());
      il.append(methodGen.loadCurrentNode());
      il.append(new INVOKEVIRTUAL(cpg.addMethodref(className, methodName, "(Lorg/apache/xalan/xsltc/DOM;Lorg/apache/xml/dtm/DTMAxisIterator;" + TRANSLET_OUTPUT_SIG + "I)V")));
      





      return;
    }
    
    if (_compiled) return;
    _compiled = true;
    

    if ((_isSimpleNamedTemplate) && ((methodGen instanceof NamedMethodGenerator))) {
      int numParams = _parameters.size();
      NamedMethodGenerator namedMethodGen = (NamedMethodGenerator)methodGen;
      

      for (int i = 0; i < numParams; i++) {
        Param param = (Param)_parameters.elementAt(i);
        param.setLoadInstruction(namedMethodGen.loadParameter(i));
        param.setStoreInstruction(namedMethodGen.storeParameter(i));
      }
    }
    
    translateContents(classGen, methodGen);
    il.setPositions(true);
  }
}
