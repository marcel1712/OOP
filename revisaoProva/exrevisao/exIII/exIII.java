import java.util.List;
import java.util.ArrayList;

interface MetodoPagamento {
    void realizarPagamento(double valor);
    double getTaxaPagamento();
}

class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private double limiteDisponivel;
    private double ultimaTaxa;

    public CartaoCredito(String numeroCartao, double limiteDisponivel) {
        this.numeroCartao = numeroCartao;
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public void realizarPagamento(double valor) {
        if (valor <= limiteDisponivel) {
            limiteDisponivel -= valor;
            ultimaTaxa = valor * 0.03; // 3% de taxa
            System.out.println("Pagamento com Cartão de Crédito realizado: R$ " + valor);
        } else {
            System.out.println("Limite insuficiente no cartão.");
            ultimaTaxa = 0;
        }
    }

    @Override
    public double getTaxaPagamento() {
        return ultimaTaxa;
    }
}

class Pix implements MetodoPagamento {
    private String chavePix;
    private double ultimaTaxa;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento(double valor) {
        ultimaTaxa = valor * 0.01; // 1% de taxa
        System.out.println("Pagamento via Pix realizado: R$ " + valor);
    }

    @Override
    public double getTaxaPagamento() {
        return ultimaTaxa;
    }
}

class BoletoBancario implements MetodoPagamento {
    private String codigoBarras;
    private String dataVencimento;
    private double ultimaTaxa;

    public BoletoBancario(String codigoBarras, String dataVencimento) {
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void realizarPagamento(double valor) {
        ultimaTaxa = valor * 0.05; // 5% de taxa
        System.out.println("Pagamento por Boleto Bancário realizado: R$ " + valor);
    }

    @Override
    public double getTaxaPagamento() {
        return ultimaTaxa;
    }
}

class Main {
    public static void main(String[] args) {
        List<MetodoPagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new CartaoCredito("1234-5678-9876-5432", 1000));
        pagamentos.add(new Pix("usuario@pix.com"));
        pagamentos.add(new BoletoBancario("23793", "2025-04-10"));

        double valorCompra = 300;
        double totalTaxas = 0;

        for (MetodoPagamento metodo : pagamentos) {
            metodo.realizarPagamento(valorCompra);
            totalTaxas += metodo.getTaxaPagamento();
        }

        System.out.printf("Custo total com taxas: R$ %.2f%n", totalTaxas);
    }
}

