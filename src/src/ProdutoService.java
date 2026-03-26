import java.util.ArrayList;

public class ProdutoService {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrar(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso.");
    }

}
