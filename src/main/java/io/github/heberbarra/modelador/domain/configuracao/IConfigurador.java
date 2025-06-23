/**
 * Copyright (C) 2025 Heber Ferreira Barra, Matheus de Assis de Paula, Matheus Jun Alves Matuda.
 * <p>
 * Licensed under the Massachusetts Institute of Technology (MIT) License.
 * You may obtain a copy of the license at:
 * <p>
 * https://choosealicense.com/licenses/mit/
 * <p>
 * A short and simple permissive license with conditions only requiring preservation of copyright and license notices.
 * Licensed works, modifications, and larger works may be distributed under different terms and without source code.
 */
package io.github.heberbarra.modelador.domain.configuracao;

import java.util.Map;

/**
 * Gerencia a configuração do programa, e permite fácil acesso à mesma.
 * Utiliza o antipattern Singleton para compartilhar as informações entre todos os utilizadores.
 * <br>
 * Manages the program's configuration and allow easy access to it.
 * Utilizes the singleton antipattern to share information between users.
 *
 * @since v0.0.1-SNAPSHOT
 * */
public interface IConfigurador {

    /**
     * Atualiza a configuração do programa, combinando seus valores, se houver, com as novas opções de configuração.
     * <br>
     * Updates the program's configuration, combining its values with the new configuration options(if any).
     * */
    void combinarConfiguracoes();

    /**
     * Cria a pasta e os arquivos de configuração.
     * <br>
     * Creates the configuration folder and files.
     * */
    void criarArquivos();

    /**
     * Lê os arquivos de configuração.
     * <br>
     * Reads the configuration files.
     * */
    void lerConfiguracao();

    /**
     * Lê a configuração padrão do programa
     * <br>
     * Reads the program's default configuration.
     * */
    void lerConfiguracaoPadrao();

    /**
     * Exibe a configuração atual do programa.
     * <br>
     * Shows the program's current configuration.
     * */
    void mostrarConfiguracao();

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
    Map<String, String> pegarInformacoesPaleta();

    /**
     * Pega o valor de um atributo da configuração.
     * <br>
     * Gets the value of a configuration attribute.
     * @param categoria a categoria do atributo / the atribute's category.
     * @param atributo o nome do atributo / the atribute's name.
     * @param tipoAtributo a classe/tipo do atributo / the atribute's class/type.
     * */
    <T> T pegarValorConfiguracao(String categoria, String atributo, Class<T> tipoAtributo);

}
