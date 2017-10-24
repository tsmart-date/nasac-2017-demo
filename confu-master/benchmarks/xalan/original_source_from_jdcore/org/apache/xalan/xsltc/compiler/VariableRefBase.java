package org.apache.xalan.xsltc.compiler;

import org.apache.xalan.xsltc.compiler.util.Type;
import org.apache.xalan.xsltc.compiler.util.TypeCheckError;

































class VariableRefBase
  extends Expression
{
  protected VariableBase _variable;
  protected Closure _closure = null;
  
  public VariableRefBase(VariableBase variable) {
    _variable = variable;
    variable.addReference(this);
  }
  
  public VariableRefBase() {
    _variable = null;
  }
  


  public VariableBase getVariable()
  {
    return _variable;
  }
  











  public void addParentDependency()
  {
    SyntaxTreeNode node = this;
    while ((node != null) && (!(node instanceof TopLevelElement))) {
      node = node.getParent();
    }
    
    TopLevelElement parent = (TopLevelElement)node;
    if (parent != null) {
      VariableBase var = _variable;
      if (_variable._ignore) {
        if ((_variable instanceof Variable)) {
          var = parent.getSymbolTable().lookupVariable(_variable._name);
        }
        else if ((_variable instanceof Param)) {
          var = parent.getSymbolTable().lookupParam(_variable._name);
        }
      }
      
      parent.addDependency(var);
    }
  }
  


  public boolean equals(Object obj)
  {
    try
    {
      return _variable == _variable;
    }
    catch (ClassCastException e) {}
    return false;
  }
  





  public String toString()
  {
    return "variable-ref(" + _variable.getName() + '/' + _variable.getType() + ')';
  }
  

  public Type typeCheck(SymbolTable stable)
    throws TypeCheckError
  {
    if (_type != null) { return _type;
    }
    
    if (_variable.isLocal()) {
      SyntaxTreeNode node = getParent();
      do {
        if ((node instanceof Closure)) {
          _closure = ((Closure)node);
          break;
        }
        if ((node instanceof TopLevelElement)) {
          break;
        }
        node = node.getParent();
      } while (node != null);
      
      if (_closure != null) {
        _closure.addVariable(this);
      }
    }
    

    _type = _variable.getType();
    


    if (_type == null) {
      _variable.typeCheck(stable);
      _type = _variable.getType();
    }
    

    addParentDependency();
    

    return _type;
  }
}
