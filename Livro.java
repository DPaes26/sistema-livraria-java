
public class Livro {
    // atributos que o livro terá
    private int id;
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Eu sou o método de nascimento (construtor) deste objeto
    // (int id, String titulo, String autor) - Lista de exigência para criar um
    // Livro
    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public boolean emprestar() {
        if (this.disponivel) { // Este livro está disponível na prateleira?
            this.disponivel = false;
            return true; // "Sucesso! Pode entregar o livro".
        }
        return false; // "Falha! O livro já não está disponível".
    }

    public void devolver() {
        this.disponivel = true; // Volta o status do livro para disponível na estante.
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

}
