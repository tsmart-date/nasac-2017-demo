package org.apache.xalan.xsltc.compiler.util;

import java.util.ListResourceBundle;






















































































public class ErrorMessages_de
  extends ListResourceBundle
{
  public ErrorMessages_de() {}
  
  public Object[][] getContents()
  {
    return new Object[][] { { "MULTIPLE_STYLESHEET_ERR", "In einer Datei sind mehrere Formatvorlagen definiert." }, { "TEMPLATE_REDEF_ERR", "Vorlage ''{0}'' ist in dieser Formatvorlage bereits definiert." }, { "TEMPLATE_UNDEF_ERR", "Vorlage ''{0}'' ist in dieser Formatvorlage nicht definiert." }, { "VARIABLE_REDEF_ERR", "Variable ''{0}'' ist in einem Bereich mehrmals definiert." }, { "VARIABLE_UNDEF_ERR", "Variable oder Parameter ''{0}'' ist nicht definiert." }, { "CLASS_NOT_FOUND_ERR", "Klasse ''{0}'' wurde nicht gefunden." }, { "METHOD_NOT_FOUND_ERR", "Die externe Methode ''{0}'' wurde nicht gefunden (muss ''public'' sein)." }, { "ARGUMENT_CONVERSION_ERR", "Argument-/Rückgabetyp in Aufruf kann nicht in Methode ''{0}'' konvertiert werden." }, { "FILE_NOT_FOUND_ERR", "Datei oder URI ''{0}'' wurde nicht gefunden." }, { "INVALID_URI_ERR", "Ungültiger URI ''{0}''." }, { "FILE_ACCESS_ERR", "Datei oder URI ''{0}'' kann nicht geöffnet werden." }, { "MISSING_ROOT_ERR", "<xsl:stylesheet>- oder <xsl:transform>-Element erwartet." }, { "NAMESPACE_UNDEF_ERR", "Namensbereichspräfix ''{0}'' ist nicht deklariert." }, { "FUNCTION_RESOLVE_ERR", "Aufruf für Funktion ''{0}'' kann nicht aufgelöst werden." }, { "NEED_LITERAL_ERR", "Argument für ''{0}'' muss eine Literalzeichenfolge sein." }, { "XPATH_PARSER_ERR", "Fehler bei Syntaxanalyse des XPath-Ausdrucks ''{0}''." }, { "REQUIRED_ATTR_ERR", "Erforderliches Attribut ''{0}'' fehlt." }, { "ILLEGAL_CHAR_ERR", "Unzulässiges Zeichen ''{0}'' in XPath-Ausdruck." }, { "ILLEGAL_PI_ERR", "Unzulässiger Name ''{0}'' für Verarbeitungsanweisung." }, { "STRAY_ATTRIBUTE_ERR", "Attribut ''{0}'' befindet sich nicht in einem Element." }, { "ILLEGAL_ATTRIBUTE_ERR", "Unzulässiges Attribut ''{0}''." }, { "CIRCULAR_INCLUDE_ERR", "Schleife bei ''import''/''include''. Formatvorlage ''{0}'' ist bereits geladen." }, { "RESULT_TREE_SORT_ERR", "Ergebnisbaumfragmente können nicht sortiert werden (<xsl:sort>-Elemente werden ignoriert). Sie müssen die Knoten sortieren, wenn Sie den Ergebnisbaum erstellen." }, { "SYMBOLS_REDEF_ERR", "Dezimalformatierung ''{0}'' ist bereits definiert." }, { "XSL_VERSION_ERR", "XSL-Version ''{0}'' wird von XSLTC nicht unterstützt." }, { "CIRCULAR_VARIABLE_ERR", "Rückwirkender Variablen-/Parameterverweis in ''{0}''." }, { "ILLEGAL_BINARY_OP_ERR", "Unbekannter Operator für Binärausdruck." }, { "ILLEGAL_ARG_ERR", "Unzulässige(s) Argument(e) für Funktionsaufruf." }, { "DOCUMENT_ARG_ERR", "Zweites Argument für document()-Funktion muss eine Knotengruppe sein." }, { "MISSING_WHEN_ERR", "Es ist mindestens ein <xsl:when>-Element in <xsl:choose> erforderlich." }, { "MULTIPLE_OTHERWISE_ERR", "Es ist nur ein <xsl:otherwise>-Element in <xsl:choose> zulässig." }, { "STRAY_OTHERWISE_ERR", "<xsl:otherwise> kann nur in <xsl:choose> verwendet werden." }, { "STRAY_WHEN_ERR", "<xsl:when> kann nur in <xsl:choose> verwendet werden." }, { "WHEN_ELEMENT_ERR", "In <xsl:choose> sind nur <xsl:when>- und <xsl:otherwise>-Elemente zulässig." }, { "UNNAMED_ATTRIBSET_ERR", "Das Attribut 'name' fehlt für <xsl:attribute-set>." }, { "ILLEGAL_CHILD_ERR", "Zulässiges Kindelement." }, { "ILLEGAL_ELEM_NAME_ERR", "Sie können ein Element nicht ''{0}'' nennen." }, { "ILLEGAL_ATTR_NAME_ERR", "Sie können ein Attribut nicht ''{0}'' nennen." }, { "ILLEGAL_TEXT_NODE_ERR", "Textdaten außerhalb von <xsl:stylesheet>-Element der höchsten Ebene." }, { "SAX_PARSER_CONFIG_ERR", "JAXP-Parser ist nicht richtig konfiguriert." }, { "INTERNAL_ERR", "Nicht behebbarer XSLTC-interner Fehler: ''{0}'' " }, { "UNSUPPORTED_XSL_ERR", "Nicht unterstütztes XSL-Element ''{0}''." }, { "UNSUPPORTED_EXT_ERR", "Nicht erkannte XSLTC-Erweiterung ''{0}''." }, { "MISSING_XSLT_URI_ERR", "Das Eingabedokument ist keine Formatvorlage (der XSL-Namensbereich wird nicht im Stammelement deklariert)." }, { "MISSING_XSLT_TARGET_ERR", "Das Formatvorlagenziel ''{0}'' wurde nicht gefunden." }, { "NOT_IMPLEMENTED_ERR", "Nicht implementiert: ''{0}''." }, { "NOT_STYLESHEET_ERR", "Das Eingabedokument enthält keine XSL-Formatvorlage." }, { "ELEMENT_PARSE_ERR", "Element ''{0}'' konnte nicht syntaktisch analysiert werden." }, { "KEY_USE_ATTR_ERR", "Das Attribut 'use' von <key> muss 'node', 'node-set', 'string' oder 'number' sein." }, { "OUTPUT_VERSION_ERR", "Die Version des XML-Ausgabedokuments sollte 1.0 sein." }, { "ILLEGAL_RELAT_OP_ERR", "Unbekannter Operator für Vergleichsausdruck." }, { "ATTRIBSET_UNDEF_ERR", "Es wird versucht, die nicht vorhandene Attributgruppe ''{0}'' zu verwenden." }, { "ATTR_VAL_TEMPLATE_ERR", "Die Attributwertvorlage ''{0}'' kann nicht syntaktisch analysiert werden." }, { "UNKNOWN_SIG_TYPE_ERR", "Unbekannter Datentyp in Signatur für Klasse ''{0}''." }, { "DATA_CONVERSION_ERR", "Datentyp ''{0}'' kann nicht in ''{1}'' konvertiert werden." }, { "NO_TRANSLET_CLASS_ERR", "Diese Klasse 'Templates' enthält keine gültige Translet-Klassendefinition." }, { "NO_MAIN_TRANSLET_ERR", "Diese Klasse ''Templates'' enthält keine Klasse mit dem Namen ''{0}''." }, { "TRANSLET_CLASS_ERR", "Die Transletklasse ''{0}'' konnte nicht geladen werden." }, { "TRANSLET_OBJECT_ERR", "Die Translet-Klasse wurde geladen, es kann jedoch keine Translet-Instanz erstellt werden." }, { "ERROR_LISTENER_NULL_ERR", "Es wird versucht, ErrorListener für ''{0}'' auf null zu setzen." }, { "JAXP_UNKNOWN_SOURCE_ERR", "Nur StreamSource, SAXSource und DOMSource werden von XSLTC unterstützt." }, { "JAXP_NO_SOURCE_ERR", "Das Source-Objekt, das an ''{0}'' übergeben wurde, hat keinen Inhalt." }, { "JAXP_COMPILE_ERR", "Die Formatvorlage konnte nicht kompiliert werden." }, { "JAXP_INVALID_ATTR_ERR", "TransformerFactory erkennt Attribut ''{0}'' nicht." }, { "JAXP_SET_RESULT_ERR", "setResult() muss vor startDocument() aufgerufen werden." }, { "JAXP_NO_TRANSLET_ERR", "Transformer hat kein eingebundenes Translet-Objekt." }, { "JAXP_NO_HANDLER_ERR", "Es ist keine Ausgabesteuerroutine für die Umsetzungsergebnisse definiert." }, { "JAXP_NO_RESULT_ERR", "Das Result-Objekt, das an ''{0}'' übergeben wurde, ist ungültig." }, { "JAXP_UNKNOWN_PROP_ERR", "Es wird versucht, auf das ungültige Transformer-Merkmal ''{0}'' zuzugreifen." }, { "SAX2DOM_ADAPTER_ERR", "Der SAX2DOM-Adapter konnte nicht erstellt werden: ''{0}''." }, { "XSLTC_SOURCE_ERR", "XSLTCSource.build() wurde aufgerufen, ohne dass die System-ID gesetzt war." }, { "ER_RESULT_NULL", "Das Ergebnis darf nicht Null sein." }, { "JAXP_INVALID_SET_PARAM_VALUE", "Der Wert für Parameter {0} muss ein gültiges Java-Objekt sein." }, { "COMPILE_STDIN_ERR", "Die Option -i muss mit der Option -o verwendet werden." }, { "COMPILE_USAGE_STR", "SYNOPSIS\n   java org.apache.xalan.xsltc.cmdline.Compile [-o <Ausgabe>]\n      [-d <Verzeichnis>] [-j <jarDatei>] [-p <Paket>]\n      [-n] [-x] [-u] [-v] [-h] { <Formatvorlage> | -i }\n\nOPTIONEN\n   -o <Ausgabe>    Ordnet dem generierten Translet den Namen <Ausgabe> zu.\n Der Translet-Name wird standardmäßig\n                 von dem Namen von <formatvorlage> abgeleitet. Diese Option\n                  wird ignoriert, wenn mehrere Formatvorlagen kompiliert werden. \n      -d <verzeichnis> Gibt ein Zielverzeichnis für Translet an.\n   -j <jardatei>   Packt Translet-Klassen in eine jar-Datei mit dem\n                  Namen, der für <jardatei> angegeben wurde.\n   -p <paket>   Gibt ein Paketnamenpräfix für alle\n                   generierten Translet-Klassen an.\n   -n             Aktiviert Inline-Anordnung von Vorlagen (Standardverhalten \n                  durchschnittlich besser).\n   -x             Aktiviert zusätzliche Debugnachrichtenausgabe.\n   -u             Interpretiert Argumente <Formatvorlage> als URLs.\n   -i             Erzwingt, dass der Compiler die Formatvorlage aus der Standardeingabe liest.\n   -v             Gibt die Version des Compilers aus.\n   -h             Gibt diese Syntaxanweisung aus.\n" }, { "TRANSFORM_USAGE_STR", "SYNTAX \n   java org.apache.xalan.xsltc.cmdline.Transform [-j <JAR-Datei>]\n      [-x] [-n <Iterationen>] {-u <Dokument-URL> | <Dokument>}\n      <Klasse> [<Param1>=<Wert1> ...]\n\n   Verwendet die <Klasse> von Translet, um ein  XML-Dokument umzusetzen,\n   das als <Dokument> angegeben wurde. Die <klasse> von Translet befindet sich entweder in\n   der CLASSPATH-Angabe des Benutzers oder in der optional angegebenen <jardatei>.\nOPTIONEN\n   -j <JAR-Datei>    Gibt eine JAR-Datei an, aus der das Translet geladen wird.\n   -x              Aktiviert zusätzliche Debugnachrichtenausgabe.\n   -n <Iterationen> Führt die Umsetzung <Iterationen> Mal aus und \n                   zeigt Profilinformationen an.\n   -u <Dokument-URL> Gibt das XML-Eingabedokument als URL an.\n" }, { "STRAY_SORT_ERR", "<xsl:sort> kann nur in <xsl:for-each> oder <xsl:apply-templates> verwendet werden." }, { "UNSUPPORTED_ENCODING", "Ausgabeverschlüsselung ''{0}'' wird auf dieser JVM nicht unterstützt." }, { "SYNTAX_ERR", "Syntaxfehler in ''{0}''." }, { "CONSTRUCTOR_NOT_FOUND", "Der externe Konstruktor ''{0}'' wurde nicht gefunden." }, { "NO_JAVA_FUNCT_THIS_REF", "Das erste Argument der nichtstatischen Java-Funktion ''{0}'' ist kein gültiger Objektverweis." }, { "TYPE_CHECK_ERR", "Fehler beim Überprüfen des Typs des Ausdrucks ''{0}''." }, { "TYPE_CHECK_UNK_LOC_ERR", "Fehler beim Überprüfen des Typs eines Ausdrucks an einer unbekannten Position." }, { "ILLEGAL_CMDLINE_OPTION_ERR", "Die Befehlszeilenoption ''{0}'' ist nicht gültig." }, { "CMDLINE_OPT_MISSING_ARG_ERR", "In der Befehlszeilenoption ''{0}'' fehlt ein erforderliches Argument." }, { "WARNING_PLUS_WRAPPED_MSG", "WARNUNG:  ''{0}''\n       :{1}" }, { "WARNING_MSG", "WARNUNG:  ''{0}''" }, { "FATAL_ERR_PLUS_WRAPPED_MSG", "SCHWER WIEGENDER FEHLER:  ''{0}''\n           :{1}" }, { "FATAL_ERR_MSG", "SCHWER WIEGENDER FEHLER:  ''{0}''" }, { "ERROR_PLUS_WRAPPED_MSG", "FEHLER:  ''{0}''\n     :{1}" }, { "ERROR_MSG", "FEHLER:  ''{0}''" }, { "TRANSFORM_WITH_TRANSLET_STR", "Umsetzung mit Translet ''{0}'' " }, { "TRANSFORM_WITH_JAR_STR", "Umwandlung mit Translet ''{0}'' aus JAR-Datei ''{1}''" }, { "COULD_NOT_CREATE_TRANS_FACT", "Es konnte keine Instanz der TransformerFactory-Klasse ''{0}'' erstellt werden." }, { "TRANSLET_NAME_JAVA_CONFLICT", "Der Name ''{0}'' konnte nicht als Name der Transletklasse verwendet werden, da er Zeichen enthält, die im Namen einer Java-Klasse nicht zulässig sind. Stattdessen wurde der Name ''{1}'' verwendet." }, { "COMPILER_ERROR_KEY", "Compilerfehler:" }, { "COMPILER_WARNING_KEY", "Compilerwarnungen:" }, { "RUNTIME_ERROR_KEY", "Translet-Fehler:" }, { "INVALID_QNAME_ERR", "Ein Attribut, dessen Wert ein QName oder eine durch Leerzeichen getrennte Liste von QNamen sein muss, hatte den Wert ''{0}''." }, { "INVALID_NCNAME_ERR", "Ein Attribut, dessen Wert ein NCName sein muss, hatte den Wert ''{0}''." }, { "INVALID_METHOD_IN_OUTPUT", "Das Methodenattribut eines <xsl:output>-Elements hatte den Wert ''{0}''. Als Wert muss ''xml'', ''html'', ''text'' oder ''qname-but-not-ncname'' verwendet werden." }, { "JAXP_GET_FEATURE_NULL_NAME", "Der Funktionsname darf in TransformerFactory.getFeature(Name der Zeichenfolge) nicht den Wert Null haben." }, { "JAXP_SET_FEATURE_NULL_NAME", "Der Funktionsname darf in TransformerFactory.setFeature(Name der Zeichenfolge, Boolescher Wert) nicht den Wert Null haben." }, { "JAXP_UNSUPPORTED_FEATURE", "Die Funktion ''{0}'' kann in dieser TransformerFactory nicht festgelegt werden." } };
  }
}
