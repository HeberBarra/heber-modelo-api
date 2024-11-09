package io.github.heberbarra.modelador.argumento;

import java.util.List;

/**
 * Define a lógica que será executada para determinadas opções/flags passadas pela linha de comando,
 * para evitar problemas as classes que herdarem desta devem definir as flags permitidas e
 * sua descrição já no seu construtor.
 * @since v0.0.4-SNAPSHOT
 * */
public abstract class Argumento {

    protected List<String> flagsPermitidas;
    protected String descricao;

    /**
     * A lógica que deverá ser executada quando uma das flags listadas for passada para o programa.
     * */
    public abstract void run();

    /**
     * Verifica se a flag passada está na lista permitidas.
     * @param flag a flag procurada
     * @return {@code true} caso a flag tenha sedio encontrada
     * */
    public boolean contemFlag(String flag) {
        return flagsPermitidas.contains(flag);
    }

    public List<String> getFlagsPermitidas() {
        return flagsPermitidas;
    }

    public void setFlagsPermitidas(List<String> flagsPermitidas) {
        this.flagsPermitidas = flagsPermitidas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
