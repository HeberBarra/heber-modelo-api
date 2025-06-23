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

import java.io.File;
import java.net.URL;

/**
 * Responsável por lidar com as atualizações automáticas do programa.
 * <br>
 * Responsible for managing the process of updating the program.
 * @since v0.0.3-SNAPSHOT
 * */
public interface IAtualizador {

    /**
     * Atualiza automaticamente o programa caso as atualizações automáticas estejam ativas.
     * <br>
     * Updates the program automatically if auto updates are on.
     * */
    void atualizar();

    /**
     * Baixa o arquivo selecionado e o coloca na pasta temporária.
     * <br>
     * Downloads the selected file and places it in the temporary folder.
     * @param pastaTemporaria a pasta temporária de destino / target temporary folder
     * @param urlArquivo a URL do arquivo desejado / the URL of the desired file
     * @param nomeArquivo o nome do arquivo baixado / the name of the downloaded file
     * */
    void baixarArquivo(File pastaTemporaria, URL urlArquivo, String nomeArquivo);

    /**
     * Baixa a última atualização do programa.
     * <br>
     * Downloads the latest update.
     * */
    void baixarAtualizacao();

    /**
     * Apaga todos os arquivos da pasta temporária.
     * <br>
     * Deletes every file inside the temporary folder.
     *
     * @param pastaTemporaria a pasta temporária a ser apagada / the temporary folder that will be deleted.
     * */
    void limparArquivosTemporarios(File pastaTemporaria);

    /**
     * Verifica se há alguma atualização disponível.
     * <br>
     * Checks to see if there is an update available.
     * */
    boolean verificarAtualizacaoDisponivel();

}
