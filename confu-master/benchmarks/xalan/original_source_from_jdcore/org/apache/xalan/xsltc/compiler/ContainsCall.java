package org.apache.xalan.xsltc.compiler;

import java.util.Vector;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.IFLT;
import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.generic.InstructionList;
import org.apache.xalan.xsltc.compiler.util.ClassGenerator;
import org.apache.xalan.xsltc.compiler.util.MethodGenerator;
import org.apache.xalan.xsltc.compiler.util.Type;
import org.apache.xalan.xsltc.compiler.util.TypeCheckError;




























final class ContainsCall
  extends FunctionCall
{
  private Expression _base = null;
  private Expression _token = null;
  


  public ContainsCall(QName fname, Vector arguments)
  {
    super(fname, arguments);
  }
  


  public boolean isBoolean()
  {
    return true;
  }
  



  public Type typeCheck(SymbolTable stable)
    throws TypeCheckError
  {
    if (argumentCount() != 2) {
      throw new TypeCheckError("ILLEGAL_ARG_ERR", getName(), this);
    }
    

    _base = argument(0);
    Type baseType = _base.typeCheck(stable);
    if (baseType != Type.String) {
      _base = new CastExpr(_base, Type.String);
    }
    
    _token = argument(1);
    Type tokenType = _token.typeCheck(stable);
    if (tokenType != Type.String) {
      _token = new CastExpr(_token, Type.String);
    }
    return this._type = Type.Boolean;
  }
  


  public void translate(ClassGenerator classGen, MethodGenerator methodGen)
  {
    translateDesynthesized(classGen, methodGen);
    synthesize(classGen, methodGen);
  }
  



  public void translateDesynthesized(ClassGenerator classGen, MethodGenerator methodGen)
  {
    ConstantPoolGen cpg = classGen.getConstantPool();
    InstructionList il = methodGen.getInstructionList();
    _base.translate(classGen, methodGen);
    _token.translate(classGen, methodGen);
    il.append(new INVOKEVIRTUAL(cpg.addMethodref("java.lang.String", "indexOf", "(Ljava/lang/String;)I")));
    

    _falseList.add(il.append(new IFLT(null)));
  }
}
