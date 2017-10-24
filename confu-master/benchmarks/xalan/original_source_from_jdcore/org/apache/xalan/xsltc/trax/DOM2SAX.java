package org.apache.xalan.xsltc.trax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;
import org.apache.xalan.xsltc.dom.SAXImpl;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;



























public class DOM2SAX
  implements XMLReader, Locator
{
  private static final String EMPTYSTRING = "";
  private static final String XMLNS_PREFIX = "xmlns";
  private Node _dom = null;
  private ContentHandler _sax = null;
  private LexicalHandler _lex = null;
  private SAXImpl _saxImpl = null;
  private Hashtable _nsPrefixes = new Hashtable();
  
  public DOM2SAX(Node root) {
    _dom = root;
  }
  
  public ContentHandler getContentHandler() {
    return _sax;
  }
  
  public void setContentHandler(ContentHandler handler)
    throws NullPointerException
  {
    _sax = handler;
    if ((handler instanceof LexicalHandler)) {
      _lex = ((LexicalHandler)handler);
    }
    
    if ((handler instanceof SAXImpl)) {
      _saxImpl = ((SAXImpl)handler);
    }
  }
  





  private boolean startPrefixMapping(String prefix, String uri)
    throws SAXException
  {
    boolean pushed = true;
    Stack uriStack = (Stack)_nsPrefixes.get(prefix);
    
    if (uriStack != null) {
      if (uriStack.isEmpty()) {
        _sax.startPrefixMapping(prefix, uri);
        uriStack.push(uri);
      }
      else {
        String lastUri = (String)uriStack.peek();
        if (!lastUri.equals(uri)) {
          _sax.startPrefixMapping(prefix, uri);
          uriStack.push(uri);
        }
        else {
          pushed = false;
        }
      }
    }
    else {
      _sax.startPrefixMapping(prefix, uri);
      _nsPrefixes.put(prefix, uriStack = new Stack());
      uriStack.push(uri);
    }
    return pushed;
  }
  




  private void endPrefixMapping(String prefix)
    throws SAXException
  {
    Stack uriStack = (Stack)_nsPrefixes.get(prefix);
    
    if (uriStack != null) {
      _sax.endPrefixMapping(prefix);
      uriStack.pop();
    }
  }
  




  private static String getLocalName(Node node)
  {
    String localName = node.getLocalName();
    
    if (localName == null) {
      String qname = node.getNodeName();
      int col = qname.lastIndexOf(':');
      return col > 0 ? qname.substring(col + 1) : qname;
    }
    return localName;
  }
  
  public void parse(InputSource unused) throws IOException, SAXException {
    parse(_dom);
  }
  
  public void parse() throws IOException, SAXException {
    if (_dom != null) {
      boolean isIncomplete = _dom.getNodeType() != 9;
      

      if (isIncomplete) {
        _sax.startDocument();
        parse(_dom);
        _sax.endDocument();
      }
      else {
        parse(_dom);
      }
    }
  }
  



  private void parse(Node node)
    throws IOException, SAXException
  {
    Node first = null;
    if (node == null) return;
    Node next;
    switch (node.getNodeType())
    {
    case 2: 
    case 5: 
    case 6: 
    case 10: 
    case 11: 
    case 12: 
      break;
    case 4: 
      String cdata = node.getNodeValue();
      if (_lex != null) {
        _lex.startCDATA();
        _sax.characters(cdata.toCharArray(), 0, cdata.length());
        _lex.endCDATA();

      }
      else
      {
        _sax.characters(cdata.toCharArray(), 0, cdata.length());
      }
      break;
    
    case 8: 
      if (_lex != null) {
        String value = node.getNodeValue();
        _lex.comment(value.toCharArray(), 0, value.length()); }
      break;
    
    case 9: 
      _sax.setDocumentLocator(this);
      
      _sax.startDocument();
      next = node.getFirstChild();
      while (next != null) {
        parse(next);
        next = next.getNextSibling();
      }
      _sax.endDocument();
      break;
    

    case 1: 
      List pushedPrefixes = new ArrayList();
      AttributesImpl attrs = new AttributesImpl();
      NamedNodeMap map = node.getAttributes();
      int length = map.getLength();
      

      for (int i = 0; i < length; i++) {
        Node attr = map.item(i);
        String qnameAttr = attr.getNodeName();
        

        if (qnameAttr.startsWith("xmlns")) {
          String uriAttr = attr.getNodeValue();
          int colon = qnameAttr.lastIndexOf(':');
          String prefix = colon > 0 ? qnameAttr.substring(colon + 1) : "";
          if (startPrefixMapping(prefix, uriAttr)) {
            pushedPrefixes.add(prefix);
          }
        }
      }
      

      for (int i = 0; i < length; i++) {
        Node attr = map.item(i);
        String qnameAttr = attr.getNodeName();
        

        if (!qnameAttr.startsWith("xmlns")) {
          String uriAttr = attr.getNamespaceURI();
          String localNameAttr = getLocalName(attr);
          

          if (uriAttr != null) {
            int colon = qnameAttr.lastIndexOf(':');
            String prefix = colon > 0 ? qnameAttr.substring(0, colon) : "";
            if (startPrefixMapping(prefix, uriAttr)) {
              pushedPrefixes.add(prefix);
            }
          }
          

          attrs.addAttribute(attr.getNamespaceURI(), getLocalName(attr), qnameAttr, "CDATA", attr.getNodeValue());
        }
      }
      


      String qname = node.getNodeName();
      String uri = node.getNamespaceURI();
      String localName = getLocalName(node);
      

      if (uri != null) {
        int colon = qname.lastIndexOf(':');
        String prefix = colon > 0 ? qname.substring(0, colon) : "";
        if (startPrefixMapping(prefix, uri)) {
          pushedPrefixes.add(prefix);
        }
      }
      

      if (_saxImpl != null) {
        _saxImpl.startElement(uri, localName, qname, attrs, node);
      }
      else {
        _sax.startElement(uri, localName, qname, attrs);
      }
      

      next = node.getFirstChild();
      while (next != null) {
        parse(next);
        next = next.getNextSibling();
      }
      

      _sax.endElement(uri, localName, qname);
      

      int nPushedPrefixes = pushedPrefixes.size();
      for (int i = 0; i < nPushedPrefixes; i++) {
        endPrefixMapping((String)pushedPrefixes.get(i));
      }
      break;
    
    case 7: 
      _sax.processingInstruction(node.getNodeName(), node.getNodeValue());
      
      break;
    
    case 3: 
      String data = node.getNodeValue();
      _sax.characters(data.toCharArray(), 0, data.length());
    }
    
  }
  



  public DTDHandler getDTDHandler()
  {
    return null;
  }
  



  public ErrorHandler getErrorHandler()
  {
    return null;
  }
  




  public boolean getFeature(String name)
    throws SAXNotRecognizedException, SAXNotSupportedException
  {
    return false;
  }
  




  public void setFeature(String name, boolean value)
    throws SAXNotRecognizedException, SAXNotSupportedException
  {}
  



  public void parse(String sysId)
    throws IOException, SAXException
  {
    throw new IOException("This method is not yet implemented.");
  }
  




  public void setDTDHandler(DTDHandler handler)
    throws NullPointerException
  {}
  




  public void setEntityResolver(EntityResolver resolver)
    throws NullPointerException
  {}
  



  public EntityResolver getEntityResolver()
  {
    return null;
  }
  





  public void setErrorHandler(ErrorHandler handler)
    throws NullPointerException
  {}
  




  public void setProperty(String name, Object value)
    throws SAXNotRecognizedException, SAXNotSupportedException
  {}
  




  public Object getProperty(String name)
    throws SAXNotRecognizedException, SAXNotSupportedException
  {
    return null;
  }
  



  public int getColumnNumber()
  {
    return 0;
  }
  



  public int getLineNumber()
  {
    return 0;
  }
  



  public String getPublicId()
  {
    return null;
  }
  



  public String getSystemId()
  {
    return null;
  }
  
  private String getNodeTypeFromCode(short code)
  {
    String retval = null;
    switch (code) {
    case 2: 
      retval = "ATTRIBUTE_NODE"; break;
    case 4: 
      retval = "CDATA_SECTION_NODE"; break;
    case 8: 
      retval = "COMMENT_NODE"; break;
    case 11: 
      retval = "DOCUMENT_FRAGMENT_NODE"; break;
    case 9: 
      retval = "DOCUMENT_NODE"; break;
    case 10: 
      retval = "DOCUMENT_TYPE_NODE"; break;
    case 1: 
      retval = "ELEMENT_NODE"; break;
    case 6: 
      retval = "ENTITY_NODE"; break;
    case 5: 
      retval = "ENTITY_REFERENCE_NODE"; break;
    case 12: 
      retval = "NOTATION_NODE"; break;
    case 7: 
      retval = "PROCESSING_INSTRUCTION_NODE"; break;
    case 3: 
      retval = "TEXT_NODE";
    }
    return retval;
  }
}
