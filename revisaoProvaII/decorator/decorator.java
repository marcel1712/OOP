interface FuncaoMatematica {
    double calcular(double x);
}

class FuncaoLinear implements FuncaoMatematica {
    private double a;
    private double b;

    public FuncaoLinear(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcular(double x) {
        return a * x + b;
    }
}

class ModuloDecorator implements FuncaoMatematica {
    private FuncaoMatematica funcao;

    public ModuloDecorator(FuncaoMatematica funcao) { // ✔️ Construtor correto
        this.funcao = funcao;
    }

    @Override
    public double calcular(double x) {
        return Math.abs(funcao.calcular(x));
    }
}

class QuadradoDecorator implements FuncaoMatematica {
    private FuncaoMatematica funcao;

    public QuadradoDecorator(FuncaoMatematica funcao) { // ✔️ Construtor correto
        this.funcao = funcao;
    }

    @Override
    public double calcular(double x) {
        double resultado = funcao.calcular(x);
        return resultado * resultado;
    }
}

public class Main {
    public static void main(String[] args) {
        FuncaoMatematica f = new FuncaoLinear(2, -5); // f(x) = 2x -5

        System.out.println("Função linear pura:");
        System.out.println(f.calcular(3)); // 2*3 -5 = 1

        // Decorando com módulo
        FuncaoMatematica fModulo = new ModuloDecorator(f);
        System.out.println("\nFunção com módulo:");
        System.out.println(fModulo.calcular(3)); // |1| = 1

        // Decorando com quadrado
        FuncaoMatematica fQuadrado = new QuadradoDecorator(f);
        System.out.println("\nFunção com quadrado:");
        System.out.println(fQuadrado.calcular(3)); // 1^2 = 1

        // Decorando com módulo e quadrado EMPILHADOS
        FuncaoMatematica fEmpilhada = new QuadradoDecorator(new ModuloDecorator(f));
        System.out.println("\nFunção com módulo + quadrado:");
        System.out.println(fEmpilhada.calcular(3)); // ((|1|)^2) = 1
    }
}
