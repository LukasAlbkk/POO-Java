import org.junit.Test;
import static org.junit.Assert.*;

public class AutorTest {

    @Test
    public void testPublicacaoLivro() {
        Autor autor = new Autor("Lucas");
        EstrategiaPublicacaoLivro estrategiaLivro = new EstrategiaPublicacaoLivro();
        autor.setEstrategiaPublicacao(estrategiaLivro);
        assertNotNull(autor);
        assertEquals("Publicando Livro", getOutput(autor)); 
    }

    @Test
    public void testPublicacaoArtigo() {
        Autor autor = new Autor("Maria");
        EstrategiaPublicacaoArtigo estrategiaArtigo = new EstrategiaPublicacaoArtigo();
        autor.setEstrategiaPublicacao(estrategiaArtigo);
        assertNotNull(autor);
        assertEquals("Publicando Artigo", getOutput(autor));
    }

    @Test
    public void testPublicacaoSemEstrategia() {
        Autor autor = new Autor("Pedro");
        assertNotNull(autor);
        assertEquals("Nenhuma estratégia de publicação definida.", getOutput(autor));
    }

    //pegar a saida do terminal
    private String getOutput(Autor autor) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        autor.publicar();
        return outContent.toString().trim(); 
    }
}
