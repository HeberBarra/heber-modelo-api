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
package io.github.heberbarra.modelador.domain.verificador;

import io.github.heberbarra.modelador.domain.model.json.AtributoJSON;
import java.util.List;

/**
 * Representa um arquivo JSON verificador para um conjunto de configurações.
 * <br>
 * Represents a verifier JSON file for a group of configurations.
 * @since v0.0.2-SNAPSHOT
 * */
public abstract class VerificadorAbstratoJSONAtributo<T extends AtributoJSON> {

    protected int indentacao;
    protected String $schema;
    protected List<T> atributos;

    public VerificadorAbstratoJSONAtributo() {
        indentacao = 2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n%s\"$schema\": \"%s\",%n}".formatted(" ".repeat(indentacao), this.$schema));
        stringBuilder.append("%s\"atributos\": [%n".formatted(" ".repeat(indentacao)));

        atributos.forEach(atributo -> {
            stringBuilder.append(atributo);

            if (atributos.getLast() != atributo) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("%n".formatted());
        });
        stringBuilder.append("%s]%n}".formatted(" ".repeat(indentacao)));

        return stringBuilder.toString();
    }

    public String get$schema() {
        return $schema;
    }

    public List<T> getAtributos() {
        return atributos;
    }
}
