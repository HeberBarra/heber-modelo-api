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

package io.github.heberbarra.modelador.domain.argumento;

import java.util.List;

/**
 * Define a lógica que será executada para determinadas opções/flags passadas pela linha de comando,
 * para evitar problemas as classes que herdarem desta devem definir as flags permitidas e
 * sua descrição já no seu construtor.
 * <br>
 * Defines the logic that will be executed for a list of flags passed through the command line,
 * to avoid problems the classes that inherit this one should define the allowed flags and
 * the description in the constructor.
 *
 * @since v0.0.4-SNAPSHOT
 * */
public abstract class Argumento {

    protected List<String> flagsPermitidas;
    protected String descricao;

    /**
     * A lógica que deverá ser executada quando uma das flags listadas for passada para o programa.
     * <p></p>
     * The logic that should be executed when one of the listed flags is passed to the program.
     * */
    public abstract void run();

    /**
     * Verifica se a flag passada está na lista permitidas.
     * <br>
     * Verifies if the searched flag is in the allowed list.
     * @param flag a flag procurada / the searched flag.
     * @return {@code true} caso a flag tenha sido encontrada / if the flag searched was found.
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
