class Pessoa{
    private String Nome;
    private int Idade;
    private String Profissao;

    public Pessoa(String Nome, int Idade, String Profissao){
        this.Nome  = Nome;
        this.Idade = Idade;
        this.Profissao = Profissao;
    }

    public String getNome(){
        return this.Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public int getIdade(){
        return this.Idade;
    }

    public void setIdade(int Idade){
        this.Idade = Idade;
    }

    public void setProfissao(String Profissao){
        this.Profissao = Profissao;
    }

    public String getProfissao(){
        return this.Profissao;
    }

    public void FazerAniversario(){
        this.Idade ++;
        System.out.println(this.nome + " fez aniversario e agora esta com " + this.Idade);
    }

    public void MudarDeTrabalho(String novaProfissao){
        System.out.println(this.nome + " deixou de ser " + this.Profissao + " para ser " + novaProfissao);
        this.Profissao = novaProfissao;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marcel", 19, "Estudante");
        Pessoa p2 = new Pessoa("Cybele", 22, "Designer");

        // Apresentando os dados
        System.out.println(p1.getNome() + " - " + p1.getIdade() + " anos - " + p1.getProfissao());
        System.out.println(p2.getNome() + " - " + p2.getIdade() + " anos - " + p2.getProfissao());

        // Testando métodos
        p1.fazerAniversario();
        p2.mudarDeTrabalho("Desenvolvedora");

        // Verificando mudanças
        System.out.println(p1.getNome() + " agora tem " + p1.getIdade() + " anos.");
        System.out.println(p2.getNome() + " agora é " + p2.getProfissao() + ".");
    }
}
