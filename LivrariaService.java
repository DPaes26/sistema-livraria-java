import java.util.ArrayList;
import java.util.List;

public class LivrariaService {
    private List<Livro> catalogo = new ArrayList<>(); // "Essa lista só aceita objetos do tipo Livro"
    private int proximoId = 1;

    public void cadastrarLivro(String titulo, String autor) {
        Livro novoLivro = new Livro(proximoId++, titulo, autor);
        catalogo.add(novoLivro); // Coloca o livro fabricado dentro da lista de livros.
        System.out.println("✅ Livro cadastrado com sucesso! ID: " + novoLivro.getId());
    }

    public void listarTodos() {
        if (catalogo.isEmpty()) {
            System.out.println("⚠️ Nenhum livro cadastrado no catálogo.");
            return;
        }

        System.out.println("\n--- CATÁLOGO DE LIVROS ---");
        for (Livro livro : catalogo) {
            System.out.println(livro);
        }
    }

    public Livro buscarPorId(int id) {
        for (Livro livro : catalogo) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public void emprestarLivro(int id) {
        Livro livro = buscarPorId(id); // varre o catálogo e guarda o livro na variável livro
        if (livro == null) {
            System.out.println("❌ Livro não encontrado.");
            return;
        }

        if (livro.emprestar()) {
            System.out.println("✅ Livro '" + livro.getTitulo() + "emprestado com sucesso!");
        } else {
            System.out.println("⚠️ O livro '" + livro.getTitulo() + "' já está emprestado.");
        }
    }

    public void devolverLivro(int id) {
        Livro livro = buscarPorId(id);

        if (livro == null) {
            System.out.println("❌ Livro não encontrado.");
            return;
        }

        if (livro.isDisponivel()) {
            System.out.println("⚠️ O livro '" + livro.getTitulo() + "já está disponível na prateleira.");
        } else {
            livro.devolver();
            System.out.println("Livro " + livro.getTitulo() + "devolvido com sucesso");
        }
    }
}
