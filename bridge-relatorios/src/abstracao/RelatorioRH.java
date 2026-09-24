package abstracao;

import implementacao.Exportador;

/**
 * "RefinedAbstraction": novo relatório exigido pelo requisito de negócio
 * (Relatório de Desempenho de RH). Sua criação NÃO exigiu nenhuma alteração
 * nas classes de exportação existentes — apenas uma nova extensão de
 * Relatorio, evidenciando a aderência ao Open/Closed Principle.
 */
public class RelatorioRH extends Relatorio {

    public RelatorioRH(Exportador exportador) {
        super(exportador);
    }

    @Override
    protected String getTitulo() {
        return "Relatorio_Desempenho_RH";
    }

    @Override
    protected String gerarConteudo() {
        return "RELATORIO DE DESEMPENHO DE RH - Departamento: TI\n" +
               "Joao Silva .......... Avaliacao: 9.2\n" +
               "Maria Souza .......... Avaliacao: 8.7\n" +
               "MEDIA DA EQUIPE ........................ 8.95";
    }
}
