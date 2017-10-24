package org.apache.xalan.xsltc.compiler.util;

import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ILOAD;
import org.apache.bcel.generic.ISTORE;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.Type;

























public final class TestGenerator
  extends MethodGenerator
{
  private static int CONTEXT_NODE_INDEX = 1;
  private static int CURRENT_NODE_INDEX = 4;
  private static int ITERATOR_INDEX = 6;
  
  private Instruction _aloadDom;
  
  private final Instruction _iloadCurrent;
  
  private final Instruction _iloadContext;
  private final Instruction _istoreCurrent;
  private final Instruction _istoreContext;
  private final Instruction _astoreIterator;
  private final Instruction _aloadIterator;
  
  public TestGenerator(int access_flags, Type return_type, Type[] arg_types, String[] arg_names, String method_name, String class_name, InstructionList il, ConstantPoolGen cp)
  {
    super(access_flags, return_type, arg_types, arg_names, method_name, class_name, il, cp);
    

    _iloadCurrent = new ILOAD(CURRENT_NODE_INDEX);
    _istoreCurrent = new ISTORE(CURRENT_NODE_INDEX);
    _iloadContext = new ILOAD(CONTEXT_NODE_INDEX);
    _istoreContext = new ILOAD(CONTEXT_NODE_INDEX);
    _astoreIterator = new ASTORE(ITERATOR_INDEX);
    _aloadIterator = new ALOAD(ITERATOR_INDEX);
  }
  
  public int getHandlerIndex() {
    return -1;
  }
  
  public int getIteratorIndex() {
    return ITERATOR_INDEX;
  }
  
  public void setDomIndex(int domIndex) {
    _aloadDom = new ALOAD(domIndex);
  }
  
  public Instruction loadDOM() {
    return _aloadDom;
  }
  
  public Instruction loadCurrentNode() {
    return _iloadCurrent;
  }
  
  public Instruction loadContextNode()
  {
    return _iloadContext;
  }
  
  public Instruction storeContextNode() {
    return _istoreContext;
  }
  
  public Instruction storeCurrentNode() {
    return _istoreCurrent;
  }
  
  public Instruction storeIterator() {
    return _astoreIterator;
  }
  
  public Instruction loadIterator() {
    return _aloadIterator;
  }
  
  public int getLocalIndex(String name) {
    if (name.equals("current")) {
      return CURRENT_NODE_INDEX;
    }
    
    return super.getLocalIndex(name);
  }
}
