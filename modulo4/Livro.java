public class Livro {
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private String genero;

    public Livro(String titulo, Autor autor, String genero, boolean disponivel){
        this.titulo = titulo;
        this.autor =  autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public String getTitulo(){return titulo;}
    public Autor getAutor(){return autor;}
    public String getGenero() {return genero;}

    public boolean isDisponivel(){return disponivel;}

    public void validarDisponibilidade(){
        if (isDisponivel()) {
            System.out.println("O livro está disponível.");
        } else {
            System.out.println("O livro não está disponível.");
        }
    }
}
