import java.util.ArrayList;

class Termo {
    int expoente;
    double coeficiente;

    public Termo(int expoente, double coeficiente) {
        this.expoente = expoente;
        this.coeficiente = coeficiente;
    }
}

class Polinomio {
    private int grau;
    private ArrayList<Termo> termos;

    public Polinomio(int grau) {
        this.grau = grau;
        this.termos = new ArrayList<>();
    }

    public void Add(int expoente, double coeficiente) {
        if (expoente > this.grau) {
            System.out.println("Erro: expoente maior que o grau máximo do polinômio.");
            return;
        }

        for (Termo termo : termos) {
            if (termo.expoente == expoente) {
                termo.coeficiente += coeficiente;
                return;
            }
        }

        termos.add(new Termo(expoente, coeficiente));
    }

    public void Mostrar() {
        if (termos.isEmpty()) {
            System.out.println("0");
            return;
        }

        termos.sort((a, b) -> b.expoente - a.expoente);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < termos.size(); i++) {
            Termo t = termos.get(i);
            if (t.coeficiente == 0) continue;

            if (i > 0 && t.coeficiente > 0) sb.append(" + ");
            else if (t.coeficiente < 0) sb.append(" - ");

            double coef = Math.abs(t.coeficiente);
            if (t.expoente == 0) sb.append(coef);
            else if (t.expoente == 1) sb.append(coef + "x");
            else sb.append(coef + "x^" + t.expoente);
        }

        System.out.println(sb.toString());
    }

    public double Calcular(double x) {
        double resultado = 0;
        for (Termo termo : termos) {
            resultado += termo.coeficiente * Math.pow(x, termo.expoente);
        }

        return resultado;
    }
}

class Main {
    public static void main(String[] args) {
        Polinomio p = new Polinomio(5);

        p.Add(2, 3);     // 3x²
        p.Add(0, 4);     // + 4
        p.Add(2, -1);    // 3x² - 1x² = 2x²
        p.Add(5, 1);     // + x⁵

        p.Mostrar(); // Esperado: 1x^5 + 2x^2 + 4

        double resultado = p.Calcular(2); // x = 2
        System.out.println("P(2) = " + resultado); // Deve mostrar o valor calculado
    }
}
