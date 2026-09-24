package cliente;

import abstracao.Relatorio;
import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.Exportador;
import implementacao.ExportadorExcel;
import implementacao.ExportadorHTML;
import implementacao.ExportadorPDF;

/**
 * Classe cliente: demonstra o desacoplamento promovido pelo padrão Bridge.
 * Em nenhum ponto uma classe de "abstracao" instancia diretamente uma
 * classe de "implementacao" — toda montagem de dependências acontece aqui,
 * no cliente, e é injetada via construtor / setter.
 *
 * Autoria: Mariana Akemi Arashiro Santos Feitosa e Giovana Marsigli Rodrigues
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("### ROTINA 1: Relatorio de Vendas em PDF ###\n");
        Exportador exportadorPDF = new ExportadorPDF();
        Relatorio relatorioVendas = new RelatorioVendas(exportadorPDF); // injecao via construtor
        relatorioVendas.gerar();

        System.out.println("### ROTINA 2: Alteracao dinamica (runtime) do mesmo relatorio para Excel ###\n");
        Exportador exportadorExcel = new ExportadorExcel();
        relatorioVendas.setExportador(exportadorExcel); // troca de implementador em tempo de execucao
        relatorioVendas.gerar();

        System.out.println("### ROTINA 3: Relatorio de Desempenho de RH em HTML ###\n");
        Exportador exportadorHTML = new ExportadorHTML();
        Relatorio relatorioRH = new RelatorioRH(exportadorHTML);
        relatorioRH.gerar();

        System.out.println("### FIM DA VALIDACAO ###");
    }
}
