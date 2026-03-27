public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    public Produto(String nome, double preco, int quantidade, String categoria) {

        if (preco <= 0) {
            throw new ValorInvalidoException("Preço inválido" + preco);
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }
}
