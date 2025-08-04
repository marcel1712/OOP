import java.util.ArrayList;

interface ObservadorTempertura{
    void atualizar(double temperatura);
}

class SensorTemperatura{
    private ArrayList<ObservadorTempertura> observadores = new ArrayList<>();
    private double temperatura;

    public void registrarObservador(ObservadorTempertura obs){
        observadores.add(obs);
    }

    public void removerObservadores(ObservadorTempertura obs){
        observadores.remove(obs);
    }

    public void setTemperatura(double temp){
        System.out.println("\n Temperatura atualizada para: " + temp + " graus");
        this.temperatura = temp;
        notificacaoObservaores();
    }

    private void notificacaoObservaores(){
        for(ObservadorTempertura obs : observadores){
            obs.atualizar(temperatura);
        }
    }
}

class PainelPrincipal implements ObservadorTempertura{
    @Override
    public void atualizar(double temperatura){
        System.out.println("Painel: Temperatura atual = " + temperatura + " graus.");
    }
}

class AlarmeTemperatura implements ObservadorTempertura{
    @Override
    public void atualizar(double temperatura){
        if(temperatura > 40){
            System.out.println("ALARME!! TEMPERATURA PERIGOSA " + temperatura + "graus ");
        }else{
            System.out.println("Alarme temperatura dentro do normal");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Criando o sensor
        SensorTemperatura sensor = new SensorTemperatura();

        // Criando os observadores
        PainelPrincipal painel = new PainelPrincipal();
        AlarmeTemperatura alarme = new AlarmeTemperatura();

        // Registrando os observadores no sensor
        sensor.registrarObservador(painel);
        sensor.registrarObservador(alarme);

        // Alterando temperatura e notificando
        sensor.setTemperatura(30);
        sensor.setTemperatura(45);
    }
}
