
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LivrariaService servico = new LivrariaService();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== SISTEMA DE LIVRARIA ===");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Listar todos os livros");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); //// Limpa o buffer do teclado após ler número

            switch (opcao) {
                case 1:
                    System.out.println("Titulo do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Autor do livro: ");
                    String autor = scanner.nextLine();
                    servico.cadastrarLivro(titulo, autor);
                    break;

                case 2:
                    servico.listarTodos();
                    break;

                case 3:
                    System.out.println("Digite o ID do livro para empréstimo: ");
                    int idEmprestimo = scanner.nextInt();
                    servico.emprestarLivro(idEmprestimo);
                    break;

                case 4:
                    System.out.println("Digite o ID do livro para devolução: ");
                    int idDevolucao = scanner.nextInt();
                    servico.devolverLivro(idDevolucao);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

}
