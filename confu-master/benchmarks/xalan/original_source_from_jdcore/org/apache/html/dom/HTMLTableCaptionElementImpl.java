package org.apache.html.dom;

import org.apache.xerces.dom.ElementImpl;
import org.w3c.dom.html.HTMLTableCaptionElement;

public class HTMLTableCaptionElementImpl
  extends HTMLElementImpl
  implements HTMLTableCaptionElement
{
  private static final long serialVersionUID = 183703024771848940L;
  
  public String getAlign()
  {
    return getAttribute("align");
  }
  
  public void setAlign(String paramString)
  {
    setAttribute("align", paramString);
  }
  
  public HTMLTableCaptionElementImpl(HTMLDocumentImpl paramHTMLDocumentImpl, String paramString)
  {
    super(paramHTMLDocumentImpl, paramString);
  }
}
