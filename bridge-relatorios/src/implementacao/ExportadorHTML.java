package implementacao;

/**
 * ConcreteImplementor: sabe apenas "como exportar para HTML".
 */
public class ExportadorHTML implements Exportador {

    @Override
    public void exportar(String tituloRelatorio, String conteudo) {
        System.out.println("[Exportador: HTML]");
        System.out.println("Gerando arquivo -> " + tituloRelatorio + ".html");
        System.out.println("----------------------------------------------------");
        System.out.println("<html><body>");
        System.out.println("<h1>" + tituloRelatorio + "</h1>");
        for (String linha : conteudo.split("\n")) {
            System.out.println("<p>" + linha + "</p>");
        }
        System.out.println("</body></html>");
        System.out.println("----------------------------------------------------");
        System.out.println("Arquivo HTML gerado com sucesso.\n");
    }
}
