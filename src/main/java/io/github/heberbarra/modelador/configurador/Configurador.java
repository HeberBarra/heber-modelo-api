package io.github.heberbarra.modelador.configurador;

import io.github.heberbarra.modelador.codigosaida.CodigoSaida;
import java.util.Map;

/**
 * Gerencia as configurações do programa, e permite acesso fácil às mesmas.
 * <p>
 * Utiliza o anti pattern {@code Singleton} para garantir o compartilhamento das informações entre os utilizadores.
 */
public interface Configurador {

    /**
     * Cria a pasta e os arquivos de configuração se os mesmo não existirem.
     * */
    void criarArquivos();

    void lerConfiguracaoPadrao();

    /**
     * Verifica se há algum erro na configuração do programa, caso haja um erro o grave o programa é encerrado com
     * o código de saída: {@link CodigoSaida#ERRO_CONFIGURACOES}.
     * */
    void lerConfiguracao();

    /**
     * Exibe a configuração atual do programa.
     * */
    void mostrarConfiguracao();

    /**
     * Atualiza a configuração do programa, mantendo os valores, com novas opções, se houverem, de configuração.
     * */
    void combinarConfiguracoes();

    /**
     * Pega o código hexadecimal de uma cor específica da paleta.
     * @param nomeVariavel o nome da variável na paleta de cores
     * @return o código hexadecimal da cor
     * */
    String pegarCorPaleta(String nomeVariavel);

    /**
     * Pega todas as variáveis da paleta com seus respectivos códigos hexadecimais
     * @return um {@link Map} contendo as informações da paleta de cores
     * */
    Map<String, String> pegarInformacoesPaleta();

    /**
     * Pega o valor de um atributo específico, sendo necessário indicar o nome, a tabela e o tipo do atributo.
     * @param categoria a tabela/categoria na qual se encontra o atributo desejado
     * @param atributo o nome do atributo desejado
     * @param tipoAtributo o tipo do atributo, devendo ser de um dos seguintes tipos: {@code String}, {@code long}, {@code double} ou {@code boolean}
     * @param <T> o tipo do atributo
     * @return o valor do atributo requirido ou {@code null} caso o valor não tenha sido encontrado.
     * */
    <T> T pegarValorConfiguracao(String categoria, String atributo, Class<T> tipoAtributo);
}
