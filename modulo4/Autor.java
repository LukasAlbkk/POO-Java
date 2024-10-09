public class Autor extends Pessoa{
    private String nacionalidade;
    private boolean usuario;

    public Autor (String nacionalidade, String nome , Livro[] livros, boolean ehUsuario){
        super (nome, livros);
        this.nacionalidade = nacionalidade;
        this.usuario = ehUsuario;
    }

    public String getNacionalidade(){return nacionalidade;}
    public void getEhUsuario(){
        if(usuario == true){System.out.println("É um autor que tambem é usuario");}
        else{System.out.println("É um autor tradicional");}
    }
}
