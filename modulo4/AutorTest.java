import static org.junit.Assert.*;
import org.junit.Test;

public class AutorTest {

    @Test
    public void testAutorTradicional() {
        Livro[] livros = new Livro[] {};
        Autor autor = new Autor("Brasileiro", "Machado de Assis", livros, false);
        assertEquals("Brasileiro", autor.getNacionalidade());
        assertEquals("Machado de Assis", autor.getNome());
        assertFalse(autor.isUsuario());
    }

    @Test
    public void testAutorUsuario() {
        Livro[] livros = new Livro[] {};
        Autor autor = new Autor("Brasileira", "Machado de Assis", livros, true);
        assertEquals("Brasileira", autor.getNacionalidade());
        assertEquals("Machado de Assis", autor.getNome());
        assertTrue(autor.isUsuario()); 
    }
}

