package org.apache.xalan.xsltc.compiler.util;

import java.util.ListResourceBundle;






















































































public class ErrorMessages_sk
  extends ListResourceBundle
{
  public ErrorMessages_sk() {}
  
  public Object[][] getContents()
  {
    return new Object[][] { { "MULTIPLE_STYLESHEET_ERR", "Viac než jeden štýl dokumentu bol definovaný v rovnakom súbore." }, { "TEMPLATE_REDEF_ERR", "V tomto štýle dokumentu už bola šablóna ''{0}'' definovaná." }, { "TEMPLATE_UNDEF_ERR", "Šablóna ''{0}'' nebola definovaná v tomto štýle dokumentu." }, { "VARIABLE_REDEF_ERR", "Premenná ''{0}'' je viackrát definovaná v rovnakom rozsahu." }, { "VARIABLE_UNDEF_ERR", "Premenná alebo parameter ''{0}'' nie je definovaný." }, { "CLASS_NOT_FOUND_ERR", "Trieda ''{0}'' sa nedá nájsť." }, { "METHOD_NOT_FOUND_ERR", "Nedá sa nájsť externá metóda ''{0}'' (musí byť verejná)." }, { "ARGUMENT_CONVERSION_ERR", "Argument/typ návratu vo volaní sa nedá skonvertovať na metódu ''{0}''" }, { "FILE_NOT_FOUND_ERR", "Súbor alebo URI ''{0}'' nebol nájdený." }, { "INVALID_URI_ERR", "URI ''{0}'' je neplatný." }, { "FILE_ACCESS_ERR", "Súbor alebo URI ''{0}'' sa nedá otvoriť." }, { "MISSING_ROOT_ERR", "Očakáva sa element <xsl:stylesheet> alebo <xsl:transform>." }, { "NAMESPACE_UNDEF_ERR", "Predpona názvového priestoru ''{0}'' nie je deklarovaná." }, { "FUNCTION_RESOLVE_ERR", "Nie je možné rozlíšiť volanie pre funkciu ''{0}''." }, { "NEED_LITERAL_ERR", "Argument pre ''{0}'' musí byť literálovým reťazcom." }, { "XPATH_PARSER_ERR", "Chyba pri syntaktickej analýze XPath výrazu ''{0}''." }, { "REQUIRED_ATTR_ERR", "Chýba vyžadovaný atribút ''{0}''." }, { "ILLEGAL_CHAR_ERR", "Vo výraze XPath je neplatný znak ''{0}''." }, { "ILLEGAL_PI_ERR", "Pre inštrukciu spracovania je názov ''{0}'' neplatný." }, { "STRAY_ATTRIBUTE_ERR", "Atribút ''{0}'' je mimo prvku." }, { "ILLEGAL_ATTRIBUTE_ERR", "Atribút ''{0}'' je neplatný." }, { "CIRCULAR_INCLUDE_ERR", "Cirkulárny import/zahrnutie. Štýl dokumentu ''{0}'' je už zavedený." }, { "RESULT_TREE_SORT_ERR", "Fragmenty stromu výsledkov nemožno triediť (elementy <xsl:sort> sú ignorované). Keď vytvárate výsledkový strom, musíte triediť uzly." }, { "SYMBOLS_REDEF_ERR", "Desiatkové formátovanie ''{0}'' je už definované." }, { "XSL_VERSION_ERR", "XSLTC nepodporuje XSL verziu ''{0}''." }, { "CIRCULAR_VARIABLE_ERR", "Referencia na cyklickú premennú/parameter v ''{0}''." }, { "ILLEGAL_BINARY_OP_ERR", "Neznámy operátor pre binárny výraz." }, { "ILLEGAL_ARG_ERR", "Neplatný argument(y) pre volanie funkcie." }, { "DOCUMENT_ARG_ERR", "Druhý argument pre funkciu dokumentu() musí byť sada uzlov." }, { "MISSING_WHEN_ERR", "V <xsl:choose> sa vyžaduje najmenej jeden element <xsl:when>." }, { "MULTIPLE_OTHERWISE_ERR", "V  <xsl:choose> je povolený len jeden element <xsl:otherwise>." }, { "STRAY_OTHERWISE_ERR", "<xsl:otherwise> možno použiť len v <xsl:choose>." }, { "STRAY_WHEN_ERR", "<xsl:when> možno použiť len v <xsl:choose>." }, { "WHEN_ELEMENT_ERR", "V <xsl:choose> sú povolené len elementy <xsl:when> a <xsl:otherwise>." }, { "UNNAMED_ATTRIBSET_ERR", "<xsl:attribute-set> chýba atribút 'name'." }, { "ILLEGAL_CHILD_ERR", "Neplatný element potomka." }, { "ILLEGAL_ELEM_NAME_ERR", "Nemôžete volať prvok ''{0}''" }, { "ILLEGAL_ATTR_NAME_ERR", "Nemôžete volať atribút ''{0}''" }, { "ILLEGAL_TEXT_NODE_ERR", "Textové údaje sú mimo elementu vrchnej úrovne <xsl:stylesheet>." }, { "SAX_PARSER_CONFIG_ERR", "Analyzátor JAXP nie je správne nakonfigurovaný" }, { "INTERNAL_ERR", "Neopraviteľná interná chyba XSLTC: ''{0}''" }, { "UNSUPPORTED_XSL_ERR", "XSL prvok ''{0}'' nie je podporovaný." }, { "UNSUPPORTED_EXT_ERR", "XSLTC prípona ''{0}'' nebola rozpoznaná." }, { "MISSING_XSLT_URI_ERR", "Vstupný dokument nie je štýlom dokumentu (názvový priestor XSL nie je deklarovaný v koreňovom elemente)." }, { "MISSING_XSLT_TARGET_ERR", "Nebolo možné nájsť cieľ štýlu dokumentu ''{0}''." }, { "NOT_IMPLEMENTED_ERR", "Nie je implementované: ''{0}''." }, { "NOT_STYLESHEET_ERR", "Vstupný dokument neobsahuje štýl dokumentu XSL." }, { "ELEMENT_PARSE_ERR", "Nebolo možné analyzovať prvok ''{0}''" }, { "KEY_USE_ATTR_ERR", "Atribút použitia <key> musí byť uzol, sada uzlov, reťazec alebo číslo." }, { "OUTPUT_VERSION_ERR", "Verzia výstupného dokumentu XML by mala byť 1.0" }, { "ILLEGAL_RELAT_OP_ERR", "Neznámy operátor pre relačný výraz" }, { "ATTRIBSET_UNDEF_ERR", "Prebieha pokus o použitie neexistujúcej sady atribútov ''{0}''." }, { "ATTR_VAL_TEMPLATE_ERR", "Nedá sa analyzovať šablóna hodnôt atribútu ''{0}''." }, { "UNKNOWN_SIG_TYPE_ERR", "V podpise pre triedu ''{0}'' je neznámy typ údajov." }, { "DATA_CONVERSION_ERR", "Typ údajov ''{0}'' sa nedá skonvertovať na ''{1}''." }, { "NO_TRANSLET_CLASS_ERR", "Tento vzor neobsahuje platnú definíciu triedy transletu." }, { "NO_MAIN_TRANSLET_ERR", "Táto šablóna neobsahuje triedu s názvom ''{0}''." }, { "TRANSLET_CLASS_ERR", "Nebolo možné zaviesť triedu transletov ''{0}''." }, { "TRANSLET_OBJECT_ERR", "Trieda transletu zavedená, ale nie je možné vytvoriť inštanciu transletu." }, { "ERROR_LISTENER_NULL_ERR", "Prebieha pokus o nastavenie ErrorListener pre ''{0}'' na hodnotu null" }, { "JAXP_UNKNOWN_SOURCE_ERR", "XSLTC podporuje len StreamSource, SAXSource a DOMSource" }, { "JAXP_NO_SOURCE_ERR", "Zdrojový objekt, ktorý prešiel do ''{0}'', nemá žiadny obsah." }, { "JAXP_COMPILE_ERR", "Nebolo možné skompilovať štýl dokumentu" }, { "JAXP_INVALID_ATTR_ERR", "TransformerFactory nerozpoznáva atribút ''{0}''." }, { "JAXP_SET_RESULT_ERR", "setResult() sa musí volať pred startDocument()." }, { "JAXP_NO_TRANSLET_ERR", "Transformátor nemá žiadny zapuzdrený objekt transletu." }, { "JAXP_NO_HANDLER_ERR", "Pre výsledok transformácie nebol definovaný žiadny výstupný handler." }, { "JAXP_NO_RESULT_ERR", "Výsledný objekt, ktorý prešiel do ''{0}'', je neplatný." }, { "JAXP_UNKNOWN_PROP_ERR", "Prebieha pokus o pristúpenie na neplatnú Transformer vlastnosť ''{0}''." }, { "SAX2DOM_ADAPTER_ERR", "Nebolo možné vytvoriť SAX2DOM adaptér: ''{0}''." }, { "XSLTC_SOURCE_ERR", "XSLTCSource.build() bol zavolaný bez nastaveného systemId." }, { "ER_RESULT_NULL", "Výsledok by nemal byť nulový" }, { "JAXP_INVALID_SET_PARAM_VALUE", "Hodnotou parametra {0} musí byť platný objekt Java" }, { "COMPILE_STDIN_ERR", "Voľba -i sa musí používať s voľbou -o." }, { "COMPILE_USAGE_STR", "SYNOPSIS\n   java org.apache.xalan.xsltc.cmdline.Compile [-o <output>]\n      [-d <directory>] [-j <jarfile>] [-p <package>]\n      [-n] [-x] [-u] [-v] [-h] { <stylesheet> | -i }\n\nOPTIONS\n   -o <output>    priradí názov <output> k vygenerovanému\n                  transletu.  Štandardne sa názov objektu translet \n                  odvodzuje od názvu <stylesheet>.  Táto voľba sa ignoruje pri kompilovaní viacerých štýlov dokumentov\n\n.   -d <directory> uvádza cieľový adresár pre translet\n   -j <jarfile>   pakuje triedy transletov do súboru jar názvu \n uvedeného ako <jarfile>\n   -p <package>   uvádza predponu názvu balíku pre všetky generované triedy transletu.\n\n   -n             povoľuje zoradenie vzorov v riadku (štandardné chovanie v priemere lepšie). \n\n   -x             zapne ďalší výstup správ z procesu ladenia\n   -u             argumenty <stylesheet> preloží do URL\n   -i             prinúti kompilátor, aby prečítal štýl dokumentu zo stdin\n   -v             vytlačí verziu kompilátora\n   -h             vytlačí tento návod na použitie\n" }, { "TRANSFORM_USAGE_STR", "SYNOPSIS \n   java org.apache.xalan.xsltc.cmdline.Transform [-j <jarfile>]\n      [-x] [-n <iterations>] {-u <document_url> | <document>}\n      <class> [<param1>=<value1> ...]\n\n   použije translet <class> na transformáciu XML dokumentu \n,   ktorý je špecifikovaný ako <document>. <class> transletu je buď v \n užívateľovej CLASSPATH alebo vo voliteľne uvedenom <jarfile>.\nOPTIONS\n   -j <jarfile>    špecifikuje jarfile, z ktorého sa má zaviesť translet\n   -x              zapne ďalší výstup správ z procesu ladenia\n   -n <iterations> spustí transformáciu <iterations> časov a\n                   zobrazí profilovacie informácie\n   -u <document_url> špecifikuje vstupný dokument XML ako URL\n" }, { "STRAY_SORT_ERR", "<xsl:sort> možno použiť len v <xsl:for-each> alebo <xsl:apply-templates>." }, { "UNSUPPORTED_ENCODING", "Výstupné kódovanie ''{0}'' nie je na tomto JVM podporované." }, { "SYNTAX_ERR", "V ''{0}'' je chyba syntaxe." }, { "CONSTRUCTOR_NOT_FOUND", "Nedá sa nájsť externý konštruktér ''{0}''." }, { "NO_JAVA_FUNCT_THIS_REF", "Prvý argument pre nestatickú Java funkciu ''{0}'' nie je odkaz na platný objekt." }, { "TYPE_CHECK_ERR", "''{0}'' je typ výrazu na kontrolu chýb." }, { "TYPE_CHECK_UNK_LOC_ERR", "Chyba pri kontrole typu výrazu na neznámom mieste." }, { "ILLEGAL_CMDLINE_OPTION_ERR", "Voľba ''{0}'' príkazového riadku je neplatná." }, { "CMDLINE_OPT_MISSING_ARG_ERR", "Vo voľbe ''{0}'' príkazového riadku chýba vyžadovaný argument." }, { "WARNING_PLUS_WRAPPED_MSG", "WARNING:  ''{0}''\n       :{1}" }, { "WARNING_MSG", "WARNING:  ''{0}''" }, { "FATAL_ERR_PLUS_WRAPPED_MSG", "FATAL ERROR:  ''{0}''\n           :{1}" }, { "FATAL_ERR_MSG", "FATAL ERROR:  ''{0}''" }, { "ERROR_PLUS_WRAPPED_MSG", "ERROR:  ''{0}''\n     :{1}" }, { "ERROR_MSG", "ERROR:  ''{0}''" }, { "TRANSFORM_WITH_TRANSLET_STR", "Transformácia s použitím transletu ''{0}'' " }, { "TRANSFORM_WITH_JAR_STR", "Transformácia s použitím transletu ''{0}'' z jar súboru ''{1}''" }, { "COULD_NOT_CREATE_TRANS_FACT", "Nebolo možné vytvoriť inštanciu TransformerFactory triedy ''{0}''." }, { "TRANSLET_NAME_JAVA_CONFLICT", "Názov ''{0}'' sa nedal použiť ako názov triedy transletov, pretože obsahuje znaky, ktoré nie sú povolené v názve Java triedy.  Namiesto neho bol použitý názov ''{1}''." }, { "COMPILER_ERROR_KEY", "Chyby prekladača:" }, { "COMPILER_WARNING_KEY", "Upozornenia prekladača:" }, { "RUNTIME_ERROR_KEY", "Chyby transletu:" }, { "INVALID_QNAME_ERR", "Atribút, ktorý musí mať hodnotu QName alebo medzerami oddelený zoznam hodnôt QName, mal hodnotu ''{0}''" }, { "INVALID_NCNAME_ERR", "Atribút, ktorý musí mať hodnotu NCName, mal hodnotu ''{0}''" }, { "INVALID_METHOD_IN_OUTPUT", "Atribút metódy v prvku <xsl:output> mal hodnotu ''{0}''.  Touto hodnotou musí byť buď ''xml'', ''html'', ''text'' alebo qname-but-not-ncname." }, { "JAXP_GET_FEATURE_NULL_NAME", "Názov vlastnosti nemôže byť null v TransformerFactory.getFeature(Názov reťazca)." }, { "JAXP_SET_FEATURE_NULL_NAME", "Názov vlastnosti nemôže byť null v TransformerFactory.setFeature(Názov reťazca, boolovská hodnota)." }, { "JAXP_UNSUPPORTED_FEATURE", "V tomto TransformerFactory sa nedá nastaviť vlastnosť ''{0}''." } };
  }
}
