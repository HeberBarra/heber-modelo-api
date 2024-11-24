package io.github.heberbarra.modelador.recurso;

import io.github.heberbarra.modelador.codigosaida.CodigoSaida;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;

/**
 * Provê acesso facilitado a um arquivo dentro de resources/ gerando uma cópia temporária do recurso solicitado.
 * Não há necessidade de criar um objeto dessa classe.
 * @since v0.0.2-SNAPSHOT
 * */
public interface Recurso {

    /**
     * Provê o recurso solicitado como um {@link InputStream}. Caso não seja possível pegar o recurso solicitado,
     * o programa é encerrado com o código de saída apropriado: {@link CodigoSaida#RECURSO_NAO_ENCONTRADO}.
     * @param caminhoRecurso o caminho até o recurso solicitado, deve-se omitir src/main/resources/ e resources/
     * @return uma {@link InputStream} com os dados do recurso solicitado
     * */
    InputStream pegarRecurso(String caminhoRecurso);

    /**
     * Provê o recurso solicitado como um {@link File}. Encerra o programa com o código de erro apropriado caso não
     * seja possível criar o arquivo temporário: {@link CodigoSaida#ERRO_CRIACAO_ARQUIVO_TEMP}.
     * @param caminhoRecurso o caminho até o recurso solicitado
     * @return um {@link File} que contém os dados do recurso solicitado
     * @see #pegarRecurso(String)
     * */
    File pegarArquivoRecurso(String caminhoRecurso);

    /**
     * Provê o recurso como um {@link Path} que possui os dados do recurso solicitado
     * @param caminhoRecurso o caminho até o recurso solicitado
     * @return um {@link Path} que possui os dados do recurso solicitado
     * */
    default Path pegarCaminhoRecurso(String caminhoRecurso) {
        return pegarArquivoRecurso(caminhoRecurso).toPath();
    }

    /**
     * Pega o valor de uma variável de ambiente.
     * @param nomeVariavel o nome da variável de ambiente, cujo valor se deseja obter
     * @return o valor da variável como uma {@link String}
     * */
    String pegarValorVariavelAmbiente(String nomeVariavel);

}
