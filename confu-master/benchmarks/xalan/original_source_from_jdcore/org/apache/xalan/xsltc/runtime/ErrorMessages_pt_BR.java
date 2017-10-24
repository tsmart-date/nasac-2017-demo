package org.apache.xalan.xsltc.runtime;

import java.util.ListResourceBundle;













































































public class ErrorMessages_pt_BR
  extends ListResourceBundle
{
  public ErrorMessages_pt_BR() {}
  
  public Object[][] getContents()
  {
    return new Object[][] { { "RUN_TIME_INTERNAL_ERR", "Erro interno de tempo de execução em ''{0}''" }, { "RUN_TIME_COPY_ERR", "Erro de tempo de execução ao executar <xsl:copy>." }, { "DATA_CONVERSION_ERR", "Conversão inválida de ''{0}'' em ''{1}''." }, { "EXTERNAL_FUNC_ERR", "Função externa ''{0}'' não suportada por XSLTC." }, { "EQUALITY_EXPR_ERR", "Tipo de argumento desconhecido na expressão de igualdade. " }, { "INVALID_ARGUMENT_ERR", "Tipo de argumento inválido ''{0}'' na chamada para ''{1}''" }, { "FORMAT_NUMBER_ERR", "Tentando formatar o número ''{0}'' utilizando o padrão ''{1}''." }, { "ITERATOR_CLONE_ERR", "Não é possível clonar o iterador ''{0}''." }, { "AXIS_SUPPORT_ERR", "O iterador do eixo ''{0}'' não é suportado. " }, { "TYPED_AXIS_SUPPORT_ERR", "O iterador do eixo digitado ''{0}'' não é suportado. " }, { "STRAY_ATTRIBUTE_ERR", "Atributo ''{0}'' fora do elemento. " }, { "STRAY_NAMESPACE_ERR", "Declaração de espaço de nomes ''{0}''=''{1}'' fora do elemento. " }, { "NAMESPACE_PREFIX_ERR", "O espaço de nomes do prefixo ''{0}'' não foi declarado. " }, { "DOM_ADAPTER_INIT_ERR", "DOMAdapter criado utilizando tipo incorreto de DOM de origem." }, { "PARSER_DTD_SUPPORT_ERR", "O analisador SAX que está sendo utilizado não trata de eventos de declaração de DTD." }, { "NAMESPACES_SUPPORT_ERR", "O analisador SAX que está sendo utilizado não possui suporte para Namespaces XML." }, { "CANT_RESOLVE_RELATIVE_URI_ERR", "Não foi possível resolver a referência de URI ''{0}''." }, { "UNSUPPORTED_XSL_ERR", "Elemento XSL não suportado ''{0}''" }, { "UNSUPPORTED_EXT_ERR", "Extensão XSLTC não reconhecida ''{0}''" }, { "UNKNOWN_TRANSLET_VERSION_ERR", "O translet especificado, ''{0}'', foi criado com o uso de uma versão do XSLTC mais recente que a versão do tempo de execução XSLTC atualmente em uso. É necessário recompilar a folha de estilo ou utilizar uma versão mais recente do XSLTC para executar esse translet." }, { "INVALID_QNAME_ERR", "Um atributo cujo valor deve ser um QName apresentou o valor ''{0}''" }, { "INVALID_NCNAME_ERR", "Um atributo cujo valor deve ser um NCName apresentou o valor ''{0}''" }, { "UNALLOWED_EXTENSION_FUNCTION_ERR", "O uso da função de extensão ''{0}'' não é permitido quando o recurso de processamento seguro é definido como true." }, { "UNALLOWED_EXTENSION_ELEMENT_ERR", "O uso do elemento de extensão ''{0}'' não é permitido quando o recurso de processamento seguro é definido como true." } };
  }
}
