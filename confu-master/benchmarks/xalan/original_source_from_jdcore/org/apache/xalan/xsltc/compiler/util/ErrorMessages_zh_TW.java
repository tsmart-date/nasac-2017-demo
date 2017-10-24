package org.apache.xalan.xsltc.compiler.util;

import java.util.ListResourceBundle;






















































































public class ErrorMessages_zh_TW
  extends ListResourceBundle
{
  public ErrorMessages_zh_TW() {}
  
  public Object[][] getContents()
  {
    return new Object[][] { { "MULTIPLE_STYLESHEET_ERR", "同一個檔案中定義一個以上的樣式表。" }, { "TEMPLATE_REDEF_ERR", "此樣式表中已經定義有範本 ''{0}''。" }, { "TEMPLATE_UNDEF_ERR", "此樣式表中尚未定義範本 ''{0}''。" }, { "VARIABLE_REDEF_ERR", "相同的範圍中定義了多個變數 ''{0}''。" }, { "VARIABLE_UNDEF_ERR", "變數或參數 ''{0}'' 尚未定義。" }, { "CLASS_NOT_FOUND_ERR", "找不到類別 ''{0}''。" }, { "METHOD_NOT_FOUND_ERR", "找不到外部方法 ''{0}''（必須是公用的）。" }, { "ARGUMENT_CONVERSION_ERR", "無法將呼叫中的引數/傳回類型轉換為方法 ''{0}''" }, { "FILE_NOT_FOUND_ERR", "找不到檔案或 URI ''{0}''。" }, { "INVALID_URI_ERR", "URI ''{0}'' 無效。" }, { "FILE_ACCESS_ERR", "無法開啟檔案或 URI ''{0}''。" }, { "MISSING_ROOT_ERR", "原預期為 <xsl:stylesheet> 或 <xsl:transform> 元素。" }, { "NAMESPACE_UNDEF_ERR", "名稱空間字首 ''{0}'' 尚未宣告。" }, { "FUNCTION_RESOLVE_ERR", "無法解析對函數 ''{0}'' 的呼叫。" }, { "NEED_LITERAL_ERR", "''{0}'' 的引數必須是文字字串。" }, { "XPATH_PARSER_ERR", "剖析 XPath 表示式 ''{0}'' 時發生錯誤。" }, { "REQUIRED_ATTR_ERR", "遺漏必要的屬性 ''{0}''。" }, { "ILLEGAL_CHAR_ERR", "XPath 表示式中包含不合法字元 ''{0}''。" }, { "ILLEGAL_PI_ERR", "處理指示的名稱 ''{0}'' 不合法。" }, { "STRAY_ATTRIBUTE_ERR", "屬性 ''{0}'' 超出元素外。" }, { "ILLEGAL_ATTRIBUTE_ERR", "屬性 ''{0}'' 不合法。" }, { "CIRCULAR_INCLUDE_ERR", "循環匯入/併入。樣式表 ''{0}'' 已經載入。" }, { "RESULT_TREE_SORT_ERR", "結果樹片段無法排序（<xsl:sort> 元素被忽略）。您必須於建立結果樹時，將節點排序。" }, { "SYMBOLS_REDEF_ERR", "已經定義有十進位格式 ''{0}''。" }, { "XSL_VERSION_ERR", "XSL 版本 ''{0}'' 不受 XSLTC 支援。" }, { "CIRCULAR_VARIABLE_ERR", "''{0}'' 中包含循環變數/參數參照。" }, { "ILLEGAL_BINARY_OP_ERR", "二進位表示式的運算子不明。" }, { "ILLEGAL_ARG_ERR", "函數呼叫的引數不合法。" }, { "DOCUMENT_ARG_ERR", "document() 函數的第二個引數必須是節點集。" }, { "MISSING_WHEN_ERR", "<xsl:choose> 中至少要有一個 <xsl:when> 元素。" }, { "MULTIPLE_OTHERWISE_ERR", "<xsl:choose> 中只接受一個 <xsl:otherwise> 元素。" }, { "STRAY_OTHERWISE_ERR", "<xsl:otherwise> 只能用在 <xsl:choose> 中。" }, { "STRAY_WHEN_ERR", "<xsl:when> 只能用在 <xsl:choose> 中。" }, { "WHEN_ELEMENT_ERR", "<xsl:choose> 中只接受 <xsl:when> 和 <xsl:otherwise> 兩個元素。" }, { "UNNAMED_ATTRIBSET_ERR", "<xsl:attribute-set> 遺漏 'name' 屬性。" }, { "ILLEGAL_CHILD_ERR", "子項元素不合法。" }, { "ILLEGAL_ELEM_NAME_ERR", "不可以呼叫元素 ''{0}''" }, { "ILLEGAL_ATTR_NAME_ERR", "不可以呼叫元素 ''{0}''" }, { "ILLEGAL_TEXT_NODE_ERR", "文字資料超出頂層 <xsl:stylesheet> 元素。" }, { "SAX_PARSER_CONFIG_ERR", "JAXP 剖析器未正確配置" }, { "INTERNAL_ERR", "發生無法復原的 XSLTC 內部錯誤：''{0}''" }, { "UNSUPPORTED_XSL_ERR", "XSL 元素 ''{0}'' 不受支援。" }, { "UNSUPPORTED_EXT_ERR", "XSLTC 延伸項目 ''{0}'' 無法辨識。" }, { "MISSING_XSLT_URI_ERR", "輸入文件不是樣式表（XSL 名稱空間未在根元素中宣告）。" }, { "MISSING_XSLT_TARGET_ERR", "找不到樣式表目標 ''{0}''。" }, { "NOT_IMPLEMENTED_ERR", "尚未實作：''{0}''。" }, { "NOT_STYLESHEET_ERR", "輸入文件未包含 XSL 樣式表。" }, { "ELEMENT_PARSE_ERR", "無法剖析元素 ''{0}''" }, { "KEY_USE_ATTR_ERR", "<key> 的 use 屬性必須是 node、node-set、string 或 number。" }, { "OUTPUT_VERSION_ERR", "輸出 XML 文件版本應該是 1.0" }, { "ILLEGAL_RELAT_OP_ERR", "關聯式表示式的運算子不明" }, { "ATTRIBSET_UNDEF_ERR", "嘗試使用不存在的屬性集 ''{0}''。" }, { "ATTR_VAL_TEMPLATE_ERR", "無法剖析屬性值範本 ''{0}''。" }, { "UNKNOWN_SIG_TYPE_ERR", "類別 ''{0}'' 的簽章資料類型不明。" }, { "DATA_CONVERSION_ERR", "無法將資料類型 ''{0}'' 轉換為 ''{1}''。" }, { "NO_TRANSLET_CLASS_ERR", "此 Templates 未包含有效的 translet 類別定義。" }, { "NO_MAIN_TRANSLET_ERR", "此範本未包含名稱為 ''{0}'' 的類別。" }, { "TRANSLET_CLASS_ERR", "無法載入 Translet 類別 ''{0}''。" }, { "TRANSLET_OBJECT_ERR", "已載入 Translet 類別，但是無法建立 translet 實例。" }, { "ERROR_LISTENER_NULL_ERR", "嘗試將 ''{0}'' 的 ErrorListener 設為 null" }, { "JAXP_UNKNOWN_SOURCE_ERR", "XSLTC 只支援 StreamSource、SAXSource 與 DOMSource" }, { "JAXP_NO_SOURCE_ERR", "傳遞到 ''{0}'' 的 Source 物件沒有內容。" }, { "JAXP_COMPILE_ERR", "無法編譯樣式表" }, { "JAXP_INVALID_ATTR_ERR", "TransformerFactory 無法辨識屬性 ''{0}''。" }, { "JAXP_SET_RESULT_ERR", "setResult() 必須在 startDocument() 之前呼叫。" }, { "JAXP_NO_TRANSLET_ERR", "Transformer 沒有簡化的 translet 物件。" }, { "JAXP_NO_HANDLER_ERR", "沒有已定義的輸出處理程式供轉換結果使用。" }, { "JAXP_NO_RESULT_ERR", "傳遞到 ''{0}'' 的 Result 物件無效。" }, { "JAXP_UNKNOWN_PROP_ERR", "嘗試存取無效的 Transformer 內容 ''{0}''。" }, { "SAX2DOM_ADAPTER_ERR", "無法建立 SAX2DOM 配接卡：''{0}''。" }, { "XSLTC_SOURCE_ERR", "呼叫 XSLTCSource.build() 時，未設定 systemId 。" }, { "ER_RESULT_NULL", "結果不應為空值" }, { "JAXP_INVALID_SET_PARAM_VALUE", "參數 {0} 的值必須是有效的 Java 物件" }, { "COMPILE_STDIN_ERR", "-i 選項必須和 -o 選項一起使用。" }, { "COMPILE_USAGE_STR", "用法概要\n   java org.apache.xalan.xsltc.cmdline.Compile [-o <輸出>]\n      [-d <directory>] [-j <Jar 檔>] [-p <套件>]\n      [-n] [-x] [-u] [-v] [-h] { <stylesheet> | -i }\n\nOPTIONS\n   -o <輸出>    指定名稱 <輸出> 給產生的\n                  translet。依預設，translet 名稱是\n                  衍生自 <stylesheet> 名稱。若編譯\n                  多份樣式表時，此選項會被忽略。\n   -d <directory> 指定 translet 的目標目錄\n   -j <jarfile>   將 translet 類別封裝在 jar 檔案中，該檔案\n                  名稱由 <jarfile> 指定\n   -p <package>   指定所有產生的\n                  translet 類別之套件名稱字首。\n   -n             啟用範本列入（平均而言，預設行為較佳）。\n                  \n   -x             開啟額外的除錯訊息輸出\n   -u             將引數 <stylesheet> 解譯為 URL\n   -i             強制編譯器從 stdin 讀取樣式表\n   -v          列印編譯器的版本\n   -h             列印此用法陳述式\n" }, { "TRANSFORM_USAGE_STR", "用法概要\n   java org.apache.xalan.xsltc.cmdline.Transform [-j <Jar 檔>]\n   [-x] [-n <疊代>] {-u <document_url> | <文件>}\n      <類別> [<param1>=<value1> ...]\n\n   使用 translet <類別> 轉換指定為 <文件> 的 \n   XML 文件。translet <class> 位於\n   使用者的 CLASSPATH 中，或選擇性指定的 <jarfile> 中。\nOPTIONS\n   -j <Jar 檔>    指定用來載入 translet 的 Jar 檔\n   -x              開啟額外的除錯訊息輸出\n-n <疊代> 執行轉換 <疊代> 次以及\n                   顯示設定檔資訊\n   -u <document_url> 指定 XML 輸入文件為 URL\n" }, { "STRAY_SORT_ERR", "<xsl:sort> 只能用在 <xsl:for-each> 或 <xsl:apply-templates> 內。" }, { "UNSUPPORTED_ENCODING", "此 JVM 不支援輸出編碼 ''{0}''。" }, { "SYNTAX_ERR", "''{0}'' 中有語法錯誤。" }, { "CONSTRUCTOR_NOT_FOUND", "找不到外部建構子 ''{0}''。" }, { "NO_JAVA_FUNCT_THIS_REF", "非靜態 Java 函數 ''{0}'' 的第一個引數不是有效的物件參照。" }, { "TYPE_CHECK_ERR", "檢查表示式 ''{0}'' 的類型時發生錯誤。" }, { "TYPE_CHECK_UNK_LOC_ERR", "在不明位置檢查表示式的類型時，發生錯誤。" }, { "ILLEGAL_CMDLINE_OPTION_ERR", "指令行選項 ''{0}'' 無效。" }, { "CMDLINE_OPT_MISSING_ARG_ERR", "指令行選項 ''{0}'' 遺漏必要的引數。" }, { "WARNING_PLUS_WRAPPED_MSG", "警告：  ''{0}''\n       ：{1}" }, { "WARNING_MSG", "警告：  ''{0}''" }, { "FATAL_ERR_PLUS_WRAPPED_MSG", "嚴重錯誤：  ''{0}''\n           ：{1}" }, { "FATAL_ERR_MSG", "嚴重錯誤：  ''{0}''" }, { "ERROR_PLUS_WRAPPED_MSG", "錯誤：  ''{0}''\n     ：{1}" }, { "ERROR_MSG", "錯誤：''{0}''" }, { "TRANSFORM_WITH_TRANSLET_STR", "使用 translet ''{0}'' 進行轉換" }, { "TRANSFORM_WITH_JAR_STR", "從 Jar 檔 ''{1}'' 使用 translet ''{0}'' 進行轉換" }, { "COULD_NOT_CREATE_TRANS_FACT", "無法建立 TransformerFactory 類別 ''{0}'' 的實例。" }, { "TRANSLET_NAME_JAVA_CONFLICT", "無法使用名稱 ''{0}'' 作為 translet 類別的名稱，因為它含有在 Java 類別的名稱中不允許使用的字元。已改為使用名稱 ''{1}''。" }, { "COMPILER_ERROR_KEY", "編譯器錯誤：" }, { "COMPILER_WARNING_KEY", "編譯器警告：" }, { "RUNTIME_ERROR_KEY", "編譯器錯誤：" }, { "INVALID_QNAME_ERR", "一個值必須是 QName 或是空格分隔 QNames 清單的屬性，具有值 ''{0}''" }, { "INVALID_NCNAME_ERR", "一個值必須是 NCName 的屬性，具有值 ''{0}''" }, { "INVALID_METHOD_IN_OUTPUT", "<xsl:output> 元素的方法屬性具有值 ''{0}''。其值必須是 ''xml''、''html''、''text'' 或 qname-but-not-ncname 其中之ㄧ" }, { "JAXP_GET_FEATURE_NULL_NAME", "特性名稱在 TransformerFactory.getFeature(String name) 中不可是空值。" }, { "JAXP_SET_FEATURE_NULL_NAME", "特性名稱在 TransformerFactory.setFeature(String name, boolean value) 中不可是空值。" }, { "JAXP_UNSUPPORTED_FEATURE", "無法在這個 TransformerFactory 設定特性 ''{0}''。" } };
  }
}
