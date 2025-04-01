class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        // comportamento geral, todas as classes possuem
        saldo += valor;
    }
}

class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldo, double limiteChequeEspecial) {
        super(titular, saldo); //Sem o super(...), o compilador tenta chamar o construtor padrão da
        //  superclasse (sem parâmetros). Se ele não existir, dá erro.
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void usarChequeEspecial() {
        // comportamento específico
        System.out.println("Usando cheque especial até R$" + limiteChequeEspecial);
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void renderJuros() {
        // comportamento específico
        saldo += saldo * taxaJuros / 100;
        System.out.println("Rendendo juros: novo saldo = R$" + saldo);
    }
}

class Aplicacao extends ContaBancaria {
    private int prazoResgate;

    public Aplicacao(String titular, double saldo, int prazoResgate) {
        super(titular, saldo);


        this.prazoResgate = prazoResgate;
    }

    public void verificarPrazo() {
        // comportamento específico
        System.out.println("Resgate disponível em " + prazoResgate + " meses.");
    }
}

class Banco {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("João", 5000, 1000);
        ContaPoupanca c2 = new ContaPoupanca("Maria", 3000, 2);
        Aplicacao c3 = new Aplicacao("Carlos", 10000, 12);

        //verificando subclasses
        System.out.println(c1 instanceof ContaBancaria); // true
        System.out.println(c2 instanceof ContaBancaria); // true
        System.out.println(c3 instanceof ContaCorrente); // false

        System.out.println(c1.getClass()); // class ContaCorrente
        System.out.println(c2.getClass()); // class ContaPoupanca
        System.out.println(c3.getClass()); // class Aplicacao

        System.out.println(c1.getClass().getSuperclass() == superClasse); // true
        System.out.println(c2.getClass().getSuperclass() == superClasse); // true
        System.out.println(c3.getClass().getSuperclass() == superClasse); // true

        c1.depositar(500);
        c1.usarChequeEspecial();

        c2.depositar(1000);
        c2.renderJuros();

        c3.depositar(500);
        c3.verificarPrazo();
    }
}
