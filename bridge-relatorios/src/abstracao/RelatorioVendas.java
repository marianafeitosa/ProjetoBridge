package abstracao;

import implementacao.Exportador;

/**
 * "RefinedAbstraction": relatório de vendas do sistema legado.
 */
public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(Exportador exportador) {
        super(exportador);
    }

    @Override
    protected String getTitulo() {
        return "Relatorio_de_Vendas";
    }

    @Override
    protected String gerarConteudo() {
        return "RELATORIO DE VENDAS - Periodo: Setembro/2026\n" +
               "Produto A .......... 120 un. .......... R$ 12.000,00\n" +
               "Produto B .......... 85 un. ........... R$ 8.500,00\n" +
               "TOTAL GERAL ........................... R$ 20.500,00";
    }
}
