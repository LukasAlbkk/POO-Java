import static org.junit.Assert.*;
import org.junit.Test;

public class LivroTest {

    @Test
    public void testGetTitulo() {
        Livro[] livros = new Livro[] {}; 
        Autor autor = new Autor("Brasileira", "Jess", livros);  
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Java Basico", livro.getTitulo());
    }

    @Test
    public void testGetAutor() {
        Livro[] livros = new Livro[] {}; 
        Autor autor = new Autor("Brasileira", "Jess", livros);
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testGetGenero() {
        Livro[] livros = new Livro[] {};  
        Autor autor = new Autor("Brasileira", "Jess", livros);
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("tecnologia", livro.getGenero());
    }

    @Test
    public void testIsDisponivel() {
        Livro[] livros = new Livro[] {};  
        Autor autor = new Autor("Brasileira", "Jess", livros);
        Livro livro = new Livro("Java Avançado", autor, "tecnologia", false);
        assertFalse(livro.isDisponivel());
    }

    @Test
    public void testValidarDisponibilidade() {
        Livro[] livros = new Livro[] {};  
        Autor autor = new Autor("Brasileira", "Jess", livros);
        Livro livro = new Livro("Java Avançado", autor, "tecnologia", false);
        livro.validarDisponibilidade();
    }
}
