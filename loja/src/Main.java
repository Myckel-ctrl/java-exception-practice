import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProdutoService service = new ProdutoService();
        Scanner read = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5) {
            try {
                System.out.println("\n1 - Cadastrar produto");
                System.out.println("2 - Listar produtos");
                System.out.println("3 - Buscar produto");
                System.out.println("4 - Remover produto");
                System.out.println("5 - Encerrar");

                System.out.print("Escolha: ");
                opcao = read.nextInt();
                read.nextLine();


                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = read.nextLine();

                        System.out.print("Preço: ");
                        double preco = read.nextDouble();

                        System.out.print("Quantidade: ");
                        int quantidade = read.nextInt();
                        read.nextLine();

                        System.out.print("Categoria: ");
                        String categoria = read.nextLine();

                        Produto produto = new Produto(nome, preco, quantidade, categoria);
                        service.cadastrar(produto);
                        break;

                    case 2:
                        service.listar();
                        break;

                    case 3:
                        System.out.print("Nome do produto: ");
                        String busca = read.nextLine();
                        service.buscar(busca);
                        break;

                    case 4:
                        System.out.print("Nome do produto para remover: ");
                        String remover = read.nextLine();
                        service.remover(remover);
                        break;

                    case 5:
                        System.out.println("Sistema encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } catch (ValorInvalidoException e) {
                System.out.println(e.getMessage());
            } catch (ProdutoNaoEncontradoException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida.");
                read.nextLine();
            }
        }
    }
}
