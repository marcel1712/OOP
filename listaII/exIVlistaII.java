class OperacaoMat{
    
    float operandoI;
    float operandoII;
    int dia;
    int mes;
    int ano;

    public OperacaoMat(float operandoI, float operandoII, int dia, int mes, int ano){
        this.operandoI = operandoI;
        this.operandoII = operandoII;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void realizarCalulo(int tipoOperacao){
        if(tipoOperacao == 1){
            System.out.println("Resultado ",this.operandoI + this.operandoII);
            

        }
    }
}