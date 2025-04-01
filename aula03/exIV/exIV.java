class Aluno{
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}

class Universidade{
    private String nome;
    private Professor[] professores;
    private Departamento[] departamentos;
    private int contadorprfessores;
    private int quantDepartamentos;

    public Universidade(String nome, int capacidadeProf, int quantDepartamentos){
        this.nome = nome;
        this.departamentos = new Departamento[quantDepartamentos];
        this.professores = new Professor[capacidadeProf];

        this.quantDepartamentos = 0;
        this.contadorprfessores = 0;

    }

    public void adicionarProfessor(Professor professor){
        if(this.contadorprfessores < this.professores.length){
            this.professores[this.contadorprfessores++] = professor;
        }else{
            System.out.println("Nao eh possivel adicionar mais professores a " + nome);
        }
    }

    public void adicionarDepartamento(Departamento departamento){
        if(this.quantDepartamentos < this.departamentos.length){
            this.departamentos[this.quantDepartamentos++] = departamento;
        }else{
            System.out.println("Nao eh possivel adicionar mais departamentos");
        }
    }

    public void listarProfessores(){
        System.out.println("Professores da " + this.nome + ":");
        for(int i = 0; i < this.contadorprfessores; i++){
            System.out.println("- " + this.professores[i].getNome());
        }
    }

    public void listarDepartamentos(){
        System.out.println("Departamento da " + this.nome + ":");
        for(Departamento departamento : departamentos){
            if(departamento != null){
                System.out.println("- " + departamento.getNome());
            }
        }
    } 
}

class Professor{
    private String nome;

    public Professor(String nome){
        this.nome = nome;
    }

    public void ministrarD(Aluno aluno){
        System.out.println("Professor " + this.nome + " esta ensinando o aluno " + aluno.getNome());
    }

    public String getNome(){
        return this.nome;
    }
}

class Departamento{
    private String nome;

    public Departamento (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

}

class Main {
    public static void main(String[] args) {
        // Criando alunos
        Aluno aluno1 = new Aluno("Mariana");
        Aluno aluno2 = new Aluno("Lucas");

        // Criando professores
        Professor prof1 = new Professor("Dr. João");
        Professor prof2 = new Professor("Dra. Ana");

        // Criando departamentos
        Departamento dep1 = new Departamento("Computação");
        Departamento dep2 = new Departamento("Matemática");

        // Criando universidade
        Universidade usp = new Universidade("USP", 5, 2);

        // Corrigindo erro na classe Universidade antes dos testes
        // Corrigir o nome do professor na adição
        usp.adicionarProfessor(prof1);
        usp.adicionarProfessor(prof2);

        // Acessando métodos de professores
        prof1.ministrarD(aluno1);
        prof2.ministrarD(aluno2);

        // Listando professores
        usp.listarProfessores();

        // Adicionando departamentos diretamente para teste (ajuste manual, pois não há método para isso ainda)
        // Então usaremos reflexão ou alteramos a classe — aqui vou mostrar como adicionar um setter direto para simplificar os testes.

        // Para facilitar o teste, você pode adicionar esse método na classe Universidade:
        /*
        public void adicionarDepartamento(Departamento departamento, int indice){
            if(indice >= 0 && indice < departamentos.length){
                departamentos[indice] = departamento;
            }
        }
        */

        // E aqui o uso dele:
        usp.adicionarDepartamento(dep1);
        usp.adicionarDepartamento(dep2);

        // Listando departamentos
        usp.listarDepartamentos();
    }
}
