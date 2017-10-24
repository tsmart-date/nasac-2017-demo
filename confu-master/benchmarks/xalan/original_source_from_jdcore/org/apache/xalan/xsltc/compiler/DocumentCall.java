package org.apache.xalan.xsltc.compiler;

import java.util.Vector;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.GETFIELD;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.PUSH;
import org.apache.xalan.xsltc.compiler.util.ClassGenerator;
import org.apache.xalan.xsltc.compiler.util.ErrorMsg;
import org.apache.xalan.xsltc.compiler.util.MethodGenerator;
import org.apache.xalan.xsltc.compiler.util.Type;
import org.apache.xalan.xsltc.compiler.util.TypeCheckError;



























final class DocumentCall
  extends FunctionCall
{
  private Expression _arg1 = null;
  private Expression _arg2 = null;
  
  private Type _arg1Type;
  

  public DocumentCall(QName fname, Vector arguments)
  {
    super(fname, arguments);
  }
  




  public Type typeCheck(SymbolTable stable)
    throws TypeCheckError
  {
    int ac = argumentCount();
    if ((ac < 1) || (ac > 2)) {
      ErrorMsg msg = new ErrorMsg("ILLEGAL_ARG_ERR", this);
      throw new TypeCheckError(msg);
    }
    if (getStylesheet() == null) {
      ErrorMsg msg = new ErrorMsg("ILLEGAL_ARG_ERR", this);
      throw new TypeCheckError(msg);
    }
    

    _arg1 = argument(0);
    
    if (_arg1 == null) {
      ErrorMsg msg = new ErrorMsg("DOCUMENT_ARG_ERR", this);
      throw new TypeCheckError(msg);
    }
    
    _arg1Type = _arg1.typeCheck(stable);
    if ((_arg1Type != Type.NodeSet) && (_arg1Type != Type.String)) {
      _arg1 = new CastExpr(_arg1, Type.String);
    }
    

    if (ac == 2) {
      _arg2 = argument(1);
      
      if (_arg2 == null) {
        ErrorMsg msg = new ErrorMsg("DOCUMENT_ARG_ERR", this);
        throw new TypeCheckError(msg);
      }
      
      Type arg2Type = _arg2.typeCheck(stable);
      
      if (arg2Type.identicalTo(Type.Node)) {
        _arg2 = new CastExpr(_arg2, Type.NodeSet);
      } else if (!arg2Type.identicalTo(Type.NodeSet))
      {

        ErrorMsg msg = new ErrorMsg("DOCUMENT_ARG_ERR", this);
        throw new TypeCheckError(msg);
      }
    }
    
    return this._type = Type.NodeSet;
  }
  



  public void translate(ClassGenerator classGen, MethodGenerator methodGen)
  {
    ConstantPoolGen cpg = classGen.getConstantPool();
    InstructionList il = methodGen.getInstructionList();
    int ac = argumentCount();
    
    int domField = cpg.addFieldref(classGen.getClassName(), "_dom", "Lorg/apache/xalan/xsltc/DOM;");
    


    String docParamList = null;
    if (ac == 1)
    {
      docParamList = "(Ljava/lang/Object;Ljava/lang/String;Lorg/apache/xalan/xsltc/runtime/AbstractTranslet;Lorg/apache/xalan/xsltc/DOM;)Lorg/apache/xml/dtm/DTMAxisIterator;";
    }
    else
    {
      docParamList = "(Ljava/lang/Object;Lorg/apache/xml/dtm/DTMAxisIterator;Ljava/lang/String;Lorg/apache/xalan/xsltc/runtime/AbstractTranslet;Lorg/apache/xalan/xsltc/DOM;)Lorg/apache/xml/dtm/DTMAxisIterator;";
    }
    
    int docIdx = cpg.addMethodref("org.apache.xalan.xsltc.dom.LoadDocument", "documentF", docParamList);
    



    _arg1.translate(classGen, methodGen);
    if (_arg1Type == Type.NodeSet) {
      _arg1.startIterator(classGen, methodGen);
    }
    
    if (ac == 2)
    {
      _arg2.translate(classGen, methodGen);
      _arg2.startIterator(classGen, methodGen);
    }
    

    il.append(new PUSH(cpg, getStylesheet().getSystemId()));
    il.append(classGen.loadTranslet());
    il.append(DUP);
    il.append(new GETFIELD(domField));
    il.append(new INVOKESTATIC(docIdx));
  }
}
