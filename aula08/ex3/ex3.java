import java.util.ArrayList;

class Fila<T>{
    private int size = 0;
    private ArrayList<T> itens = new ArrayList<>();

    public void enfileirar(T item){ //adicionar()
        itens.add(item);
        size ++;
    }

    public void listar(){
        for(T item : itens){
            System.out.println(item);
        }
    }

    public T desenfileirar(){ //remove()
        size --;
        T res = itens.get(0);
        itens.remove(0);
        return res;
    }
}

class Main{
    public static void main(String[] args){
        Fila<String> filaGenerica = new Fila<>();

        filaGenerica.enfileirar("Marcel");
        filaGenerica.enfileirar("Nao sei muito oq pensar, mas eu realmente queria algo a mais");
        filaGenerica.enfileirar("Eu sei q estou brizando, eu mereco mais que o minimo");
        filaGenerica.enfileirar("E dps de tantas vozes, receber 20% disso ja me deixa completamente bobo");
        System.out.println("Aqui estao tudo: ");
        filaGenerica.listar();

        System.out.println("Aqui tem q retornar Marcel:");
        System.out.println(filaGenerica.desenfileirar());

        System.out.println("Aqui tem q retornar Nao sei..");
        System.out.println(filaGenerica.desenfileirar());

        System.out.println("Retorna oq sobrou:");
        filaGenerica.listar();

    }
}