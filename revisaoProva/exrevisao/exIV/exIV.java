class NumeroComplexo {
    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }

    public NumeroComplexo adicionar(NumeroComplexo outro) {
        return new NumeroComplexo(this.real + outro.real, this.imaginario + outro.imaginario);
    }

    public NumeroComplexo multiplicar(NumeroComplexo outro) {
        double realPart = this.real * outro.real - this.imaginario * outro.imaginario;
        double imagPart = this.real * outro.imaginario + this.imaginario * outro.real;
        return new NumeroComplexo(realPart, imagPart);
    }

    @Override
    public String toString() {
        if (imaginario >= 0)
            return real + " + " + imaginario + "i";
        else
            return real + " - " + (-imaginario) + "i";
    }
}

interface OperacaoComplexa {
    NumeroComplexo executar(NumeroComplexo a, NumeroComplexo b);
}

class SomaComplexa implements OperacaoComplexa {
    @Override
    public NumeroComplexo executar(NumeroComplexo a, NumeroComplexo b) {
        return a.adicionar(b);
    }
}

class MultiplicacaoComplexa implements OperacaoComplexa {
    @Override
    public NumeroComplexo executar(NumeroComplexo a, NumeroComplexo b) {
        return a.multiplicar(b);
    }
}

class CalculadoraComplexa {
    private OperacaoComplexa operacao;

    public void setOperacao(OperacaoComplexa operacao) {
        this.operacao = operacao;
    }

    public NumeroComplexo calcular(NumeroComplexo a, NumeroComplexo b) {
        return operacao.executar(a, b);
    }
}

class Main {
    public static void main(String[] args) {
        NumeroComplexo c1 = new NumeroComplexo(3, 4);
        NumeroComplexo c2 = new NumeroComplexo(1, -2);

        System.out.println("c1: " + c1);
        System.out.println("Módulo c1: " + c1.modulo());

        System.out.println("c2: " + c2);
        System.out.println("Módulo c2: " + c2.modulo());

        CalculadoraComplexa calculadora = new CalculadoraComplexa();

        calculadora.setOperacao(new SomaComplexa());
        NumeroComplexo resultadoSoma = calculadora.calcular(c1, c2);
        System.out.println("Soma: " + resultadoSoma);

        calculadora.setOperacao(new MultiplicacaoComplexa());
        NumeroComplexo resultadoMultiplicacao = calculadora.calcular(c1, c2);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
    }
}
