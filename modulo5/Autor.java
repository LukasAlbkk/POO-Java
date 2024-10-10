

public class Autor implements PublicavelInterface {
    private String nome;
    private EstrategiaPublicacao estrategiaPublicacao;

    public Autor(String nome) {
        this.nome = nome;
    }

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    @Override
    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}
