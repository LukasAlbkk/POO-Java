
public class Main {
    public static void main(String[] args) {
        Autor autorTradicional = new Autor("João da Silva");
        autorTradicional.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        System.out.println("Publicação pelo Autor Tradicional:");
        autorTradicional.publicar();

        //artigo
        autorTradicional.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        System.out.println("Alterando para publicação de artigo:");
        autorTradicional.publicar(); 
    }
}
