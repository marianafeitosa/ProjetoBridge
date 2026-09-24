package implementacao;

/**
 * ConcreteImplementor: sabe apenas "como exportar para PDF".
 * Não tem nenhum conhecimento sobre qual relatório está sendo exportado.
 */
public class ExportadorPDF implements Exportador {

    @Override
    public void exportar(String tituloRelatorio, String conteudo) {
        System.out.println("[Exportador: PDF]");
        System.out.println("Gerando arquivo -> " + tituloRelatorio + ".pdf");
        System.out.println("----------------------------------------------------");
        System.out.println("%PDF-1.7 (simulado)");
        System.out.println(conteudo);
        System.out.println("----------------------------------------------------");
        System.out.println("Arquivo PDF gerado com sucesso.\n");
    }
}
