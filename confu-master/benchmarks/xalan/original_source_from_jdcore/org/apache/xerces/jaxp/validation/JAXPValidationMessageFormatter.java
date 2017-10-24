package org.apache.xerces.jaxp.validation;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

final class JAXPValidationMessageFormatter
{
  JAXPValidationMessageFormatter() {}
  
  public static String formatMessage(Locale paramLocale, String paramString, Object[] paramArrayOfObject)
    throws MissingResourceException
  {
    ResourceBundle localResourceBundle = null;
    if (paramLocale != null) {
      localResourceBundle = ResourceBundle.getBundle("org.apache.xerces.impl.msg.JAXPValidationMessages", paramLocale);
    } else {
      localResourceBundle = ResourceBundle.getBundle("org.apache.xerces.impl.msg.JAXPValidationMessages");
    }
    String str;
    try
    {
      str = localResourceBundle.getString(paramString);
      if (paramArrayOfObject != null) {
        try
        {
          str = MessageFormat.format(str, paramArrayOfObject);
        }
        catch (Exception localException)
        {
          str = localResourceBundle.getString("FormatFailed");
          str = str + " " + localResourceBundle.getString(paramString);
        }
      }
    }
    catch (MissingResourceException localMissingResourceException)
    {
      str = localResourceBundle.getString("BadMessageKey");
      throw new MissingResourceException(paramString, str, paramString);
    }
    if (str == null)
    {
      str = paramString;
      if (paramArrayOfObject.length > 0)
      {
        StringBuffer localStringBuffer = new StringBuffer(str);
        localStringBuffer.append('?');
        for (int i = 0; i < paramArrayOfObject.length; i++)
        {
          if (i > 0) {
            localStringBuffer.append('&');
          }
          localStringBuffer.append(String.valueOf(paramArrayOfObject[i]));
        }
      }
    }
    return str;
  }
}
