import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Brasileira", "Jessica Felix", null);
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", false);
        livro.validarDisponibilidade();
        Usuario usuario = new Usuario("Lucas Rafael", null, 25, null);
        Date dataAtual = new Date();
        Emprestimo emprestimo = new Emprestimo(dataAtual, dataAtual, livro, usuario);
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
        System.out.println("Genero: " + emprestimo.getLivro().getGenero());
        System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
        System.out.println();
        System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
