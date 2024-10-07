import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class EmprestimoTest {

    @Test
    public void testGetDataRetirada() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro[] livros = new Livro[] {}; 
        Autor autor = new Autor("Inglês", "Alan Turing", livros);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);
        Usuario usuario = new Usuario("Lucas", new Livro[]{}, 21, new Emprestimo[]{});
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }

    @Test
    public void testGetDataDevolucao() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro[] livros = new Livro[] {};  
        Autor autor = new Autor("Inglês", "Alan Turing", livros);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", new Livro[]{}, 21, new Emprestimo[]{});
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }

    @Test
    public void testGetLivro() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro[] livros = new Livro[] {}; 
        Autor autor = new Autor("Inglês", "Alan Turing", livros);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", new Livro[]{}, 21, new Emprestimo[]{});
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertEquals(livro, emprestimo.getLivro());
    }

    @Test
    public void testGetUsuario() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro[] livros = new Livro[] {}; 
        Autor autor = new Autor("Inglês", "Alan Turing", livros);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", new Livro[]{}, 21, new Emprestimo[]{});
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertEquals(usuario, emprestimo.getUsuario());
    }
}
