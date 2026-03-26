import java.util.ArrayList;

public class ProdutoService {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrar(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso.");
    }

    public void remover(String nome) {
        for(Produto p: produtos) {
            if (p.getNome().equalsIgnoreCase(nome)){
                produtos.remove(p);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }
    }

    public void listar() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for(Produto p: produtos) {
            System.out.println(p);
        }
    }
}
