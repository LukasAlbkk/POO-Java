import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autorTradicional = new Autor("Brasileira", "Jessica Felix", null, false);
        Autor autorUsuario = new Autor("Brasileira", "Machado de Assis", null, true);
        Livro livro1 = new Livro("Java for Beginners", autorTradicional, "Tecnologia", false);
        Livro livro2 = new Livro("Crime e Castigo", autorUsuario, "Classicos", true );
        Artigo artigo = new Artigo("Entendendo Compiladores", autorTradicional, "tecnologia", true);
        livro1.validarDisponibilidade();
        autorTradicional.getEhUsuario();
        Usuario usuario = new Usuario("Lucas Albuquerque", null, 22, null);
        Date dataAtual = new Date();
        Emprestimo emprestimo = new Emprestimo(dataAtual, dataAtual, livro1, usuario);
        Emprestimo emprestimo2 = new Emprestimo(dataAtual, dataAtual, livro2, usuario);
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
        System.out.println("Genero: " + emprestimo.getLivro().getGenero());
        System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
        System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
        System.out.println();
        livro2.validarDisponibilidade();
        autorUsuario.getEhUsuario();
        System.out.println("Livro: " + emprestimo2.getLivro().getTitulo());
        System.out.println("Autor: " + emprestimo2.getLivro().getAutor().getNome());
        System.out.println("Genero: " + emprestimo2.getLivro().getGenero());
        System.out.println("Usuario: " + emprestimo2.getUsuario().getNome());
        System.out.println("Idade: " + emprestimo2.getUsuario().getIdade());
        System.out.println("Data de Retirada: " + emprestimo2.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo2.getDataDevolucao());
        System.out.println();
        System.out.println("Artigo: " + artigo.getTitulo() + 
                   ", Autor: " + artigo.getAutor().getNome() + 
                   ", Gênero: " + artigo.getGenero() + 
                   ", Disponível: " + artigo.getDisponibilidade());
    }
}
