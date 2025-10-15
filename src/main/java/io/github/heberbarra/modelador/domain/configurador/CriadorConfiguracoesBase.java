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

import io.github.heberbarra.modelador.domain.verificador.VerificadorAbstratoJSONAtributo;

/**
 * Classe auxiliar responsável por criar a pasta e os arquivos de configuração do programa.
 * <br>
 * Helper class responsible for creating the program's configuration directory and related files.
 * @since v0.0.1-SNAPSHOT
 * */
public abstract class CriadorConfiguracoesBase {

    protected IPastaConfiguracao pastaConfiguracao;

    public CriadorConfiguracoesBase(IPastaConfiguracao pastaConfiguracao) {
        this.pastaConfiguracao = pastaConfiguracao;
    }

    /**
     * Cria a pasta na qual os arquivos de configuração serão armazenados.
     * <br>
     * Creates the program's configuration directory.
     * @see IPastaConfiguracao
     * */
    public abstract void criarPastaConfiguracao();

    /**
     * Cria o arquivo de configuração na pasta de configuração do programa.
     * <br>
     * Creates the config file in the program's configuration directory.
     * @param arquivoConfiguracoes o nome do arquivo de configuração / the name of the configuration file.
     * @see IPastaConfiguracao
     * @see CriadorConfiguracoesBase#criarPastaConfiguracao()
     * */
    public abstract void criarArquivoConfiguracoes(String arquivoConfiguracoes);

    /**
     * Cria um arquivo .env na pasta de configuração do programa, com variáveis de ambiente importantes para o sistema.
     * <br>
     * Creates a .env file in the program's default configuration directory with important environment variables.
     * */
    public abstract void criarArquivoDotEnv();

    /**
     * Cria o arquivo de paleta na pasta de configuração do programa.
     * <br>
     * Creates the palette file in the program's configuration directory.
     * @param arquivoPaleta o nome do arquivo de paleta / the name of the palette file.
     * @see IPastaConfiguracao
     * @see CriadorConfiguracoesBase#criarPastaConfiguracao()
     * */
    public abstract void criarArquivoPaleta(String arquivoPaleta);

    /**
     * Sobrescreve o arquivo de configuração do programa com os dados fornecidos.
     * <br>
     * Overwrites the program's configuration file with the provided data.
     * @param arquivoConfiguracoes o nome do arquivo de configuração que deve ser sobrescrito /
     *                             the name of the configuration file that should be overwritten.
     * @param dadosToml os dados a serem escritos no arquivo / the data that should be written into the file.
     * @see CriadorConfiguracoesBase#sobrescreverArquivoPaleta(String, String)
     * */
    public abstract void sobrescreverArquivoConfiguracoes(String arquivoConfiguracoes, String dadosToml);

    /**
     * Sobrescreve o arquivo de paleta do programa com os dados fornecidos.
     * <br>
     * Overwrites the program's palette file with provided data.
     * @param arquivoPaleta  o nome do arquivo de paleta que deve ser sobrescrito /
     *                       the name of the palette file that should be overwritten.
     * @param dadosToml os dados a serem escritos no arquivo / the data that should be written into the file.
     * @see CriadorConfiguracoesBase#sobrescreverArquivoConfiguracoes(String, String)
     * */
    public abstract void sobrescreverArquivoPaleta(String arquivoPaleta, String dadosToml);

    /**
     * Lê a configuração padrão do programa.
     * <br>
     * Reads the program's default configuration.
     * @see CriadorConfiguracoesBase#pegarDotEnvPadrao(VerificadorAbstratoJSONAtributo)
     * @see CriadorConfiguracoesBase#pegarPaletaPadrao(VerificadorAbstratoJSONAtributo)
     * */
    public abstract void pegarConfiguracaoPadrao(VerificadorAbstratoJSONAtributo<?> verificador);

    /**
     * Lê o .env padrão do sistema.
     * <br>
     * Reads the program's default .env.
     * @see CriadorConfiguracoesBase#pegarConfiguracaoPadrao(VerificadorAbstratoJSONAtributo)
     * @see CriadorConfiguracoesBase#pegarPaletaPadrao(VerificadorAbstratoJSONAtributo)
     * */
    public abstract void pegarDotEnvPadrao(VerificadorAbstratoJSONAtributo<?> verificador);

    /**
     * Lê a paleta padrão do programa.
     * <br>
     * Reads the program's default palette.
     * @see CriadorConfiguracoesBase#pegarConfiguracaoPadrao(VerificadorAbstratoJSONAtributo)
     * @see CriadorConfiguracoesBase#pegarDotEnvPadrao(VerificadorAbstratoJSONAtributo)
     * */
    public abstract void pegarPaletaPadrao(VerificadorAbstratoJSONAtributo<?> verificador);
}
