class CBanc{
    int num;
    double saldo;
    CBanc(int num, double saldo){
        this.num = num;
        this.saldo = saldo;
    }
    void printConta(){
        System.out.println("Conta " + num + " com saldo "+ saldo);
    }
}

class CCorrente extends CBanc{
    double credito;
    CCorrente(int num, double saldo, double credito){
        super(num, saldo);
        this.credito = credito;
    }
}

class CPoup extends CBanc{
    double rendimento;
    CPoup(int num, double saldo, double rendimento){
        super(num, saldo);
        this.rendimento = rendimento;
    }

    //sobreescrita do codigo mae para ser utilizada da forma que a classe filha precisa
    @Override //SOBREESCRITA
    void printConta(){
        System.out.println("Conta poupanca " + " com saldo " + saldo + " e rendimento " + rendimento);
    }
}
class CAp extends CBanc{
    double taxa;
    CAp(int num, double saldo, double taxa){
        super(num, saldo);
    }
    @Override
    void printConta() {
        // TODO Auto-generated method stub
        super.printConta();//reuso
        System.out.println("taxa de " + this.taxa);
    }
}

class Main{
    public static void main(String[] args){
        CBanc c = new CBanc(10,1000);
        c.printConta();

        CCorrente cc = new CCorrente(20,2000,20000);
        cc.printConta();

        CPoup cp = new CPoup(20, 2000, 0.05);
        cp.printConta();

        CAp ca = new CAp(40,4000,0.0025);
        ca.printConta();

        CBanc c1 = cc;
        CBanc c2 = cp;
        CBanc c3 = ca;

        CBanc[] contas = new CBanc[4];
        contas[0] = c;
        contas[1] = cc;
        contas[2] = cp;
        contas[3] = ca;

        for(int i = 0; i< contas.length; i++){
            contas[i].printConta(); //polimorfismo o codigo vai executar de formas diferente para cada Conta de acordo com o tipo dela;
        }
    }
}