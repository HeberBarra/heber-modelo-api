package io.github.heberbarra.modelador.configurador.json;

import java.util.List;

/**
 * Representa um arquivo JSON de verificação para um conjunto configurações.
 * @since v0.0.2-SNAPSHOT
 * */
public abstract class JsonVerificador<T extends AtributoJson> {

    protected int indentacao;
    protected String $schema;
    protected List<T> atributos;

    public JsonVerificador() {
        indentacao = 2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n%s\"$schema\": \"%s\",%n".formatted(" ".repeat(indentacao), $schema));
        stringBuilder.append("%s\"atributos\": [\n".formatted(" ".repeat(indentacao)));
        atributos.forEach(atributo -> {
            stringBuilder.append(atributo);

            if (atributos.getLast() != atributo) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("\n");
        });
        stringBuilder.append("  ]\n}");

        return stringBuilder.toString();
    }

    public String get$schema() {
        return $schema;
    }

    public List<T> getAtributos() {
        return atributos;
    }
}
