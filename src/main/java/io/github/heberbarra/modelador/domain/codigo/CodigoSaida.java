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

package io.github.heberbarra.modelador.domain.codigo;

/**
 * Define o que cada código de saída significa.
 * <br>
 * Define what each exit code means.
 * @since v0.0.4-SNAPSHOT
 * */
public enum CodigoSaida {
    OK(0),
    ERRO_CRIACAO_CONFIG(1),
    ERRO_CONFIGURACOES(2),
    ERRO_CRIACAO_ARQUIVO_TEMP(3),
    ERRO_LEITURA_ARQUIVO(4),
    RECURSO_NAO_ENCONTRADO(5),
    ERRO_CRIACAO_URLS(6),
    ERRO_CONEXAO(7),
    PROTOCOLO_INVALIDO(8),
    ERRO_LEITURA_RESPONSE(9),
    ERRO_CONVERSAO_RESPONSE(10),
    ALGORITMO_INVALIDO(11),
    ERRO_PEGAR_VERSAO(12),
    ERRO_PEGAR_CONSTRUTOR(13),
    ERRO_CRIACAO_OBJETO(14),
    ACESSO_NEGADO(15);

    final int codigo;

    CodigoSaida(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
