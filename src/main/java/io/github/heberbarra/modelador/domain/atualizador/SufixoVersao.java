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
package io.github.heberbarra.modelador.domain.atualizador;

/**
 * Define o valor de cada um dos sufixos das versões semânticas.
 * <br>
 * Defines the value of each semver suffix.
 *
 * @since v0.0.3-SNAPSHOT
 * */
public enum SufixoVersao {
    SNAPSHOT(0),
    ALPHA(1),
    BETA(2),
    PRE_RELEASE(3),
    RELEASE(4);

    public final int valor;

    SufixoVersao(int valor) {
        this.valor = valor;
    }
}
