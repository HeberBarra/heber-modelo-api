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
 * Determina em qual pasta os arquivos da configuração serão criados. A escolha é feita conforme o sistema operacional,
 * ou se provida, com base na variável de ambiente {@code HEBER_MODELO_CONFIG_DIR}. Também, se estiver definida,
 * a variável de ambiente {@code XDG_CONFIG_HOME} é usada.
 * <br>
 * Determines the folder where the configuration files will be placed. The choice is made based on the operational
 * system, or if provided, following the environment variable {@code HEBER_MODELO_CONFIG_DIR}. Also, if the defined,
 * the environment variable {@code XDG_CONFIG_HOME} is used.
 *
 * <li>GNU/Linux: {@code ~/.config/Heber-Modelo/}
 * <li>MacOS: {@code ~/Library/Preferences/Heber-Modelo/}
 * <li>Windows: {@code %AppData%/Heber-Modelo/}
 * <li>Outro/Other: {@code ~/.config/Heber-Modelo/}
 * @since v0.0.1-SNAPSHOT
 * */
public interface IPastaConfiguracao {

    /**
     * Cria a pasta de configuração do programa.
     * <br>
     * Creates the program's configuration folder.
     * */
    void criarPastaConfiguracao();

    /**
     * Decide a pasta de configuração do programa.
     * <br>
     * Decides the program's configuration folder.
     * @return o caminho da pasta / the path to the configuration folder.
     * */
    String decidirPastaConfiguracao();
}
