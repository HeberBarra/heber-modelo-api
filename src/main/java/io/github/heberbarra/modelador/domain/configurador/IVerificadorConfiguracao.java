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
package io.github.heberbarra.modelador.domain.configurador;

import java.util.List;
import java.util.Map;
import org.tomlj.TomlTable;

/**
 * Verifica a configuração do usuário e reporta os erros encontrados.
 * <p>
 * Verifies the user's configuration and report the found errors.
 * @since v0.0.2-SNAPSHOT
 * */
public interface IVerificadorConfiguracao {

    /**
     * Indica se há algum erro grave/significativo na configuração do programa.
     * <br>
     * Tells if there is any important/significant error in the program's configuration.
     *
     * @return {@code true} se houver algum erro / if there are any errors.
     * */
    boolean configuracoesContemErrosGraves();

    /**
     * Mostra as informações de cada um dos leitores registrados.
     * <br>
     * Shows the information of each registered reader.
     * */
    void mostrarInformacoes();

    /**
     * Registra um leitor de arquivo de verificador.
     * <br>
     * Registries a verifier file reader.
     * */
    void registrarLeitor(LeitorAbstratoArquivoVerificador<?> leitorAbstratoArquivoVerificador);

    /**
     * Verifica um atributo de configuração.
     * <br>
     * Verifies a configuration attribute.
     * @param atributos os atributos da configuração / the configuration attributes.
     * @param nomeAtributo o nome do atributo / the name of attribute.
     * @param valor o valor atual do atributo / the current value of the attribute.
     * */
    void verificarAtributoConfiguracao(List<Map<String, String>> atributos, String nomeAtributo, Object valor);

    /**
     * Verifica uma variável da paleta de cores. Se houver algum erro será indicado por {@link IVerificadorConfiguracao#configuracoesContemErrosGraves()}
     * <br>
     * Verifies a variable of the color palette. If there is an error it will be shown by {@link IVerificadorConfiguracao#configuracoesContemErrosGraves()}
     * @param variaveis as variáveis da paleta de cores / the variables of the color palette.
     * @param nomeVariavel o nome da variável / the variable's name.
     * @param valor o valor atual da variável / the variable's current value.
     * */
    void verificarVariavelPaleta(List<Map<String, String>> variaveis, String nomeVariavel, Object valor);

    /**
     * Verifica o arquivo de configuração e reporta os erros graves encontrados ao usuário.
     * <br>
     * Verifies the configuration file and reports all significant errors to the user.
     * @param configuracaoPadrao a configuração padrão do programa / the program's default configuration.
     * @param dados a configuração atual do programa / the program's current configuration.
     * */
    void verificarArquivoConfiguracao(Map<String, List<Map<String, String>>> configuracaoPadrao, TomlTable dados);

    /**
     * Verifica o arquivo da paleta de cores e reporta os erros graves encontrados ao usuário.
     * <br>
     * Verifies the color palette file and reports the significant errors to the user.
     * @param paletaPadrao a paleta de cores padrão do programa / the program's default color palette.
     * @param dados a paleta de cores atual do programa / the program's current color palette.
     * */
    void verificarArquivoPaleta(Map<String, List<Map<String, String>>> paletaPadrao, TomlTable dados);
}
