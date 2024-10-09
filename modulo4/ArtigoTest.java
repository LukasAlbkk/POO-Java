import static org.junit.Assert.*;
import org.junit.Test;

public class ArtigoTest {

    @Test
    public void testArtigoPublicado() {
        Autor autor = new Autor("Brasileira", "Jessica Felix", null, false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.getDisponibilidade());
    }

    @Test
    public void testArtigoNaoPublicado() {
        Autor autor = new Autor("Brasileira", "Machado de Assis", null, true);
        Artigo artigo = new Artigo("Artigo2", autor, "literatura", false);
        assertEquals("Artigo2", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("literatura", artigo.getGenero());
        assertFalse(artigo.getDisponibilidade()); 
    }
}
