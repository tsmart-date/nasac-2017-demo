package org.apache.xalan.transformer;

import javax.xml.transform.TransformerException;
import org.apache.xalan.res.XSLMessages;
import org.apache.xalan.templates.ElemTemplate;
import org.apache.xalan.templates.ElemTemplateElement;
import org.apache.xml.utils.ObjectStack;
import org.apache.xml.utils.QName;
import org.apache.xpath.XPath;


































public class StackGuard
{
  private int m_recursionLimit = -1;
  






  TransformerImpl m_transformer;
  






  public int getRecursionLimit()
  {
    return m_recursionLimit;
  }
  












  public void setRecursionLimit(int limit)
  {
    m_recursionLimit = limit;
  }
  




  public StackGuard(TransformerImpl transformerImpl)
  {
    m_transformer = transformerImpl;
  }
  




  public int countLikeTemplates(ElemTemplate templ, int pos)
  {
    ObjectStack elems = m_transformer.getCurrentTemplateElements();
    int count = 1;
    for (int i = pos - 1; i >= 0; i--)
    {
      if ((ElemTemplateElement)elems.elementAt(i) == templ) {
        count++;
      }
    }
    return count;
  }
  








  private ElemTemplate getNextMatchOrNamedTemplate(int pos)
  {
    ObjectStack elems = m_transformer.getCurrentTemplateElements();
    for (int i = pos; i >= 0; i--)
    {
      ElemTemplateElement elem = (ElemTemplateElement)elems.elementAt(i);
      if (null != elem)
      {
        if (elem.getXSLToken() == 19)
        {
          return (ElemTemplate)elem;
        }
      }
    }
    return null;
  }
  




  public void checkForInfinateLoop()
    throws TransformerException
  {
    int nTemplates = m_transformer.getCurrentTemplateElementsCount();
    if (nTemplates < m_recursionLimit) {
      return;
    }
    if (m_recursionLimit <= 0) {
      return;
    }
    

    for (int i = nTemplates - 1; i >= m_recursionLimit; i--)
    {
      ElemTemplate template = getNextMatchOrNamedTemplate(i);
      
      if (null == template) {
        break;
      }
      int loopCount = countLikeTemplates(template, i);
      
      if (loopCount >= m_recursionLimit)
      {





        String idIs = XSLMessages.createMessage(null != template.getName() ? "nameIs" : "matchPatternIs", null);
        Object[] msgArgs = { new Integer(loopCount), idIs, null != template.getName() ? template.getName().toString() : template.getMatch().getPatternString() };
        

        String msg = XSLMessages.createMessage("recursionTooDeep", msgArgs);
        
        throw new TransformerException(msg);
      }
    }
  }
}