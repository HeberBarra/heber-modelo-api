package io.github.heberbarra.modelador.configurador;

/**
 * Determina em qual pasta os arquivos de configuração serão criados.
 * <p>
 * A escolha é determinada com base no sistema operacional e se for providenciada pela variável de ambiente {@code HEBER_MODELO_CONFIG_DIR}
 * <p>
 * A pasta respectiva de cada sistema operacional é a seguinte:
 * <li>GNU/Linux: .config/Heber-Modelo/
 * <li>MacOS: $HOME/Library/Preferences/Heber-Modelo/
 * <li>Windows: %AppData%/Heber-Modelo/
 * <li>Outro: .config/Heber-Modelo/
 * <p>
 * A variável de ambiente {@code XDG_CONFIG_HOME}, caso presente, é utilizada para decidir o local das configurações
 *
 * @since v0.0.1-SNAPSHOT
 */
public abstract class PastaConfiguracao {

    public abstract void criarPastaConfiguracao();

    public abstract String decidirPastaConfiguracao();
}
