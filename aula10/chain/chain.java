class SolicitacaoCompra{
    private double valor;
    private String descricao;

    public  SolicitacaoCompra(double valor, String descricao){
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor(){
        return valor;
    }

    public String getDescricao(){
        return descricao;
    }
}

abstract class Aprovador{
    protected Aprovador proximo;

    public void setProximo(Aprovador proximo){
        this.proximo = proximo;
    }

    public abstract void aprovar(SolicitacaoCompra s);
}

class Supervisor extends Aprovador{
    @Override
    public void aprovar(SolicitacaoCompra s){
        if(s.getValor() <= 1000){
            System.out.println("Supervisor aprovou a compra de " + s.getDescricao());
        }else if(proximo != null){
            proximo.aprovar(s);
        }
    }
}

class Gerente extends Aprovador{
    @Override
    public void aprovar(SolicitacaoCompra s){
        if(s.getValor() <= 10000){
            System.out.println("Gerente aprovou a compra de " + s.getDescricao());
        }else if(proximo != null){
            proximo.aprovar(s);
        }
    }
}

class Diretor extends Aprovador{
    @Override
    public void aprovar(SolicitacaoCompra s){
        System.out.println("Diretor aprovou a compra de " + s.getDescricao());
    }
}

class Main {
    public static void main(String[] args) {
        // Criando os aprovadores
        Aprovador supervisor = new Supervisor();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();

        // Montando a cadeia
        supervisor.setProximo(gerente);
        gerente.setProximo(diretor);

        // Criando solicitações
        SolicitacaoCompra compra1 = new SolicitacaoCompra(500, "Cadeira Gamer");
        SolicitacaoCompra compra2 = new SolicitacaoCompra(12000, "Servidor Novo");

        // Enviando para aprovação
        supervisor.aprovar(compra1);
        supervisor.aprovar(compra2);
    }
}
