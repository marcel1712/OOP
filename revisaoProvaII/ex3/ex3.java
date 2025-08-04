import java.util.ArrayList;

class Pilha<T>{
    private ArrayList<T> pilha = new ArrayList<>();
    private int size = 0;

    public boolean vazio(){
        if (size == 0) return true;
        else return false;
    }

    public void empilhar(T item){
        size ++;
        pilha.add(item);
    }

    public T desempilhar(){
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia");
            return null;
        }
        return pilha.remove(pilha.size() - 1);
    }

    public void listar(){
        for(T item : pilha){
            System.out.println(item);
        }
    }
}

class Main{
    static public void main(String[] args){
        Pilha<String> Pilha1 = new Pilha<>();
        Pilha1.empilhar("Marcel");
        Pilha1.empilhar("Pessoa especifica na qual faz ideia que estou pensando nela");
        Pilha1.empilhar("Pedrao");

        Pilha1.listar();

        System.out.println(Pilha1.desempilhar());
        System.out.println(Pilha1.desempilhar());

        Pilha1.listar();
    }
}