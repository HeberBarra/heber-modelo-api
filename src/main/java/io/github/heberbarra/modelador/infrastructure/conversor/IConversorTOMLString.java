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
package io.github.heberbarra.modelador.infrastructure.conversor;

import java.util.List;
import java.util.Map;

/**
 * Converte um conjunto de dados para uma {@link String} TOML.
 * <br>
 * Converts a data set to a TOML {@link String}.
 * @since v0.0.1-SNAPSHOT
 * */
public interface IConversorTOMLString {

    /**
     * Converte os dados da configuração para uma {@link String} TOML.
     * <br>
     * Converts the configuration data to a {@link String} TOML.
     * @param dados os dados a serem convertidos / the data to be converted.
     * @return os dados formatados como TOML / the data formatted as TOML.
     * */
    String converterMapConfiguracaoParaStringTOML(Map<String, List<Map<String, String>>> dados);

    /**
     * Converte os dados da paleta de cores para um {@link String} TOML.
     * <br>
     * Converts the color palette data to a {@link String} TOML.
     * @param dados os dados a serem convertidos / the data to be converted.
     * @return os dados formatados como TOML / the data formatted as TOML.
     * */
    String converterMapPaletaParaStringTOML(Map<String, List<Map<String, String>>> dados);
}
