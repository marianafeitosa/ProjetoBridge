package implementacao;

/**
 * ConcreteImplementor: sabe apenas "como exportar para Excel (XLSX)".
 */
public class ExportadorExcel implements Exportador {

    @Override
    public void exportar(String tituloRelatorio, String conteudo) {
        System.out.println("[Exportador: EXCEL/XLSX]");
        System.out.println("Gerando arquivo -> " + tituloRelatorio + ".xlsx");
        System.out.println("----------------------------------------------------");
        String[] linhas = conteudo.split("\n");
        for (String linha : linhas) {
            System.out.println("| " + linha + " |");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Arquivo XLSX gerado com sucesso.\n");
    }
}
