/*
 * Copyright (C) 2025 Heber Ferreira Barra, Matheus de Assis de Paula, Matheus Jun Alves Matuda.
 *
 * Licensed under the Massachusetts Institute of Technology (MIT) License.
 * You may obtain a copy of the license at:
 *
 *  https://choosealicense.com/licenses/mit/
 *
 * A short and simple permissive license with conditions only requiring preservation of copyright and license notices.
 * Licensed works, modifications, and larger works may be distributed under different terms and without source code.
 *
 */

package io.github.heberbarra.modelador.domain.configurador;

import java.util.Map;
import java.util.Optional;
import org.tomlj.TomlTable;

/**
 * Classe auxiliar responsável por ler os arquivos de configuração do programa.
 * <br>
 * Helper class responsible for reading the program's configuration files.
 * @since v0.0.2-SNAPSHOT
 * */
public interface ILeitorConfiguracao {

    /**
     * Lê os arquivos de configuração do programa.
     * <br>
     * Reads the program's configuration files
     * */
    void lerArquivos();

    /**
     * Pega o valor de um atributo da configuração.
     * <br>
     * Gets the value of a configuration attribute.
     * @param categoria a categoria do atributo / the atribute's category.
     * @param atributo o nome do atributo / the atribute's name.
     * @param tipo a classe/tipo do atributo / the atribute's class/type.
     * */
    <T> Optional<T> pegarValorConfiguracao(String categoria, String atributo, Class<T> tipo);

    /**
     * Pega o código hexadecimal de uma variável específica da paleta.
     * <br>
     * Gets the hexadecimal code of a specified variable of color palette.
     * @param nomeVariavel o nome da variável / the name of the variable.
     * @return o código hexadecimal da cor / the color's hexadecimal code.
     * */
    String pegarCorPaleta(String nomeVariavel);

    /**
     * Pega todas as variáveis da paleta com seus respectivos códigos hexadecimais.
     * <br>
     * Gets all palette's variables with their respective hexadecimal codes.
     * @return um {@link Map} contendo as variáveis / a {@link Map} containing all the variables.
     * */
    Map<String, String> pegarVariaveisPaleta();

    /**
     * Lê o arquivo TOML especificado e retorna os dados lidos.
     * <br>
     * Reads the specified TOML file and returns the read data.
     * @param nomeArquivo o nome do arquivo a ser lido / the name of the file to be read.
     * @return os dados lidos do arquivo / the data read from the file.
     * */
    TomlTable lerArquivo(String nomeArquivo);

    /**
     * Lê o arquivo de configuração do programa e retorna seus dados, mas não os armazena.
     * <br>
     * Reads the programa's configuration file and returns the data read, but don't store it.
     * @return os dados lidos do arquivo / the data read from the file.
     * */
    TomlTable lerArquivoConfiguracoesSemSalvar();

    /**
     * Lê o arquivo de paleta do programa e retorna seus dados, mas não os armazena.
     * <br>
     * Reads the programa's palette file and returns the data read, but don't store it.
     * @return os dados lidos do arquivo / the data read from the file.
     * */
    TomlTable lerArquivoPaletaSemSalvar();

    String[] pegarStringConfiguracao();

    /**
     * Retorna os dados lidos previamente do arquivo de configuração.
     * <br>
     * Returns the previously read data from the configuration file.
     * @return os dados lidos do arquivo de configuração / the data read from the configuration file.
     * */
    TomlTable getInformacoesConfiguracoes();

    /**
     * Retorna os dados lidos previamente do arquivo de paleta.
     * <br>
     * Returns the previously read data from the palette file.
     * @return os dados lidos do arquivo de paleta / the data read from the palette file.
     * */
    TomlTable getInformacoesPaleta();

}
