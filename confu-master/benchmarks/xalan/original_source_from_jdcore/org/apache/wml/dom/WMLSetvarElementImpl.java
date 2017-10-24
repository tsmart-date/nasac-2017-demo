package org.apache.wml.dom;

import org.apache.wml.WMLSetvarElement;
import org.apache.xerces.dom.ElementImpl;

public class WMLSetvarElementImpl
  extends WMLElementImpl
  implements WMLSetvarElement
{
  private static final long serialVersionUID = -1944519734782236471L;
  
  public WMLSetvarElementImpl(WMLDocumentImpl paramWMLDocumentImpl, String paramString)
  {
    super(paramWMLDocumentImpl, paramString);
  }
  
  public void setValue(String paramString)
  {
    setAttribute("value", paramString);
  }
  
  public String getValue()
  {
    return getAttribute("value");
  }
  
  public void setClassName(String paramString)
  {
    setAttribute("class", paramString);
  }
  
  public String getClassName()
  {
    return getAttribute("class");
  }
  
  public void setId(String paramString)
  {
    setAttribute("id", paramString);
  }
  
  public String getId()
  {
    return getAttribute("id");
  }
  
  public void setName(String paramString)
  {
    setAttribute("name", paramString);
  }
  
  public String getName()
  {
    return getAttribute("name");
  }
}
