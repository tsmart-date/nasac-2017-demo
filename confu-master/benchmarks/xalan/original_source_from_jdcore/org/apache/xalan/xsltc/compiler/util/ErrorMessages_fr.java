package org.apache.xalan.xsltc.compiler.util;

import java.util.ListResourceBundle;






















































































public class ErrorMessages_fr
  extends ListResourceBundle
{
  public ErrorMessages_fr() {}
  
  public Object[][] getContents()
  {
    return new Object[][] { { "MULTIPLE_STYLESHEET_ERR", "Plusieurs feuilles de style ont été définies dans le même fichier." }, { "TEMPLATE_REDEF_ERR", "Le modèle ''{0}'' est déjà défini dans cette feuille de style." }, { "TEMPLATE_UNDEF_ERR", "Le modèle ''{0}'' n''est pas défini dans cette feuille de style." }, { "VARIABLE_REDEF_ERR", "La variable ''{0}'' est définie plusieurs fois dans la même portée." }, { "VARIABLE_UNDEF_ERR", "La variable ou le paramètre ''{0}'' n''est pas défini." }, { "CLASS_NOT_FOUND_ERR", "La classe ''{0}'' est introuvable." }, { "METHOD_NOT_FOUND_ERR", "La méthode externe ''{0}'' est introuvable (doit être public)." }, { "ARGUMENT_CONVERSION_ERR", "Impossible de convertir le type d''argument/de retour lors de l''appel de la méthode ''{0}''" }, { "FILE_NOT_FOUND_ERR", "Le fichier ou l'' URI ''{0}'' est introuvable." }, { "INVALID_URI_ERR", "URI non valide ''{0}''." }, { "FILE_ACCESS_ERR", "Impossible d''ouvrir le fichier ou l''URI ''{0}''." }, { "MISSING_ROOT_ERR", "L'élément <xsl:stylesheet> ou <xsl:transform> est attendu." }, { "NAMESPACE_UNDEF_ERR", "Le préfixe de l''espace de noms ''{0}'' n''est pas déclaré." }, { "FUNCTION_RESOLVE_ERR", "Impossible de résoudre l''appel à la fonction ''{0}''." }, { "NEED_LITERAL_ERR", "L''argument de ''{0}'' doit être une chaîne littérale." }, { "XPATH_PARSER_ERR", "Erreur lors de l''analyse de l''expression XPath ''{0}''." }, { "REQUIRED_ATTR_ERR", "L''attribut obligatoire ''{0}'' est absent." }, { "ILLEGAL_CHAR_ERR", "Caractère ''{0}'' non conforme dans l''expression XPath." }, { "ILLEGAL_PI_ERR", "Nom ''{0}'' non conforme dans l''instruction de traitement." }, { "STRAY_ATTRIBUTE_ERR", "L''attribut ''{0}'' est à l''extérieur de l''élément." }, { "ILLEGAL_ATTRIBUTE_ERR", "Attribut ''{0}'' non conforme." }, { "CIRCULAR_INCLUDE_ERR", "import/include circulaire. La feuille de style ''{0}'' est déjà chargée." }, { "RESULT_TREE_SORT_ERR", "Tri impossible des fragments de l'arborescence de résultats (les éléments <xsl:sort> sont ignorés). Vous devez trier les noeuds lors de la création de l'arborescence de résultats." }, { "SYMBOLS_REDEF_ERR", "Le formatage décimal ''{0}'' est déjà défini." }, { "XSL_VERSION_ERR", "La version XSL ''{0}'' n''est pas prise en charge par XSLTC." }, { "CIRCULAR_VARIABLE_ERR", "Référence variable/paramètre circulaire dans ''{0}''." }, { "ILLEGAL_BINARY_OP_ERR", "Opérateur inconnu dans une expression binaire." }, { "ILLEGAL_ARG_ERR", "Argument(s) incorrect(s) pour l'appel de fonction." }, { "DOCUMENT_ARG_ERR", "Le deuxième argument de la fonction document() doit être un ensemble de noeuds." }, { "MISSING_WHEN_ERR", "Au moins un élément <xsl:when> est requis dans <xsl:choose>." }, { "MULTIPLE_OTHERWISE_ERR", "Un seul élément <xsl:otherwise> est autorisé dans <xsl:choose>." }, { "STRAY_OTHERWISE_ERR", "<xsl:otherwise> peut être utilisé uniquement dans <xsl:choose>." }, { "STRAY_WHEN_ERR", "<xsl:when> peut être utilisé uniquement dans <xsl:choose>." }, { "WHEN_ELEMENT_ERR", "Seuls les éléments <xsl:when> et <xsl:otherwise> sont autorisés dans <xsl:choose>." }, { "UNNAMED_ATTRIBSET_ERR", "Attribut 'name' absent de <xsl:attribute-set>." }, { "ILLEGAL_CHILD_ERR", "Elément enfant incorrect." }, { "ILLEGAL_ELEM_NAME_ERR", "Vous ne pouvez pas appeler un élément ''{0}''" }, { "ILLEGAL_ATTR_NAME_ERR", "Vous ne pouvez pas appeler un attribut ''{0}''" }, { "ILLEGAL_TEXT_NODE_ERR", "Données textuelles à l'extérieur de l'élément de niveau supérieur <xsl:stylesheet>." }, { "SAX_PARSER_CONFIG_ERR", "L'analyseur JAXP n'est pas configuré correctement" }, { "INTERNAL_ERR", "Erreur interne à XSLTC irrémédiable : ''{0}''" }, { "UNSUPPORTED_XSL_ERR", "Elément XSL non pris en charge ''{0}''." }, { "UNSUPPORTED_EXT_ERR", "Extension XSLTC ''{0}'' non reconnue." }, { "MISSING_XSLT_URI_ERR", "Le document de base n'est pas une feuille de style (l'espace de noms XSL n'est pas déclaré dans l'élément root)." }, { "MISSING_XSLT_TARGET_ERR", "La feuille de style cible ''{0}'' est introuvable." }, { "NOT_IMPLEMENTED_ERR", "Non implémenté : ''{0}''." }, { "NOT_STYLESHEET_ERR", "Le document de base ne contient pas de feuille de style XSL." }, { "ELEMENT_PARSE_ERR", "Impossible d''analyser l''élément ''{0}''" }, { "KEY_USE_ATTR_ERR", "L'attribut use de <key> doit avoir la valeur node, node-set, string ou number." }, { "OUTPUT_VERSION_ERR", "La version du document XML de sortie doit être 1.0" }, { "ILLEGAL_RELAT_OP_ERR", "Opérateur inconnu dans une expression relationnelle." }, { "ATTRIBSET_UNDEF_ERR", "Tentative d''utilisation d''un jeu d''attributs ''{0}'' inexistant." }, { "ATTR_VAL_TEMPLATE_ERR", "Impossible d''analyser le modèle de valeur d''attribut ''{0}''." }, { "UNKNOWN_SIG_TYPE_ERR", "Type de données inconnu dans la signature pour la classe ''{0}''." }, { "DATA_CONVERSION_ERR", "Impossible de convertir le type de données ''{0}'' en ''{1}''." }, { "NO_TRANSLET_CLASS_ERR", "Cette classe Templates ne contient pas de définition de classe translet valide." }, { "NO_MAIN_TRANSLET_ERR", "Cette classe Templates ne contient pas de classe portant le nom ''{0}''." }, { "TRANSLET_CLASS_ERR", "Impossible de charger la classe translet ''{0}''." }, { "TRANSLET_OBJECT_ERR", "La classe translet est chargée, mais il est impossible de créer une instance translet." }, { "ERROR_LISTENER_NULL_ERR", "Tentative de définition de l''élément ErrorListener pour ''{0}'' à une valeur null" }, { "JAXP_UNKNOWN_SOURCE_ERR", "Seuls StreamSource, SAXSource et DOMSource sont pris en charge par XSLTC" }, { "JAXP_NO_SOURCE_ERR", "L''objet source transmis à ''{0}'' est vide." }, { "JAXP_COMPILE_ERR", "Impossible de compiler la feuille de style" }, { "JAXP_INVALID_ATTR_ERR", "TransformerFactory ne reconnaît pas l''attribut ''{0}''." }, { "JAXP_SET_RESULT_ERR", "setResult() doit être appelé avant startDocument()." }, { "JAXP_NO_TRANSLET_ERR", "Transformer ne comporte pas d'objet translet encapsulé." }, { "JAXP_NO_HANDLER_ERR", "Aucun gestionnaire de sortie n'a été défini pour le résultat de la transformation." }, { "JAXP_NO_RESULT_ERR", "L''objet Result object transmis à ''{0}'' n''est pas valide." }, { "JAXP_UNKNOWN_PROP_ERR", "Tentative d''accès à une propriété Transformer non valide ''{0}''." }, { "SAX2DOM_ADAPTER_ERR", "Impossible de créer l''adaptateur SAX2DOM : ''{0}''." }, { "XSLTC_SOURCE_ERR", "Appel de la part de XSLTCSource.build() sans définition d'identification du système." }, { "ER_RESULT_NULL", "Le résultat doit être vide" }, { "JAXP_INVALID_SET_PARAM_VALUE", "La valeur du paramètre {0} doit être un objet Java valide" }, { "COMPILE_STDIN_ERR", "L'option -i doit être utilisée avec l'option -o." }, { "COMPILE_USAGE_STR", "SYNOPSIS\n   java org.apache.xalan.xsltc.cmdline.Compile [-o <sortie>]\n      [-d <répertoire>] [-j <fichierjar>] [-p <package>]\n      [-n] [-x] [-u] [-v] [-h] { <feuille_de_style> | -i }\n\nOPTIONS\n   -o <sortie>    attribue le nom <sortie> au translet\n                  généré. Par défaut, le nom du translet est\n                  dérivé du nom <feuille_de_style>.  Cette option\n                  est ignorée si plusieurs feuilles de style sont compilées.\n   -d <répertoire> spécifie un répertoire de destination pour translet\n   -j <fichier_jar>   rassemble les classes translet dans le fichier \n       <fichier_jar>\n   -p <module>   spécifie un préfixe de nom de module pour toutes les classes\n              translet générées.\n   -n             active la mise en ligne de modèle (comportement par défaut - préférable \n                  on en moyenne).\n   -x             active le débogage supplémentaire de sortie de message\n   -u             interprète les arguments <feuille_de_style> comme des adresses URL\n   -i             force le compilateur à lire la feuille de style dans stdin\n   -v             imprime la version du compilateur\n   -h             imprime cette instruction de syntaxe\n" }, { "TRANSFORM_USAGE_STR", "SYNOPSIS \n   java org.apache.xalan.xsltc.cmdline.Transform [-j <fichierjar>]\n      [-x] [-n <itérations>] {-u <url_document> | <document>}\n    <classe> [<param1>=<valeur1> ...]\n\n   utilise la <classe> translet pour transformer un document XML \n   défini comme <document>. La <classe> translet se trouve dans la\n   fonction CLASSPATH de l'utilisateur ou dans le <fichier_jar> indiqué en option.\nOPTIONS\n   -j <fichierjar>    spécifie un fichier jar à partir duquel charger le translet\n   -x              active le débogage supplémentaire de sortie de message\n   -n <itérations> exécute la transformation <itérations> fois et\n                   affiche des informations de profil\n   -u <url_document> définit le document d'entrée XML comme une URL\n" }, { "STRAY_SORT_ERR", "<xsl:sort> peut être utilisé uniquement dans <xsl:for-each> ou <xsl:apply-templates>." }, { "UNSUPPORTED_ENCODING", "Le codage de sortie ''{0}'' n''est pas pris en charge dans cette JVM." }, { "SYNTAX_ERR", "Erreur de syntaxe dans ''{0}''." }, { "CONSTRUCTOR_NOT_FOUND", "Impossible de trouver le constructeur externe ''{0}''." }, { "NO_JAVA_FUNCT_THIS_REF", "Le premier argument de la fonction Java non static ''{0}'' n''est pas une référence d''objet valide." }, { "TYPE_CHECK_ERR", "Erreur lors de la vérification du type de l''expression ''{0}''." }, { "TYPE_CHECK_UNK_LOC_ERR", "Erreur de contrôle du type d'une expression se trouvant dans un emplacement inconnu." }, { "ILLEGAL_CMDLINE_OPTION_ERR", "L''option de ligne de commande ''{0}'' n''est pas valide." }, { "CMDLINE_OPT_MISSING_ARG_ERR", "Un argument obligatoire est absent de l''option de ligne de commande ''{0}''." }, { "WARNING_PLUS_WRAPPED_MSG", "AVERTISSEMENT :  ''{0}''\n       :{1}" }, { "WARNING_MSG", "AVERTISSEMENT :  ''{0}''" }, { "FATAL_ERR_PLUS_WRAPPED_MSG", "ERREUR BLOQUANTE :  ''{0}''\n           :{1}" }, { "FATAL_ERR_MSG", "ERREUR BLOQUANTE :  ''{0}''" }, { "ERROR_PLUS_WRAPPED_MSG", "ERREUR :  ''{0}''\n     :{1}" }, { "ERROR_MSG", "ERREUR :  ''{0}''" }, { "TRANSFORM_WITH_TRANSLET_STR", "Transformation à l''aide du translet ''{0}'' " }, { "TRANSFORM_WITH_JAR_STR", "Transformation à l''aide du translet ''{0}'' à partir du fichier jar ''{1}''" }, { "COULD_NOT_CREATE_TRANS_FACT", "Impossible de créer une instance de la classe TransformerFactory ''{0}''." }, { "TRANSLET_NAME_JAVA_CONFLICT", "Le nom ''{0}'' ne peut pas être utilisé pour la classe translet du fait qu''elle contient des caractères qui ne sont pas admis dans le nom d''une classe Java. Le nom ''{1}'' a été utilisé à la place." }, { "COMPILER_ERROR_KEY", "Erreurs de compilation :" }, { "COMPILER_WARNING_KEY", "Avertissements de compilation :" }, { "RUNTIME_ERROR_KEY", "Erreurs de translet :" }, { "INVALID_QNAME_ERR", "Un attribut dont la valeur doit être un QName ou une liste de QName délimitée par des espaces possède la valeur ''{0}''" }, { "INVALID_NCNAME_ERR", "Un attribut dont la valeur doit être un NCName possède la valeur ''{0}''" }, { "INVALID_METHOD_IN_OUTPUT", "L''attribut method d''un élément <xsl:output> possède la valeur ''{0}''. La valeur doit être ''xml'', ''html'', ''text'' ou qname-but-not-ncname" }, { "JAXP_GET_FEATURE_NULL_NAME", "Le nom de la fonction ne peut pas avoir une valeur null dans TransformerFactory.getFeature (nom chaîne)." }, { "JAXP_SET_FEATURE_NULL_NAME", "Le nom de la fonction ne peut pas avoir la valeur null dans TransformerFactory.setFeature (nom chaîne, valeur boolénne)." }, { "JAXP_UNSUPPORTED_FEATURE", "Impossible de définir la fonction ''{0}'' sur cet élément TransformerFactory." } };
  }
}
