package org.apache.xalan.xsltc.compiler.util;















public final class ErrorMessages_no
  extends ErrorMessages
{
  public ErrorMessages_no() {}
  














  public Object[][] getContents()
  {
    return new Object[][] { { "MULTIPLE_STYLESHEET_ERR", "En fil kan bare innehold ett stilark." }, { "TEMPLATE_REDEF_ERR", "<xsl:template> ''{0}'' er allerede definert i dette stilarket." }, { "TEMPLATE_UNDEF_ERR", "<xsl:template> ''{0}'' er ikke definert i dette stilarket." }, { "VARIABLE_REDEF_ERR", "Variabel ''{0}'' er allerede definert." }, { "VARIABLE_UNDEF_ERR", "Variabel eller parameter ''{0}'' er ikke definert." }, { "CLASS_NOT_FOUND_ERR", "Finner ikke klassen ''{0}''." }, { "METHOD_NOT_FOUND_ERR", "Finner ikke ekstern funksjon ''{0}'' (må v\000e6re deklarert både 'static' og 'public')." }, { "ARGUMENT_CONVERSION_ERR", "Kan ikke konvertere argument/retur type i kall til funksjon ''{0}''" }, { "FILE_NOT_FOUND_ERR", "Finner ikke fil eller URI ''{0}''." }, { "INVALID_URI_ERR", "Ugyldig URI ''{0}''." }, { "FILE_ACCESS_ERR", "Kan ikke åpne fil eller URI ''{0}''." }, { "MISSING_ROOT_ERR", "Forvented <xsl:stylesheet> eller <xsl:transform> element." }, { "NAMESPACE_UNDEF_ERR", "Prefiks ''{0}'' er ikke deklarert." }, { "FUNCTION_RESOLVE_ERR", "Kunne ikke resolvere kall til funksjon ''{0}''." }, { "NEED_LITERAL_ERR", "Argument til ''{0}'' må v\000e6re ordrett tekst." }, { "XPATH_PARSER_ERR", "Kunne ikke tolke XPath uttrykk ''{0}''." }, { "REQUIRED_ATTR_ERR", "Nødvendig attributt ''{0}'' er ikke deklarert." }, { "ILLEGAL_CHAR_ERR", "Ugyldig bokstav/tegn ''{0}'' i XPath uttrykk." }, { "ILLEGAL_PI_ERR", "Ugyldig navn ''{0}'' for prosesserings-instruksjon." }, { "STRAY_ATTRIBUTE_ERR", "Attributt ''{0}'' utenfor element." }, { "ILLEGAL_ATTRIBUTE_ERR", "Ugyldig attributt ''{0}''." }, { "CIRCULAR_INCLUDE_ERR", "Sirkul \000e6 import/include; stilark ''{0}'' er alt lest." }, { "RESULT_TREE_SORT_ERR", "Result-tre fragmenter kan ikke sorteres (<xsl:sort> elementer vil bli ignorert). Du må sortere nodene mens du bygger treet." }, { "SYMBOLS_REDEF_ERR", "Formatterings-symboler ''{0}'' er alt definert." }, { "XSL_VERSION_ERR", "XSL versjon ''{0}'' er ikke støttet av XSLTC." }, { "CIRCULAR_VARIABLE_ERR", "Sirkul\000e6r variabel/parameter referanse i ''{0}''." }, { "ILLEGAL_BINARY_OP_ERR", "Ugyldig operator for bin\000e6rt uttrykk." }, { "ILLEGAL_ARG_ERR", "Ugyldig parameter i funksjons-kall." }, { "DOCUMENT_ARG_ERR", "Andre argument til document() må v\000e6re et node-sett." }, { "MISSING_WHEN_ERR", "Du må deklarere minst ett <xsl:when> element innenfor <xsl:choose>." }, { "MULTIPLE_OTHERWISE_ERR", "Kun ett <xsl:otherwise> element kan deklareres innenfor <xsl:choose>." }, { "STRAY_OTHERWISE_ERR", "<xsl:otherwise> kan kun benyttes innenfor <xsl:choose>." }, { "STRAY_WHEN_ERR", "<xsl:when> kan kun benyttes innenfor <xsl:choose>." }, { "WHEN_ELEMENT_ERR", "Kun <xsl:when> og <xsl:otherwise> kan benyttes innenfor <xsl:choose>." }, { "UNNAMED_ATTRIBSET_ERR", "<xsl:attribute-set> element manger 'name' attributt." }, { "ILLEGAL_CHILD_ERR", "Ugyldig element." }, { "ILLEGAL_ELEM_NAME_ERR", "''{0}'' er ikke et gyldig navn for et element." }, { "ILLEGAL_ATTR_NAME_ERR", "''{0}'' er ikke et gyldig navn for et attributt." }, { "ILLEGAL_TEXT_NODE_ERR", "Du kan ikke plassere tekst utenfor et <xsl:stylesheet> element." }, { "SAX_PARSER_CONFIG_ERR", "JAXP parser er ikke korrekt konfigurert." }, { "INTERNAL_ERR", "XSLTC-intern feil: ''{0}''" }, { "UNSUPPORTED_XSL_ERR", "Støtter ikke XSL element ''{0}''." }, { "UNSUPPORTED_EXT_ERR", "XSLTC støtter ikke utvidet funksjon ''{0}''." }, { "MISSING_XSLT_URI_ERR", "Dette dokumentet er ikke et XSL stilark (xmlns:xsl='http://www.w3.org/1999/XSL/Transform' er ikke deklarert)." }, { "MISSING_XSLT_TARGET_ERR", "Kan ikke finne stilark ved navn ''{0}'' i dette dokumentet." }, { "NOT_IMPLEMENTED_ERR", "Ikke implementert/gjenkjent: ''{0}''." }, { "NOT_STYLESHEET_ERR", "Dokumentet inneholder ikke et XSL stilark" }, { "ELEMENT_PARSE_ERR", "Kan ikke tolke element ''{0}''" }, { "KEY_USE_ATTR_ERR", "'use'-attributtet i <xsl:key> må v\000e6re node, node-sett, tekst eller nummer." }, { "OUTPUT_VERSION_ERR", "Det genererte XML dokumentet må gis versjon 1.0" }, { "ILLEGAL_RELAT_OP_ERR", "Ugyldig operator for relasjons-uttrykk." }, { "ATTRIBSET_UNDEF_ERR", "Finner ikke <xsl:attribute-set> element med navn ''{0}''." }, { "ATTR_VAL_TEMPLATE_ERR", "Kan ikke tolke attributt ''{0}''." }, { "UNKNOWN_SIG_TYPE_ERR", "Ukjent data-type i signatur for klassen ''{0}''." }, { "DATA_CONVERSION_ERR", "Kan ikke oversette mellom data-type ''{0}'' og ''{1}''." }, { "NO_TRANSLET_CLASS_ERR", "Dette Templates objected inneholder ingen translet klasse definisjon." }, { "NO_MAIN_TRANSLET_ERR", "Dette Templates objected inneholder ingen klasse ved navn ''{0}''." }, { "TRANSLET_CLASS_ERR", "Kan ikke laste translet-klasse ''{0}''." }, { "TRANSLET_OBJECT_ERR", "Translet klassen er lastet man kan instansieres." }, { "ERROR_LISTENER_NULL_ERR", "ErrorListener for ''{0}'' forsøkt satt til 'null'." }, { "JAXP_UNKNOWN_SOURCE_ERR", "Kun StreamSource, SAXSource og DOMSOurce er støttet av XSLTC" }, { "JAXP_NO_SOURCE_ERR", "Source objekt sendt til ''{0}'' har intet innhold." }, { "JAXP_COMPILE_ERR", "Kan ikke kompilere stilark." }, { "JAXP_INVALID_ATTR_ERR", "TransformerFactory gjenkjenner ikke attributtet ''{0}''." }, { "JAXP_SET_RESULT_ERR", "setResult() må kalles før startDocument()." }, { "JAXP_NO_TRANSLET_ERR", "Transformer objektet inneholder ikken noen translet instans." }, { "JAXP_NO_HANDLER_ERR", "Ingen 'handler' er satt for å ta imot generert dokument." }, { "JAXP_NO_RESULT_ERR", "Result objektet sendt til ''{0}'' er ikke gyldig." }, { "JAXP_UNKNOWN_PROP_ERR", "Forsøker å lese ugyldig attributt ''{0}'' fra Transformer." }, { "SAX2DOM_ADAPTER_ERR", "Kan ikke instansiere SAX2DOM adapter: ''{0}''." }, { "XSLTC_SOURCE_ERR", "XSLTCSource.build() kalt uten at 'systemId' er definert." }, { "COMPILE_STDIN_ERR", "Du kan ikke bruke -i uten å også angi klasse-navn med -o." }, { "COMPILE_USAGE_STR", "Bruk:\n   xsltc [-o <klasse>] [-d <katalog>] [-j <arkiv>]\n         [-p <pakke>] [-x] [-s] [-u] <stilark>|-i\n\n   Der:  <klasse> er navnet du vil gi den kompilerte java klassen.\n         <stilark> er ett eller flere XSL stilark, eller dersom -u\n         er benyttet, en eller flere URL'er til stilark.\n         <katalog> katalog der klasse filer vil plasseres.\n         <arkiv> er en JAR-fil der klassene vil plasseres\n         <pakke> er an Java 'package' klassene vil legges i.\n\n   Annet:\n         -i tvinger kompilatoren til å lese fra stdin.\n         -o ignoreres dersom flere enn ett silark kompileres.\n         -x slår på debug meldinger.\n         -s blokkerer alle kall til System.exit()." }, { "TRANSFORM_USAGE_STR", "Bruk: \n   xslt  [-j <arkiv>] {-u <url> | <dokument>} <klasse>\n         [<param>=<verdi> ...]\n\n   Der:  <dokument> er XML dokumentet som skal behandles.\n         <url> er en URL til XML dokumentet som skal behandles.\n         <klasse> er Java klassen som skal benyttes.\n         <arkiv> er en JAR-fil som klassen leses fra.\n   Annet:\n         -x slår på debug meldinger.\n         -s blokkerer alle kall til System.exit()." }, { "STRAY_SORT_ERR", "<xsl:sort> kan bare brukes under <xsl:for-each> eller <xsl:apply-templates>." }, { "UNSUPPORTED_ENCODING", "Karaktersett ''{0}'' er ikke støttet av denne JVM." }, { "SYNTAX_ERR", "Syntax error in ''{0}''." } };
  }
}
