package implementacao;

/**
 * Interface "Implementor" do padrão Bridge.
 * Define o contrato que todo formato de exportação concreto deve cumprir.
 * A abstração (Relatorio) depende apenas desta interface, nunca de uma
 * implementação concreta — é isso que permite adicionar novos formatos
 * (ou novos relatórios) sem alterar código existente (Open/Closed Principle).
 */
public interface Exportador {
    void exportar(String tituloRelatorio, String conteudo);
}
