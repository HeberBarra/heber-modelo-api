package io.github.heberbarra.modelador.configurador.toml;

import java.util.List;
import java.util.Map;

/**
 * Converte uma entrada dados para uma string de tabela TOML.
 * @since v0.0.1-SNAPSHOT
 * */
public interface ConversorToml {

    int INDENTACAO = 2;

    /**
     * Converte um {@link Map} que representa a paleta de cores do programa para a seguinte tabela:
     * <p>
     * [paleta]<br>
     * &nbsp;&nbsp;variavel="#xxxxxx"
     *
     * @param dados os dados a serem convertidos numa tabela
     * @return uma string que contém a tabela TOML criada a partir dos dados.
     * */
    String converterMapPaletaParaStringToml(Map<String, List<Map<String, String>>> dados);

    /**
     * Converte um {@link Map} que representa as tabelas do arquivo de configuração em uma tabela TOML
     * @param dados os dados a serem convertidos numa tabela
     * @return uma string que contém a tabela TOML
     * */
    String converterMapConfiguracaoParaStringToml(Map<String, List<Map<String, String>>> dados);
}
