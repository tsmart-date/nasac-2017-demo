package org.apache.xalan.xsltc.compiler;

import java.util.Vector;
import org.apache.bcel.generic.CHECKCAST;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionList;
import org.apache.xalan.xsltc.compiler.util.ClassGenerator;
import org.apache.xalan.xsltc.compiler.util.ErrorMsg;
import org.apache.xalan.xsltc.compiler.util.MethodGenerator;
import org.apache.xalan.xsltc.compiler.util.ObjectType;
import org.apache.xalan.xsltc.compiler.util.Type;
import org.apache.xalan.xsltc.compiler.util.TypeCheckError;



































final class CastCall
  extends FunctionCall
{
  private String _className;
  private Expression _right;
  
  public CastCall(QName fname, Vector arguments)
  {
    super(fname, arguments);
  }
  


  public Type typeCheck(SymbolTable stable)
    throws TypeCheckError
  {
    if (argumentCount() != 2) {
      throw new TypeCheckError(new ErrorMsg("ILLEGAL_ARG_ERR", getName(), this));
    }
    


    Expression exp = argument(0);
    if ((exp instanceof LiteralExpr)) {
      _className = ((LiteralExpr)exp).getValue();
      _type = Type.newObjectType(_className);
    }
    else {
      throw new TypeCheckError(new ErrorMsg("NEED_LITERAL_ERR", getName(), this));
    }
    


    _right = argument(1);
    Type tright = _right.typeCheck(stable);
    if ((tright != Type.Reference) && (!(tright instanceof ObjectType)))
    {

      throw new TypeCheckError(new ErrorMsg("DATA_CONVERSION_ERR", tright, _type, this));
    }
    

    return _type;
  }
  
  public void translate(ClassGenerator classGen, MethodGenerator methodGen) {
    ConstantPoolGen cpg = classGen.getConstantPool();
    InstructionList il = methodGen.getInstructionList();
    
    _right.translate(classGen, methodGen);
    il.append(new CHECKCAST(cpg.addClass(_className)));
  }
}
