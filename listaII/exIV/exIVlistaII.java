class OperacaoMat {

    float operandoI;
    float operandoII;
    int dia;
    int mes;
    int ano;
    Usuario usuario;

    public OperacaoMat(float operandoI, float operandoII, int dia, int mes, int ano, Usuario usuario) {
        this.operandoI = operandoI;
        this.operandoII = operandoII;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.usuario = usuario;
    }

    public void realizarCalculo(int tipoOperacao) {

        System.out.println("Usuário: " + this.usuario.nome);
        System.out.println("Data: " + this.dia + "/" + this.mes + "/" + this.ano);

        float resultado = 0;
        String tipo = "";

        switch (tipoOperacao) {
            case 1:
                resultado = this.operandoI + this.operandoII;
                tipo = "Soma";
                break;
            case 2:
                resultado = this.operandoI - this.operandoII;
                tipo = "Subtração";
                break;
            case 3:
                resultado = this.operandoI * this.operandoII;
                tipo = "Multiplicação";
                break;
            case 4:
                resultado = this.operandoI / this.operandoII;
                tipo = "Divisão";
                break;
            case 5:
                resultado = this.operandoI % this.operandoII;
                tipo = "Resto (mod)";
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Operação: " + tipo);
        System.out.println("Resultado: " + resultado);
        System.out.println("=====================================");
    }
}

class Usuario {
    String nome;
    String cpf;
    int idade;

    Usuario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
}

class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Marcel", "12345678900", 19);

        OperacaoMat operacaoMat1 = new OperacaoMat(10, 10, 17, 12, 2025, usuario1);

        operacaoMat1.realizarCalculo(1); // Soma
        operacaoMat1.realizarCalculo(2); // Subtração
        operacaoMat1.realizarCalculo(3); // Multiplicação
        operacaoMat1.realizarCalculo(4); // Divisão
        operacaoMat1.realizarCalculo(5); // Mod
    }
}
