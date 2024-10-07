import org.junit.Test;


import static org.junit.Assert.*;

public class AutorTest {

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Brasileira", "Jess", new Livro[]{});
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testGetNome() {
        Autor autor = new Autor("Brasileira", "Jess", new Livro[]{});
        assertEquals("Jess", autor.getNome());
    }
}
