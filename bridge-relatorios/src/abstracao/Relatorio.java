package abstracao;

import implementacao.Exportador;

/**
 * "Abstraction" do padrão Bridge.
 *
 * Mantém uma referência ao "Implementor" (Exportador), mas NUNCA instancia
 * um exportador concreto diretamente (proibido usar "new ExportadorX()"
 * aqui). A dependência é sempre injetada via construtor (Dependency
 * Injection), e pode ser trocada em tempo de execução através de
 * setExportador(), o que é a essência da "ponte": a hierarquia de
 * relatórios e a hierarquia de formatos de exportação variam de forma
 * independente.
 */
public abstract class Relatorio {

    protected Exportador exportador;

    protected Relatorio(Exportador exportador) {
        this.exportador = exportador;
    }

    /** Permite trocar o formato de exportação dinamicamente, sem recriar o relatório. */
    public void setExportador(Exportador exportador) {
        this.exportador = exportador;
    }

    /** Cada relatório concreto sabe montar seu próprio conteúdo. */
    protected abstract String gerarConteudo();

    /** Cada relatório concreto define seu próprio título/nome de arquivo. */
    protected abstract String getTitulo();

    /** Template method: delega a exportação ao Implementor injetado. */
    public void gerar() {
        exportador.exportar(getTitulo(), gerarConteudo());
    }
}
