package io.github.heberbarra.modelador.configurador.json;

import java.util.Map;

public abstract class AtributoJson {

    protected int indentacao;
    protected int nivelIndentacao;

    public AtributoJson() {
        this.indentacao = 2;
        this.nivelIndentacao = 3;
    }

    /**
     * Converte as informações do atributo para um {@link Map}
     * @return um {@link Map} que contém as informações do atributo
     * */
    public abstract Map<String, String> converterParaMap();
}
