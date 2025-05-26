//interface eh um molde para outras classes de forma que nao pode alterar o metodos existentes

public interface Ligavel{
    void ligar();
}

public class Computador implements Ligavel{
    public void ligar(){
        System.out.println("Computador ligado");
    }
}

public class Televisao implements Ligavel{
    public void ligar(){
        System.out.println("Teve ligada")
    }
}

public class Main {
    public static void main(String[] args) {
        Ligavel[] dispositivos = { new Computador(), new Televisao() };
        
        for (Ligavel d : dispositivos) {
            d.ligar();
        }
    }
}