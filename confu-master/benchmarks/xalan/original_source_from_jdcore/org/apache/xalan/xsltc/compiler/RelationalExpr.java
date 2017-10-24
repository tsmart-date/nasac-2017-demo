package org.apache.xalan.xsltc.compiler;

import java.util.Vector;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.PUSH;
import org.apache.xalan.xsltc.compiler.util.BooleanType;
import org.apache.xalan.xsltc.compiler.util.ClassGenerator;
import org.apache.xalan.xsltc.compiler.util.ErrorMsg;
import org.apache.xalan.xsltc.compiler.util.IntType;
import org.apache.xalan.xsltc.compiler.util.MethodGenerator;
import org.apache.xalan.xsltc.compiler.util.MethodType;
import org.apache.xalan.xsltc.compiler.util.NodeSetType;
import org.apache.xalan.xsltc.compiler.util.NodeType;
import org.apache.xalan.xsltc.compiler.util.RealType;
import org.apache.xalan.xsltc.compiler.util.ReferenceType;
import org.apache.xalan.xsltc.compiler.util.ResultTreeType;
import org.apache.xalan.xsltc.compiler.util.Type;
import org.apache.xalan.xsltc.compiler.util.TypeCheckError;
import org.apache.xalan.xsltc.runtime.Operators;






















