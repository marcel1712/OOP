import java.util.ArrayList;

interface ObservadoPedido{
    public void atualizar(String status);
}

class Pedido{
    private String status;
    private ArrayList<ObservadoPedido> Observadores = new ArrayList<>();

    public void setStatus(String status){
        this.status = status;
        System.out.println("Pedido esta " + this.status);
        for(ObservadoPedido obs : Observadores){
            obs.atualizar(status);
        }
    }

    public String getStatus(){
        return this.status;
    }

    public void registrarObservador(ObservadoPedido obs){
        Observadores.add(obs);
    }
}

class Restaurante implements ObservadoPedido{
    @Override
    public void atualizar(String status){
        System.out.println("Cliente foi notificado: seu pedido está agora em " + status);
    }
}

class Entregador implements ObservadoPedido{
    @Override
    public void atualizar(String status){
        System.out.println("Entregador foi notificado: pedido está " + status);
    }
}

class Cliente implements ObservadoPedido{
    @Override
    public void atualizar(String status){
        System.out.println("Cliente foi notificado: seu pedido está agora em " + status);
    }
}

class Main{
    public static void main(String[] args){
        Pedido pedido = new Pedido();

        Cliente cliente = new Cliente();
        Restaurante restaurante = new Restaurante();
        Entregador entregador = new Entregador();

        pedido.registrarObservador(cliente);
        pedido.registrarObservador(restaurante);
        pedido.registrarObservador(entregador);

        pedido.setStatus("Preparando");
        pedido.setStatus("Saiu para entrega");
        pedido.setStatus("Entregue");
    }
}
