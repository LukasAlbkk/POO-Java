import static org.junit.Assert.*;
import org.junit.Test;

public class UsuarioTest {

    @Test
    public void testGetNome() {
        Livro[] livros = new Livro[] {};  
        Emprestimo[] historico = new Emprestimo[] {};  
        Usuario usuario = new Usuario("Lucas", livros, 21, historico);  
        assertEquals("Lucas", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        Livro[] livros = new Livro[] {};  
        Emprestimo[] historico = new Emprestimo[] {}; 
        Usuario usuario = new Usuario("Lucas", livros, 21, historico);
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testGetHistoricoEmprestimos() {
        Livro[] livros = new Livro[] {};  
        Emprestimo[] historico = new Emprestimo[] {}; 
        Usuario usuario = new Usuario("Lucas", livros, 21, historico);
        assertArrayEquals(historico, usuario.getHistoricoEmprestimos());
    }
}
