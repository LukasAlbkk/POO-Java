
public class Autor extends Pessoa{
    private String nacionalidade;

    public Autor (String nacionalidade, String nome , Livro[] livros){
        super (nome, livros);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade(){return nacionalidade;}
}