final class RelationalExpr
  extends Expression
{
  private int _op;
  private Expression _left;
  private Expression _right;
  
  public RelationalExpr(int op, Expression left, Expression right)
  {
    _op = op;
    (this._left = left).setParent(this);
    (this._right = right).setParent(this);
  }
  
  public void setParser(Parser parser) {
    super.setParser(parser);
    _left.setParser(parser);
    _right.setParser(parser);
  }
  



  public boolean hasPositionCall()
  {
    if (_left.hasPositionCall()) return true;
    if (_right.hasPositionCall()) return true;
    return false;
  }
  


  public boolean hasLastCall()
  {
    return (_left.hasLastCall()) || (_right.hasLastCall());
  }
  
  public boolean hasReferenceArgs() {
    return ((_left.getType() instanceof ReferenceType)) || ((_right.getType() instanceof ReferenceType));
  }
  
  public boolean hasNodeArgs()
  {
    return ((_left.getType() instanceof NodeType)) || ((_right.getType() instanceof NodeType));
  }
  
  public boolean hasNodeSetArgs()
  {
    return ((_left.getType() instanceof NodeSetType)) || ((_right.getType() instanceof NodeSetType));
  }
  
  public Type typeCheck(SymbolTable stable) throws TypeCheckError
  {
    Type tleft = _left.typeCheck(stable);
    Type tright = _right.typeCheck(stable);
    

    if (((tleft instanceof ResultTreeType)) && ((tright instanceof ResultTreeType)))
    {

      _right = new CastExpr(_right, Type.Real);
      _left = new CastExpr(_left, Type.Real);
      return this._type = Type.Boolean;
    }
    

    if (hasReferenceArgs()) {
      Type type = null;
      Type typeL = null;
      Type typeR = null;
      if (((tleft instanceof ReferenceType)) && 
        ((_left instanceof VariableRefBase))) {
        VariableRefBase ref = (VariableRefBase)_left;
        VariableBase var = ref.getVariable();
        typeL = var.getType();
      }
      
      if (((tright instanceof ReferenceType)) && 
        ((_right instanceof VariableRefBase))) {
        VariableRefBase ref = (VariableRefBase)_right;
        VariableBase var = ref.getVariable();
        typeR = var.getType();
      }
      

      if (typeL == null) {
        type = typeR;
      } else if (typeR == null) {
        type = typeL;
      } else {
        type = Type.Real;
      }
      if (type == null) { type = Type.Real;
      }
      _right = new CastExpr(_right, type);
      _left = new CastExpr(_left, type);
      return this._type = Type.Boolean;
    }
    
    if (hasNodeSetArgs())
    {
      if ((tright instanceof NodeSetType)) {
        Expression temp = _right;_right = _left;_left = temp;
        _op = (_op == 4 ? 5 : _op == 3 ? 2 : _op == 2 ? 3 : 4);
        

        tright = _right.getType();
      }
      

      if ((tright instanceof NodeType)) {
        _right = new CastExpr(_right, Type.NodeSet);
      }
      
      if ((tright instanceof IntType)) {
        _right = new CastExpr(_right, Type.Real);
      }
      
      if ((tright instanceof ResultTreeType)) {
        _right = new CastExpr(_right, Type.String);
      }
      return this._type = Type.Boolean;
    }
    

    if (hasNodeArgs()) {
      if ((tleft instanceof BooleanType)) {
        _right = new CastExpr(_right, Type.Boolean);
        tright = Type.Boolean;
      }
      if ((tright instanceof BooleanType)) {
        _left = new CastExpr(_left, Type.Boolean);
        tleft = Type.Boolean;
      }
    }
    

    MethodType ptype = lookupPrimop(stable, Operators.getOpNames(_op), new MethodType(Type.Void, tleft, tright));
    

    if (ptype != null) {
      Type arg1 = (Type)ptype.argsType().elementAt(0);
      if (!arg1.identicalTo(tleft)) {
        _left = new CastExpr(_left, arg1);
      }
      Type arg2 = (Type)ptype.argsType().elementAt(1);
      if (!arg2.identicalTo(tright)) {
        _right = new CastExpr(_right, arg1);
      }
      return this._type = ptype.resultType();
    }
    throw new TypeCheckError(this);
  }
  
  public void translate(ClassGenerator classGen, MethodGenerator methodGen) {
    if ((hasNodeSetArgs()) || (hasReferenceArgs())) {
      ConstantPoolGen cpg = classGen.getConstantPool();
      InstructionList il = methodGen.getInstructionList();
      

      _left.translate(classGen, methodGen);
      _left.startIterator(classGen, methodGen);
      _right.translate(classGen, methodGen);
      _right.startIterator(classGen, methodGen);
      
      il.append(new PUSH(cpg, _op));
      il.append(methodGen.loadDOM());
      
      int index = cpg.addMethodref("org.apache.xalan.xsltc.runtime.BasisLibrary", "compare", "(" + _left.getType().toSignature() + _right.getType().toSignature() + "I" + "Lorg/apache/xalan/xsltc/DOM;" + ")Z");
      





      il.append(new INVOKESTATIC(index));
    }
    else {
      translateDesynthesized(classGen, methodGen);
      synthesize(classGen, methodGen);
    }
  }
  
  public void translateDesynthesized(ClassGenerator classGen, MethodGenerator methodGen)
  {
    if ((hasNodeSetArgs()) || (hasReferenceArgs())) {
      translate(classGen, methodGen);
      desynthesize(classGen, methodGen);
    }
    else {
      BranchInstruction bi = null;
      InstructionList il = methodGen.getInstructionList();
      
      _left.translate(classGen, methodGen);
      _right.translate(classGen, methodGen);
      


      boolean tozero = false;
      Type tleft = _left.getType();
      
      if ((tleft instanceof RealType)) {
        il.append(tleft.CMP((_op == 3) || (_op == 5)));
        tleft = Type.Int;
        tozero = true;
      }
      
      switch (_op) {
      case 3: 
        bi = tleft.GE(tozero);
        break;
      
      case 2: 
        bi = tleft.LE(tozero);
        break;
      
      case 5: 
        bi = tleft.GT(tozero);
        break;
      
      case 4: 
        bi = tleft.LT(tozero);
        break;
      
      default: 
        ErrorMsg msg = new ErrorMsg("ILLEGAL_RELAT_OP_ERR", this);
        getParser().reportError(2, msg);
      }
      
      _falseList.add(il.append(bi));
    }
  }
  
  public String toString() {
    return Operators.getOpNames(_op) + '(' + _left + ", " + _right + ')';
  }
}