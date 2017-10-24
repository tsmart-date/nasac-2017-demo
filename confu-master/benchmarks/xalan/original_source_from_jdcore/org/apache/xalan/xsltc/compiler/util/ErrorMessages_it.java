package org.apache.xalan.xsltc.compiler.util;

import java.util.ListResourceBundle;






















































































public class ErrorMessages_it
  extends ListResourceBundle
{
  public ErrorMessages_it() {}
  
  public Object[][] getContents()
  {
    return new Object[][] { { "MULTIPLE_STYLESHEET_ERR", "Più fogli di stile definiti nello stesso file." }, { "TEMPLATE_REDEF_ERR", "La maschera ''{0}'' già definita in questo foglio di lavoro." }, { "TEMPLATE_UNDEF_ERR", "La maschera ''{0}'' non definita in questo foglio di lavoro." }, { "VARIABLE_REDEF_ERR", "La variabile ''{0}'' è definita più volte nello stesso ambito." }, { "VARIABLE_UNDEF_ERR", "Variabile o parametro ''{0}'' non definito. " }, { "CLASS_NOT_FOUND_ERR", "Impossibile trovare la classe ''{0}''." }, { "METHOD_NOT_FOUND_ERR", "Impossibile trovare il metodo esterno ''{0}'' (deve essere pubblico)." }, { "ARGUMENT_CONVERSION_ERR", "Impossibile convertire il tipo di argomento/ritorno nella chiamata nel metodo ''{0}''" }, { "FILE_NOT_FOUND_ERR", "File o URI ''{0}'' non trovato." }, { "INVALID_URI_ERR", "URI non valido ''{0}''." }, { "FILE_ACCESS_ERR", "Impossibile aprire il file o l''''URI ''{0}''." }, { "MISSING_ROOT_ERR", "Era previsto l'elemento <xsl:stylesheet> o <xsl:transform>." }, { "NAMESPACE_UNDEF_ERR", "Il prefisso dello spazio nome ''{0}'' non è dichiarato. " }, { "FUNCTION_RESOLVE_ERR", "Impossibile risolvere la chiamata alla funzione ''{0}''." }, { "NEED_LITERAL_ERR", "L''''argomento di ''{0}'' deve essere una stringa letterale. " }, { "XPATH_PARSER_ERR", "Errore durante l''''analisi dell''''espressione XPath ''{0}''." }, { "REQUIRED_ATTR_ERR", "Attributo ''{0}'' richiesto mancante. " }, { "ILLEGAL_CHAR_ERR", "Carattere non valido ''{0}'' nell''''espressione XPath. " }, { "ILLEGAL_PI_ERR", "Nome ''{0}'' non valido per l''''istruzione di elaborazione. " }, { "STRAY_ATTRIBUTE_ERR", "L''''attributo ''{0}'' al di fuori dell''''elemento." }, { "ILLEGAL_ATTRIBUTE_ERR", "Attributo non valido ''{0}''." }, { "CIRCULAR_INCLUDE_ERR", "Import/include circolare. Foglio di lavoro ''{0}'' già caricato. " }, { "RESULT_TREE_SORT_ERR", "Impossibile ordinare i frammenti della struttura ad albero dei risultati (elementi <xsl:sort> ignorati). È necessario ordinare i nodi quando si crea la struttura ad albero dei risultati." }, { "SYMBOLS_REDEF_ERR", "La formattazione decimale ''{0}'' è già definita." }, { "XSL_VERSION_ERR", "La versione XSL ''{0}'' non è supportata da XSLTC." }, { "CIRCULAR_VARIABLE_ERR", "Riferimento variabile/parametro circolare in ''{0}''." }, { "ILLEGAL_BINARY_OP_ERR", "Operatore sconosciuto per l'espressione binaria." }, { "ILLEGAL_ARG_ERR", "Argomento(i) non valido(i) per la chiamata alla funzione." }, { "DOCUMENT_ARG_ERR", "Il secondo argomento di una funzione document() deve essere una serie di nodi." }, { "MISSING_WHEN_ERR", "È necessario almeno un elemento <xsl:when> in <xsl:choose>." }, { "MULTIPLE_OTHERWISE_ERR", "Solo un elemento <xsl:otherwise> consentito in <xsl:choose>." }, { "STRAY_OTHERWISE_ERR", "<xsl:otherwise> può essere utilizzato solo all'interno di <xsl:choose>." }, { "STRAY_WHEN_ERR", "<xsl:when> può essere utilizzato solo all'interno di <xsl:choose>." }, { "WHEN_ELEMENT_ERR", "Solo gli elementi <xsl:when> e <xsl:otherwise> sono consentiti in <xsl:choose>." }, { "UNNAMED_ATTRIBSET_ERR", "<xsl:attribute-set> non contiene l'attributo 'name'." }, { "ILLEGAL_CHILD_ERR", "Elemento child non valido." }, { "ILLEGAL_ELEM_NAME_ERR", "Impossibile chiamare un elemento ''{0}''" }, { "ILLEGAL_ATTR_NAME_ERR", "Impossibile chiamare un attributo ''{0}''" }, { "ILLEGAL_TEXT_NODE_ERR", "Dati di testo al di fuori dell'elemento <xsl:stylesheet> di livello superiore." }, { "SAX_PARSER_CONFIG_ERR", "Parser JAXP non configurato correttamente" }, { "INTERNAL_ERR", "Errore XSLTC interno non recuperabile: ''{0}''" }, { "UNSUPPORTED_XSL_ERR", "Elemento XSL non supportato ''{0}''." }, { "UNSUPPORTED_EXT_ERR", "Estensione XSLTC non riconosciuta ''{0}''." }, { "MISSING_XSLT_URI_ERR", "Il documento di immissione non è un foglio di lavoro (lo namespace XSL non è dichiarato nell'elemento root)." }, { "MISSING_XSLT_TARGET_ERR", "Impossibile trovare la destinazione stylesheet ''{0}''." }, { "NOT_IMPLEMENTED_ERR", "Non implementato: ''{0}''." }, { "NOT_STYLESHEET_ERR", "Il documento di immissione non contiene un foglio di lavoro XSL." }, { "ELEMENT_PARSE_ERR", "Impossibile analizzare l''''elemento ''{0}''" }, { "KEY_USE_ATTR_ERR", "L'attributo use di <key> deve essere node, node-set, string o number." }, { "OUTPUT_VERSION_ERR", "La versione del documento XML di emissione deve essere 1.0" }, { "ILLEGAL_RELAT_OP_ERR", "Operatore sconosciuto per l'espressione relazionale" }, { "ATTRIBSET_UNDEF_ERR", "Tentativo di utilizzare una serie di attributi ''{0}'' non esistente." }, { "ATTR_VAL_TEMPLATE_ERR", "Impossibile analizzare la maschera del valore di attributo ''{0}''." }, { "UNKNOWN_SIG_TYPE_ERR", "Tipo di dati sconosciuto nella firma per la classe ''{0}''." }, { "DATA_CONVERSION_ERR", "Impossibile convertire il tipo di dati da ''{0}'' a ''{1}''." }, { "NO_TRANSLET_CLASS_ERR", "Questa Templates non contiene una definizione di classe translet valida." }, { "NO_MAIN_TRANSLET_ERR", "Questa Templates non contengono una classe con il nome ''{0}''." }, { "TRANSLET_CLASS_ERR", "Impossibile caricare la classe translet ''{0}''." }, { "TRANSLET_OBJECT_ERR", "Classe translet caricata, ma non è possibile creare l'istanza translet." }, { "ERROR_LISTENER_NULL_ERR", "Tentativo di impostare ErrorListener per ''{0}'' su null" }, { "JAXP_UNKNOWN_SOURCE_ERR", "Solo StreamSource, SAXSource e DOMSource sono supportati da XSLTC" }, { "JAXP_NO_SOURCE_ERR", "L''oggetto Source passato a ''{0}'' non ha contenuto." }, { "JAXP_COMPILE_ERR", "Impossibile compilare il foglio di lavoro" }, { "JAXP_INVALID_ATTR_ERR", "TransformerFactory non riconosce l''''attributo ''{0}''." }, { "JAXP_SET_RESULT_ERR", "setResult() deve essere richiamato prima di startDocument()." }, { "JAXP_NO_TRANSLET_ERR", "Transformer non dispone di un oggetto translet incapsulato." }, { "JAXP_NO_HANDLER_ERR", "Nessun programma di gestione dell'emissione definito per il risultato della trasformazione." }, { "JAXP_NO_RESULT_ERR", "Oggetto Result passato ''{0}'' non valido." }, { "JAXP_UNKNOWN_PROP_ERR", "Tentativo di accedere alla proprietà Transformer ''{0}'' non valida." }, { "SAX2DOM_ADAPTER_ERR", "Impossibile creare l''''adattatore SAX2DOM: ''{0}''." }, { "XSLTC_SOURCE_ERR", "XSLTCSource.build() richiamato senza che sia impostato un systemId (identificativo di sistema)." }, { "ER_RESULT_NULL", "Il risultato non può essere nullo" }, { "JAXP_INVALID_SET_PARAM_VALUE", "Il valore del parametro {0} deve essere un oggetto Java valido" }, { "COMPILE_STDIN_ERR", "L'opzione -i deve essere utilizzata con l'opzione -o." }, { "COMPILE_USAGE_STR", "SYNOPSIS\n   java org.apache.xalan.xsltc.cmdline.Compile [-o <output>]\n      [-d <directory>] [-j <jarfile>] [-p <package>]\n      [-n] [-x] [-u] [-v] [-h] { <stylesheet> | -i }\n\nOPTIONS\n   -o <output>    assegna il nome <output> al translet generato\n.  Per impostazione predefinita, il nome translet è\n                  derivato dal nome <stylesheet>.  Questa opzione\n                  viene ignorata se vengono compilati più fogli di stile.\n   -d <directory> specifica una directory di destinazione per il translet\n   -j <jarfile>   raggruppa le classi translet in un file jar del\n                  nome specificato come <jarfile>\n   -p <package>   specifica un prefisso del nome pacchetto per tutte le classi\n                  translet generate.\n   -n             abilita l'allineamento della maschera (funzionamento predefinito migliore\n                  in media).\n   -x             attiva ulteriori emissioni dei messaggi di debug\n   -u             interpreta gli argomenti <stylesheet> come URL\n   -i             impone al programma di compilazione di leggere il foglio di lavoro da stdin\n   -v             stampa la versione del programma di compilazione \n   -h             stampa queste istruzioni sull'utilizzo\n" }, { "TRANSFORM_USAGE_STR", "SYNOPSIS \n   java org.apache.xalan.xsltc.cmdline.Transform [-j <jarfile>]\n      [-x] [-n <iterations>] {-u <document_url> | <document>}\n      <class> [<param1>=<value1> ...]\n\n   utilizza il translet <class> per convertire un documento XML \n   specificato come <document>. Il translet <classe> si trova \n   nella istruzione CLASSPATH dell'utente o nel <jarfile> eventualmente specificato.\nOPTIONS\n   -j <jarfile>    specifica un jarfile dal quale caricare il translet\n   -x    attiva ulteriori output dei messaggi di debug\n   -n <iterations> esegue la trasformazione <iterazioni> e\n                   visualizza le informazioni relative al profilo\n   -u <document_url> specifica il documento di immissione XML come URL\n" }, { "STRAY_SORT_ERR", "<xsl:sort> può essere utilizzato solo all'interno di <xsl:for-each> o <xsl:apply-templates>." }, { "UNSUPPORTED_ENCODING", "Codifica di emissione ''{0}'' non supportata in questa JVM." }, { "SYNTAX_ERR", "Errore di sintassi in ''{0}''." }, { "CONSTRUCTOR_NOT_FOUND", "Impossibile trovare un costruttore esterno ''{0}''." }, { "NO_JAVA_FUNCT_THIS_REF", "Il primo argomento della funzione Java non statica ''{0}'' non è un riferimento ad un oggetto valido. " }, { "TYPE_CHECK_ERR", "Errore durante la verifica del tipo di espressione ''{0}''." }, { "TYPE_CHECK_UNK_LOC_ERR", "Errore durante la verifica del tipo di espressione in una posizione sconosciuta." }, { "ILLEGAL_CMDLINE_OPTION_ERR", "L''''opzione della riga comandi ''{0}'' non è valida." }, { "CMDLINE_OPT_MISSING_ARG_ERR", "Manca un argomento obbligatorio per l''''opzione della riga comandi ''{0}''. " }, { "WARNING_PLUS_WRAPPED_MSG", "ATTENZIONE:  ''{0}''\n       :{1}" }, { "WARNING_MSG", "ATTENZIONE:  ''{0}''" }, { "FATAL_ERR_PLUS_WRAPPED_MSG", "ERRORE IRREVERSIBILE:  ''{0}''\n           :{1}" }, { "FATAL_ERR_MSG", "ERRORE IRREVERSIBILE:  ''{0}''" }, { "ERROR_PLUS_WRAPPED_MSG", "ERRORE:  ''{0}''\n     :{1}" }, { "ERROR_MSG", "ERRORE:  ''{0}''" }, { "TRANSFORM_WITH_TRANSLET_STR", "Trasformazione utilizzando il translet ''{0}'' " }, { "TRANSFORM_WITH_JAR_STR", "Trasformazione utilizzando il translet ''{0}'' dal file jar ''{1}''" }, { "COULD_NOT_CREATE_TRANS_FACT", "Impossibile creare un''istanza della classe TransformerFactory ''{0}''." }, { "TRANSLET_NAME_JAVA_CONFLICT", "Non è stato possibile utilizzare il nome ''{0}'' come nome della classe translet perché contiene dei caratteri che non sono consentiti nel nome della classe Java. È stato invece utilizzato il nome ''{1}''." }, { "COMPILER_ERROR_KEY", "Errori del programma di compilazione:" }, { "COMPILER_WARNING_KEY", "Messaggi di avvertenza del programma di compilazione:" }, { "RUNTIME_ERROR_KEY", "Errori del translet:" }, { "INVALID_QNAME_ERR", "Un attributo il cui valore deve essere un QName o un elenco separato da spazi vuoti di QName ha avuto il valore di ''{0}''" }, { "INVALID_NCNAME_ERR", "Un attributo il cui valore deve essere un NCName aveva il valore ''{0}''" }, { "INVALID_METHOD_IN_OUTPUT", "L''''attributo del metodo di un elemento <xsl:output> aveva il valore ''{0}''.  Il valore deve essere uno di ''xml'', ''html'', ''text'' o qname-but-not-ncname" }, { "JAXP_GET_FEATURE_NULL_NAME", "Il nome della funzione non può essere nullo in TransformerFactory.getFeature(Nome stringa)." }, { "JAXP_SET_FEATURE_NULL_NAME", "Il nome della funzione non può essere nullo in TransformerFactory.setFeature(Nome stringa, valore booleano)." }, { "JAXP_UNSUPPORTED_FEATURE", "Impossibile impostare la funzione ''{0}'' su questo TransformerFactory." } };
  }
}
