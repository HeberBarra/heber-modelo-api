package io.github.heberbarra.modelador.atualizador;

import java.io.File;
import java.net.URL;

/**
 * Responsável por lidar com as atualizações automáticas do programa.
 * @since v0.0.3-SNAPSHOT
 * */
public interface Atualizador {

    /**
     * Verifica se há alguma atualização disponível.
     * @return {@code true} caso haja uma atualização disponível.
     * */
    boolean verificarAtualizacao();

    /**
     * Atualiza automaticamente o programa caso as atualizações automáticas estejam habilitadas.
     * */
    void atualizar();

    /**
     * Baixa a última versão do programa, e substitui o programa atual pelo mais recente.
     * <p>
     * Verifica a integridade dos arquivos, se houver algum erro de integridade, ou não seja possível ler o arquivo de verificação, a atualização é cancelada.
     * <p>
     * Limpa os arquivos temporários gerados após atualizar o programa.
     * */
    void baixarAtualizacao();

    /**
     * Remove a pasta temporária criada durante o processo de atualização.
     * @param pastaTemporaria a pasta que deve ser excluída
     * */
    void limparArquivosTemporarios(File pastaTemporaria);

    /**
     * Baixa um arquivo da URL específicada e salva ele numa pasta.
     * @param pastaTemporaria a pasta na qual o arquivo deve ser salvo
     * @param urlArquivo a URL de download do arquivo
     * @param nomeArquivo o nome que o arquivo deve ter
     * */
    void baixarArquivo(File pastaTemporaria, URL urlArquivo, String nomeArquivo);
}
