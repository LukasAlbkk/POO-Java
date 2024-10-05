import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando o autor
        Autor autor = new Autor("Brasileira", "Jessica Felix", null);

        // Criando o livro
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", false);

        // Validar disponibilidade do livro
        livro.validarDisponibilidade();

        // Criando o usuário
        Usuario usuario = new Usuario("Lucas Rafael", null, 25, null);

        // Criando um empréstimo com datas de retirada e devolução
        Date dataAtual = new Date();
        Emprestimo emprestimo = new Emprestimo(dataAtual, dataAtual, livro, usuario);

        // Exibindo as informações do empréstimo
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
