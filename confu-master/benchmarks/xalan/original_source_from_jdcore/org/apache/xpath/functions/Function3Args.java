package org.apache.xpath.functions;

import java.util.Vector;
import org.apache.xalan.res.XSLMessages;
import org.apache.xpath.Expression;
import org.apache.xpath.ExpressionOwner;
import org.apache.xpath.XPathVisitor;






























public class Function3Args
  extends Function2Args
{
  static final long serialVersionUID = 7915240747161506646L;
  Expression m_arg2;
  
  public Function3Args() {}
  
  public Expression getArg2()
  {
    return m_arg2;
  }
  










  public void fixupVariables(Vector vars, int globalsSize)
  {
    super.fixupVariables(vars, globalsSize);
    if (null != m_arg2) {
      m_arg2.fixupVariables(vars, globalsSize);
    }
  }
  









  public void setArg(Expression arg, int argNum)
    throws WrongNumberArgsException
  {
    if (argNum < 2) {
      super.setArg(arg, argNum);
    } else if (2 == argNum)
    {
      m_arg2 = arg;
      arg.exprSetParent(this);
    }
    else {
      reportWrongNumberArgs();
    }
  }
  






  public void checkNumberArgs(int argNum)
    throws WrongNumberArgsException
  {
    if (argNum != 3) {
      reportWrongNumberArgs();
    }
  }
  



  protected void reportWrongNumberArgs()
    throws WrongNumberArgsException
  {
    throw new WrongNumberArgsException(XSLMessages.createXPATHMessage("three", null));
  }
  






  public boolean canTraverseOutsideSubtree()
  {
    return super.canTraverseOutsideSubtree() ? true : m_arg2.canTraverseOutsideSubtree();
  }
  

  class Arg2Owner
    implements ExpressionOwner
  {
    Arg2Owner() {}
    
    public Expression getExpression()
    {
      return m_arg2;
    }
    




    public void setExpression(Expression exp)
    {
      exp.exprSetParent(Function3Args.this);
      m_arg2 = exp;
    }
  }
  




  public void callArgVisitors(XPathVisitor visitor)
  {
    super.callArgVisitors(visitor);
    if (null != m_arg2) {
      m_arg2.callVisitors(new Arg2Owner(), visitor);
    }
  }
  


  public boolean deepEquals(Expression expr)
  {
    if (!super.deepEquals(expr)) {
      return false;
    }
    if (null != m_arg2)
    {
      if (null == m_arg2) {
        return false;
      }
      if (!m_arg2.deepEquals(m_arg2)) {
        return false;
      }
    } else if (null != m_arg2) {
      return false;
    }
    return true;
  }
}
