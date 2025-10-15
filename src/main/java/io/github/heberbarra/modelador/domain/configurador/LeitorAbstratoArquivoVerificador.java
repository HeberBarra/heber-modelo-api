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
package io.github.heberbarra.modelador.domain.configurador;

import io.github.heberbarra.modelador.domain.verificador.VerificadorAbstratoJSONAtributo;
import java.io.File;

/**
 * Responsável por ler e salvar os dados de um modelo de configuração.
 * <br>
 * Responsible for reading and salving the data of a configuration model.
 * @since v0.0.2-SNAPSHOT
 * */
public abstract class LeitorAbstratoArquivoVerificador<T extends VerificadorAbstratoJSONAtributo<?>> {

    protected Class<T> tipoVerificador;
    protected File arquivoVerificador;
    protected T informacoesJSON;

    public LeitorAbstratoArquivoVerificador(Class<T> tipoVerificador, File arquivoVerificador) {
        this.tipoVerificador = tipoVerificador;
        this.arquivoVerificador = arquivoVerificador;
    }

    /**
     * Lê o arquivo verificador de configuração e salva as informações lidas.
     * <br>
     * Reads the configuration verifier file and salves the read information.
     * */
    public abstract void lerArquivo();

    public Class<T> getTipoVerificador() {
        return tipoVerificador;
    }

    public void setTipoVerificador(Class<T> tipoVerificador) {
        this.tipoVerificador = tipoVerificador;
    }

    public File getArquivoVerificador() {
        return arquivoVerificador;
    }

    public void setArquivoVerificador(File arquivoVerificador) {
        this.arquivoVerificador = arquivoVerificador;
    }

    public T getInformacoesJSON() {
        return informacoesJSON;
    }

    public void setInformacoesJSON(T informacoesJSON) {
        this.informacoesJSON = informacoesJSON;
    }
}
