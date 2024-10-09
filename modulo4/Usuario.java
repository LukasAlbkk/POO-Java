public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] historicoEmprestimos;
    
    public Usuario(String nome, Livro[] livros, int idade, Emprestimo[] historicoEmprestimos){
        super(nome, livros);
        this.idade = idade;
        this.historicoEmprestimos = historicoEmprestimos;
    }
    public int getIdade(){return idade;}
    public Emprestimo[] getHistoricoEmprestimos(){return historicoEmprestimos;}
}
