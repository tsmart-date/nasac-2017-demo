package org.apache.xalan.trace;

import java.lang.reflect.Method;
import java.util.TooManyListenersException;
import java.util.Vector;
import javax.xml.transform.TransformerException;
import org.apache.xalan.templates.ElemTemplateElement;
import org.apache.xalan.transformer.TransformerImpl;
import org.apache.xml.dtm.DTM;
import org.apache.xpath.XPath;
import org.apache.xpath.XPathContext;
import org.apache.xpath.objects.XObject;
import org.w3c.dom.Node;






























public class TraceManager
{
  private TransformerImpl m_transformer;
  
  public TraceManager(TransformerImpl transformer)
  {
    m_transformer = transformer;
  }
  




  private Vector m_traceListeners = null;
  







  public void addTraceListener(TraceListener tl)
    throws TooManyListenersException
  {
    m_transformer.setDebug(true);
    
    if (null == m_traceListeners) {
      m_traceListeners = new Vector();
    }
    m_traceListeners.addElement(tl);
  }
  





  public void removeTraceListener(TraceListener tl)
  {
    if (null != m_traceListeners)
    {
      m_traceListeners.removeElement(tl);
      



      if (0 == m_traceListeners.size()) { m_traceListeners = null;
      }
    }
  }
  





  public void fireGenerateEvent(GenerateEvent te)
  {
    if (null != m_traceListeners)
    {
      int nListeners = m_traceListeners.size();
      
      for (int i = 0; i < nListeners; i++)
      {
        TraceListener tl = (TraceListener)m_traceListeners.elementAt(i);
        
        tl.generated(te);
      }
    }
  }
  





  public boolean hasTraceListeners()
  {
    return null != m_traceListeners;
  }
  






  public void fireTraceEvent(ElemTemplateElement styleNode)
  {
    if (hasTraceListeners())
    {
      int sourceNode = m_transformer.getXPathContext().getCurrentNode();
      Node source = getDOMNodeFromDTM(sourceNode);
      
      fireTraceEvent(new TracerEvent(m_transformer, source, m_transformer.getMode(), styleNode));
    }
  }
  









  public void fireTraceEndEvent(ElemTemplateElement styleNode)
  {
    if (hasTraceListeners())
    {
      int sourceNode = m_transformer.getXPathContext().getCurrentNode();
      Node source = getDOMNodeFromDTM(sourceNode);
      
      fireTraceEndEvent(new TracerEvent(m_transformer, source, m_transformer.getMode(), styleNode));
    }
  }
  








  public void fireTraceEndEvent(TracerEvent te)
  {
    if (hasTraceListeners())
    {
      int nListeners = m_traceListeners.size();
      
      for (int i = 0; i < nListeners; i++)
      {
        TraceListener tl = (TraceListener)m_traceListeners.elementAt(i);
        if ((tl instanceof TraceListenerEx2))
        {
          ((TraceListenerEx2)tl).traceEnd(te);
        }
      }
    }
  }
  








  public void fireTraceEvent(TracerEvent te)
  {
    if (hasTraceListeners())
    {
      int nListeners = m_traceListeners.size();
      
      for (int i = 0; i < nListeners; i++)
      {
        TraceListener tl = (TraceListener)m_traceListeners.elementAt(i);
        
        tl.trace(te);
      }
    }
  }
  














  public void fireSelectedEvent(int sourceNode, ElemTemplateElement styleNode, String attributeName, XPath xpath, XObject selection)
    throws TransformerException
  {
    if (hasTraceListeners())
    {
      Node source = getDOMNodeFromDTM(sourceNode);
      
      fireSelectedEvent(new SelectionEvent(m_transformer, source, styleNode, attributeName, xpath, selection));
    }
  }
  















  public void fireSelectedEndEvent(int sourceNode, ElemTemplateElement styleNode, String attributeName, XPath xpath, XObject selection)
    throws TransformerException
  {
    if (hasTraceListeners())
    {
      Node source = getDOMNodeFromDTM(sourceNode);
      
      fireSelectedEndEvent(new EndSelectionEvent(m_transformer, source, styleNode, attributeName, xpath, selection));
    }
  }
  









  public void fireSelectedEndEvent(EndSelectionEvent se)
    throws TransformerException
  {
    if (hasTraceListeners())
    {
      int nListeners = m_traceListeners.size();
      
      for (int i = 0; i < nListeners; i++)
      {
        TraceListener tl = (TraceListener)m_traceListeners.elementAt(i);
        
        if ((tl instanceof TraceListenerEx)) {
          ((TraceListenerEx)tl).selectEnd(se);
        }
      }
    }
  }
  







  public void fireSelectedEvent(SelectionEvent se)
    throws TransformerException
  {
    if (hasTraceListeners())
    {
      int nListeners = m_traceListeners.size();
      
      for (int i = 0; i < nListeners; i++)
      {
        TraceListener tl = (TraceListener)m_traceListeners.elementAt(i);
        
        tl.selected(se);
      }
    }
  }
  










  public void fireExtensionEndEvent(Method method, Object instance, Object[] arguments)
  {
    ExtensionEvent ee = new ExtensionEvent(m_transformer, method, instance, arguments);
    
    if (hasTraceListeners())
    {
      int nListeners = m_traceListeners.size();
      
      for (int i = 0; i < nListeners; i++)
      {
        TraceListener tl = (TraceListener)m_traceListeners.elementAt(i);
        if ((tl instanceof TraceListenerEx3))
        {
          ((TraceListenerEx3)tl).extensionEnd(ee);
        }
      }
    }
  }
  









  public void fireExtensionEvent(Method method, Object instance, Object[] arguments)
  {
    ExtensionEvent ee = new ExtensionEvent(m_transformer, method, instance, arguments);
    
    if (hasTraceListeners())
    {
      int nListeners = m_traceListeners.size();
      
      for (int i = 0; i < nListeners; i++)
      {
        TraceListener tl = (TraceListener)m_traceListeners.elementAt(i);
        if ((tl instanceof TraceListenerEx3))
        {
          ((TraceListenerEx3)tl).extension(ee);
        }
      }
    }
  }
  







  public void fireExtensionEndEvent(ExtensionEvent ee)
  {
    if (hasTraceListeners())
    {
      int nListeners = m_traceListeners.size();
      
      for (int i = 0; i < nListeners; i++)
      {
        TraceListener tl = (TraceListener)m_traceListeners.elementAt(i);
        if ((tl instanceof TraceListenerEx3))
        {
          ((TraceListenerEx3)tl).extensionEnd(ee);
        }
      }
    }
  }
  








  public void fireExtensionEvent(ExtensionEvent ee)
  {
    if (hasTraceListeners())
    {
      int nListeners = m_traceListeners.size();
      
      for (int i = 0; i < nListeners; i++)
      {
        TraceListener tl = (TraceListener)m_traceListeners.elementAt(i);
        if ((tl instanceof TraceListenerEx3))
        {
          ((TraceListenerEx3)tl).extension(ee);
        }
      }
    }
  }
  



  private Node getDOMNodeFromDTM(int sourceNode)
  {
    DTM dtm = m_transformer.getXPathContext().getDTM(sourceNode);
    Node source = dtm == null ? null : dtm.getNode(sourceNode);
    return source;
  }
}
