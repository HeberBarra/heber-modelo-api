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

import java.util.List;
import java.util.Map;
import org.tomlj.TomlTable;

/**
 * Classe auxiliar para combinar duas configurações diferentes.
 * <br>
 * Helper class for combining two distinct configuration datas.
 * @since v0.0.2-SNAPSHOT
 * */
public interface ICombinadorConfiguracoes {

    /**
     * Combina a configuração padrão do programa com a configuração utilizada pelo usuário.
     * <br>
     * Combines the program's default configuration with the user's.
     * */
    Map<String, List<Map<String, String>>> combinarConfiguracoes(
            Map<String, List<Map<String, String>>> configuracaoPadrao,
            TomlTable configuracao,
            String nomeAtributo,
            String nomeValor);
}
