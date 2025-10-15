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

/**
 * Recarrega a configuração do programa quando uma mudança nos arquivos é detectada.
 * <br>
 * Reloads the program's configuration when a change in the files is detected.
 *
 * @since v0.0.7-SNAPSHOT
 * */
public interface IWatcherConfiguracao extends Runnable {

    /**
     * Lê novamente os arquivos de configuração do programa.
     * <br>
     * Rereads the program's configuration files.
     * */
    void recarregarConfiguracao();
}
