package org.apache.xalan.extensions;

import org.apache.xalan.templates.StylesheetRoot;
import org.apache.xpath.ExpressionOwner;
import org.apache.xpath.XPathVisitor;
import org.apache.xpath.functions.FuncExtFunction;
import org.apache.xpath.functions.FuncExtFunctionAvailable;
import org.apache.xpath.functions.Function;



































public class ExpressionVisitor
  extends XPathVisitor
{
  private StylesheetRoot m_sroot;
  
  public ExpressionVisitor(StylesheetRoot sroot)
  {
    m_sroot = sroot;
  }
  








  public boolean visitFunction(ExpressionOwner owner, Function func)
  {
    if ((func instanceof FuncExtFunction))
    {
      String namespace = ((FuncExtFunction)func).getNamespace();
      m_sroot.getExtensionNamespacesManager().registerExtension(namespace);
    }
    else if ((func instanceof FuncExtFunctionAvailable))
    {
      String arg = ((FuncExtFunctionAvailable)func).getArg0().toString();
      if (arg.indexOf(":") > 0)
      {
        String prefix = arg.substring(0, arg.indexOf(":"));
        String namespace = m_sroot.getNamespaceForPrefix(prefix);
        m_sroot.getExtensionNamespacesManager().registerExtension(namespace);
      }
    }
    return true;
  }
}
