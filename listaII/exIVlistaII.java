class OperacaoMat{
    
    float operandoI;
    float operandoII;
    int dia;
    int mes;
    int ano;
    Usuario usuario;

    public OperacaoMat(float operandoI, float operandoII, int dia, int mes, int ano, Usuario usuario){
        this.operandoI = operandoI;
        this.operandoII = operandoII;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.usuario = usuario;
    }

    public void realizarCalulo(int tipoOperacao){

        System.out.println("Usuario " + this.usuario.nome + " " + this.dia + "/" + this.mes + "/" + this.ano);

        if(tipoOperacao == 1){
            System.out.println("Resultado " + (this.operandoI + this.operandoII));
        }else if(tipoOperacao == 2){
            System.out.println("Resultado " + (this.operandoI - this.operandoII));
        }else if(tipoOperacao == 3){
            System.out.println("Resultado " + (this.operandoI * this.operandoII));
        }else if(tipoOperacao == 4){
            System.out.println("Resultado " + (this.operandoI / this.operandoII));
        }else if(tipoOperacao == 5){
            System.out.println("Resultado " + (Math.pow(this.operandoI, this.operandoII)));
        }
    }
}

class Usuario{
    static String nome;
    int cpf;
    int idade;

    Usuario(String nome, int cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
}

class Main{
    public static void main(String[] args){
        Usuario usuario1 = new Usuario("Marcel", 22, 19);
        OperacaoMat OperacaoMat1 = new OperacaoMat(10,10,17,12,2025,usuario1);
        OperacaoMat1.realizarCalulo(1);
        OperacaoMat1.realizarCalulo(2);
        OperacaoMat1.realizarCalulo(3);
        OperacaoMat1.realizarCalulo(4);
        OperacaoMat1.realizarCalulo(5);
    }
}