package io.github.heberbarra.modelador.configurador;

import java.util.List;
import java.util.Map;
import org.tomlj.TomlTable;

/**
 * Analisa a configuração do usuário, e reporta os erros encontrados.
 * @since v0.0.2-SNAPSHOT
 * */
public interface VerificadorConfiguracao {

    /**
     * Diz se há algum erro grave/significativo na configuração do programa.
     * @return {@code true} Caso haja algum erro
     * */
    boolean configuracoesContemErrosGraves();

    /**
     * Registra um novo leitor de arquivo de verificação de configuração.
     * */
    void registrarLeitor(LeitorArquivoVerificacao leitorArquivoConfiguracao);

    /**
     * Exibe as informações de cada um dos leitores registrados.
     * @see LeitorArquivoVerificacao
     * */
    void mostrarInformacoes();

    /**
     * Verifica o arquivo de configuração e reporta os erros encontrados ao usuário.
     * @param configuracaoPadrao a configuração padrão do programa, que serve de base para a verificação
     * @param dados a configuração feita pelo usuário
     * */
    void verificarArquivoConfiguracao(Map<String, List<Map<String, String>>> configuracaoPadrao, TomlTable dados);

    /**
     * Verifica se um atributo existe ou não, e se o seu valor é válido.
     * @param atributos todos os atributos da configuração padrão
     * @param nomeAtributo o nome do atributo a ser verificado
     * @param valor o valor do atributo a ser verificado
     * */
    void verificarAtributoConfiguracao(List<Map<String, String>> atributos, String nomeAtributo, Object valor);

    /**
     * Verifica o arquivo da paleta de cores e reporta os erros encontrados ao usuário, caso a tabela "paleta" não seja encontrada um erro grave é reportado.
     * @param paletaPadrao a paleta de cores padrão do programa
     * @param dados a configuração da paleta feita pelo usuário
     * */
    void verificarArquivoPaleta(Map<String, List<Map<String, String>>> paletaPadrao, TomlTable dados);

    /**
     * Verifica uma variável específica da paleta de cores, caso o valor da variável não esteja no formato apropriado um erro grave é reportado.
     * O valor de cada variável deve seguir o seguinte formato: {@code #000000}
     * @param variaveis as variáveis da paleta padrão
     * @param nomeVariavel o nome da variável a ser verificada
     * @param valor o valor da variável a ser verificada
     * */
    void verificarVariavelPaleta(List<Map<String, String>> variaveis, String nomeVariavel, Object valor);
}
