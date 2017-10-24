package org.apache.xalan.xsltc.compiler;

import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.GOTO_W;
import org.apache.bcel.generic.IF_ICMPEQ;
import org.apache.bcel.generic.ILOAD;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.ISTORE;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.PUSH;
import org.apache.xalan.xsltc.compiler.util.ClassGenerator;
import org.apache.xalan.xsltc.compiler.util.MethodGenerator;
import org.apache.xalan.xsltc.compiler.util.Type;
import org.apache.xalan.xsltc.compiler.util.TypeCheckError;
import org.apache.xalan.xsltc.compiler.util.Util;
























final class AbsolutePathPattern
  extends LocationPathPattern
{
  private final RelativePathPattern _left;
  
  public AbsolutePathPattern(RelativePathPattern left)
  {
    _left = left;
    if (left != null) {
      left.setParent(this);
    }
  }
  
  public void setParser(Parser parser) {
    super.setParser(parser);
    if (_left != null)
      _left.setParser(parser);
  }
  
  public Type typeCheck(SymbolTable stable) throws TypeCheckError {
    return _left == null ? Type.Root : _left.typeCheck(stable);
  }
  
  public boolean isWildcard() {
    return false;
  }
  
  public StepPattern getKernelPattern() {
    return _left != null ? _left.getKernelPattern() : null;
  }
  
  public void reduceKernelPattern() {
    _left.reduceKernelPattern();
  }
  
  public void translate(ClassGenerator classGen, MethodGenerator methodGen) {
    ConstantPoolGen cpg = classGen.getConstantPool();
    InstructionList il = methodGen.getInstructionList();
    
    if (_left != null) {
      if ((_left instanceof StepPattern)) {
        LocalVariableGen local = methodGen.addLocalVariable2("apptmp", Util.getJCRefType("I"), null);
        



        il.append(DUP);
        local.setStart(il.append(new ISTORE(local.getIndex())));
        _left.translate(classGen, methodGen);
        il.append(methodGen.loadDOM());
        local.setEnd(il.append(new ILOAD(local.getIndex())));
        methodGen.removeLocalVariable(local);
      }
      else {
        _left.translate(classGen, methodGen);
      }
    }
    
    int getParent = cpg.addInterfaceMethodref("org.apache.xalan.xsltc.DOM", "getParent", "(I)I");
    

    int getType = cpg.addInterfaceMethodref("org.apache.xalan.xsltc.DOM", "getExpandedTypeID", "(I)I");
    


    InstructionHandle begin = il.append(methodGen.loadDOM());
    il.append(SWAP);
    il.append(new INVOKEINTERFACE(getParent, 2));
    if ((_left instanceof AncestorPattern)) {
      il.append(methodGen.loadDOM());
      il.append(SWAP);
    }
    il.append(new INVOKEINTERFACE(getType, 2));
    il.append(new PUSH(cpg, 9));
    
    BranchHandle skip = il.append(new IF_ICMPEQ(null));
    _falseList.add(il.append(new GOTO_W(null)));
    skip.setTarget(il.append(NOP));
    
    if (_left != null) {
      _left.backPatchTrueList(begin);
      




      if ((_left instanceof AncestorPattern)) {
        AncestorPattern ancestor = (AncestorPattern)_left;
        _falseList.backPatch(ancestor.getLoopHandle());
      }
      _falseList.append(_left._falseList);
    }
  }
  
  public String toString() {
    return "absolutePathPattern(" + (_left != null ? _left.toString() : ")");
  }
}
