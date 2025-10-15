/*
 * Copyright (C) 2025 Heber Ferreira Barra, Matheus de Assis de Paula, Matheus Jun Alves Matuda.
 *
 * Licensed under the Massachusetts Institute of Technology (MIT) License.
 * You may obtain a copy of the license at:
 *
 *   https://choosealicense.com/licenses/mit/
 *
 * A short and simple permissive license with conditions only requiring preservation of copyright and license notices.
 * Licensed works, modifications, and larger works may be distributed under different terms and without source code.
 *
 */

package io.github.heberbarra.modelador.infrastructure.acessador;

import io.github.heberbarra.modelador.domain.codigo.CodigoSaida;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;

/**
 * Provê acesso a um arquivo dentro de resources/, gerando uma cópia temporária deste recurso.
 * <br>
 * Provides access to a file inside resources/, generating a temporary copy of that resource.
 * @since v0.0.2-SNAPSHOT
 * */
public interface IAcessadorRecurso {

    /**
     * Provê o recurso solicitado como um {@link InputStream}, caso não seja possível encontrá-lo o programa será
     * encerrado com o código de saída: {@link CodigoSaida#RECURSO_NAO_ENCONTRADO}. O caminho do recurso deve após
     * a pasta resources/.
     * <br>
     * Provides the given resource as an {@link InputStream}, if it's not possible to find the given resource
     * the program will be terminated with the following code: {@link CodigoSaida#RECURSO_NAO_ENCONTRADO}.
     * The resource's path should start after the resources/ folder.
     * @param caminhoRecurso o caminho até o recurso / the path to the resource.
     * @return os dados do recurso como um {@link InputStream} / the resource's information as an {@link InputStream}.
     * */
    InputStream pegarRecurso(String caminhoRecurso);

    /**
     * @param caminhoRecurso o caminho até o recurso / the path to the resource.
     * @return o recurso como um {@link File} / the resource as a {@link File}.
     * @see IAcessadorRecurso#pegarRecurso(String)
     * */
    File pegarArquivoRecurso(String caminhoRecurso);

    /**
     * @param caminhoRecurso o caminho até o recurso / the path to the resource.
     * @return o recurso como um {@link Path} / the resource as a {@link Path}.
     * @see IAcessadorRecurso#pegarRecurso(String)
     * */
    default Path pegarCaminhoRecurso(String caminhoRecurso) {
        return pegarArquivoRecurso(caminhoRecurso).toPath();
    }

    /**
     * Pega o valor de uma variável de ambiente, a variável deve estar no PATH do sistema ou no arquivo ENV do programa.
     * <br>
     * Gets the value of an environment variable, the variable should be in the system path or in the program's ENV file.
     * @param nomeVariavel o nome da variável de ambiente / the name of environment variable.
     * @return valor da variável de ambiente ou uma {@link String} vazia se a variável não foi encontrada /
     * the value of the environment variable ou an empty {@link String} if the variable wasn't found.
     * */
    String pegarValorVariavelAmbiente(String nomeVariavel);
}
