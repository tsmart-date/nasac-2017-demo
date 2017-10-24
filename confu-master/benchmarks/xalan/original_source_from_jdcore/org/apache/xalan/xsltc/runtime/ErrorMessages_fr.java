package org.apache.xalan.xsltc.runtime;

import java.util.ListResourceBundle;













































































public class ErrorMessages_fr
  extends ListResourceBundle
{
  public ErrorMessages_fr() {}
  
  public Object[][] getContents()
  {
    return new Object[][] { { "RUN_TIME_INTERNAL_ERR", "Erreur interne d''exécution dans ''{0}''" }, { "RUN_TIME_COPY_ERR", "Erreur d'exécution de <xsl:copy>." }, { "DATA_CONVERSION_ERR", "Conversion non valide de ''{0}'' en ''{1}''." }, { "EXTERNAL_FUNC_ERR", "Fonction externe ''{0}'' non prise en charge par XSLTC." }, { "EQUALITY_EXPR_ERR", "Type d'argument inconnu dans l'expression d'égalité." }, { "INVALID_ARGUMENT_ERR", "Type d''argument non valide ''{0}'' lors de l''appel de ''{1}''" }, { "FORMAT_NUMBER_ERR", "Tentative de formatage du nombre ''{0}'' à l''aide du motif ''{1}''." }, { "ITERATOR_CLONE_ERR", "Clonage impossible de l''itérateur ''{0}''." }, { "AXIS_SUPPORT_ERR", "Itérateur de l''axe ''{0}'' non pris en charge." }, { "TYPED_AXIS_SUPPORT_ERR", "Itérateur de l''axe indiqué ''{0}'' non pris en charge." }, { "STRAY_ATTRIBUTE_ERR", "L''attribut ''{0}'' est à l''extérieur de l''élément." }, { "STRAY_NAMESPACE_ERR", "La déclaration d''espace de noms ''{0}''=''{1}'' est à l''extérieur de l''élément." }, { "NAMESPACE_PREFIX_ERR", "L''espace de noms du préfixe ''{0}'' n''a pas été déclaré." }, { "DOM_ADAPTER_INIT_ERR", "DOMAdapter a été créé avec un type incorrect de source de DOM." }, { "PARSER_DTD_SUPPORT_ERR", "L'analyseur SAX que vous utilisez ne traite pas les événements de déclaration DTD." }, { "NAMESPACES_SUPPORT_ERR", "L'analyseur SAX que vous utilisez ne prend pas en charge les espaces de nom XML." }, { "CANT_RESOLVE_RELATIVE_URI_ERR", "Résolution impossible de la référence de l''URI ''{0}''." }, { "UNSUPPORTED_XSL_ERR", "Elément XSL non pris en charge ''{0}''" }, { "UNSUPPORTED_EXT_ERR", "Extension XSLTC non reconnue ''{0}''" }, { "UNKNOWN_TRANSLET_VERSION_ERR", "La classe translet indiquée, ''{0}'', a été créée à l''aide d''une version de XSLTC plus récente que la version de l''exécutable XSLTC utilisée. Vous devez compiler à nouveau la feuille de style ou utiliser une version plus récente pour exécuter la classe translet." }, { "INVALID_QNAME_ERR", "Un attribut dont la valeur doit être un QName possède la valeur ''{0}''" }, { "INVALID_NCNAME_ERR", "Un attribut dont la valeur doit être un NCName possède la valeur ''{0}''" }, { "UNALLOWED_EXTENSION_FUNCTION_ERR", "L''utilisation de la fonction d''extension ''{0}'' n''est pas admise lorsque la fonction de traitement sécurisée a la valeur true." }, { "UNALLOWED_EXTENSION_ELEMENT_ERR", "L''utilisation de l''élément d''extension ''{0}'' n''est pas admise lorsque la fonction de traitement sécurisée a la valeur true." } };
  }
}
