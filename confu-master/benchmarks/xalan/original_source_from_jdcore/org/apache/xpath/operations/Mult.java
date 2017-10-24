package org.apache.xpath.operations;

import javax.xml.transform.TransformerException;
import org.apache.xpath.Expression;
import org.apache.xpath.XPathContext;
import org.apache.xpath.objects.XNumber;
import org.apache.xpath.objects.XObject;






























public class Mult
  extends Operation
{
  static final long serialVersionUID = -4956770147013414675L;
  
  public Mult() {}
  
  public XObject operate(XObject left, XObject right)
    throws TransformerException
  {
    return new XNumber(left.num() * right.num());
  }
  









  public double num(XPathContext xctxt)
    throws TransformerException
  {
    return m_left.num(xctxt) * m_right.num(xctxt);
  }
}
