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
package io.github.heberbarra.modelador.domain.model.json;

import java.util.Map;

/**
 * Define as propriedades de um JSON de um atributo.
 * <br>
 * Defines the JSON properties of an attribute.
 * @since v0.0.5-SNAPSHOT
 * */
public abstract class AtributoJSON {

    protected int indentacao;
    protected int nivelIndentacao;

    public AtributoJSON() {
        this.indentacao = 2;
        this.nivelIndentacao = 3;
    }

    /**
     * Converte as informações do atributo para um {@link Map}.
     * <br>
     * Converts the atribute's information to a {@link Map}
     * @return um {@link Map} contendo as informações / a {@link Map} containing the information.
     * */
    public abstract Map<String, String> converterParaMap();
}
