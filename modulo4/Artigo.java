

public class Artigo {
    private String genero;
    private Autor autor;
    private String titulo;
    private boolean estaPublicado;

    public Artigo(String titulo, Autor autor, String genero, boolean estaPublicado){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.estaPublicado = estaPublicado;
    }

    public String getGenero(){return genero;}
    public String getTitulo(){return titulo;}
    public boolean getDisponibilidade(){return estaPublicado;}
    public Autor getAutor(){return autor;}
}
