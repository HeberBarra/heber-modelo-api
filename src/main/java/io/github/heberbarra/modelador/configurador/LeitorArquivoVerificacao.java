package io.github.heberbarra.modelador.configurador;

import io.github.heberbarra.modelador.configurador.json.JsonVerificador;
import java.io.File;

/**
 * Responsável por ler e salvar os dados de um modelo de configuração
 * @since v0.0.2-SNAPSHOT
 * */
public abstract class LeitorArquivoVerificacao<T extends JsonVerificador<?>> {

    protected Class<T> tipoVerificador;
    protected File arquivoVerificador;
    protected T informacoesJson;

    public LeitorArquivoVerificacao(Class<T> tipoVerificador, File arquivoVerificador) {
        this.tipoVerificador = tipoVerificador;
        this.arquivoVerificador = arquivoVerificador;
    }

    /**
     * Lê o arquivo de verificação de configuração e salva as informações lidas.
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

    public T getInformacoesJson() {
        return informacoesJson;
    }

    public void setInformacoesJson(T informacoesJson) {
        this.informacoesJson = informacoesJson;
    }
}
