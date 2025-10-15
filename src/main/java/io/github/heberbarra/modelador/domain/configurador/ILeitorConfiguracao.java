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

import java.util.Map;
import java.util.Optional;
import org.tomlj.TomlTable;

public interface ILeitorConfiguracao {

    void lerArquivos();

    <T> Optional<T> pegarValorConfiguracao(String categoria, String atributo, Class<T> tipo);

    String pegarCorPaleta(String nomeVariavel);

    Map<String, String> pegarVariaveisPaleta();

    TomlTable lerArquivo(String nomeArquivo);

    TomlTable lerArquivoConfiguracoesSemSalvar();

    TomlTable lerArquivoPaletaSemSalvar();

    String[] pegarStringConfiguracao();
}
