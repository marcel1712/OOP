import java.until.ArrayList;

class ListaLimitada<T>{
    private ArrayList<T> elementos = new ArrayList<>();
    private size = 5;
    public void adicionar(T objeto){
        if(size > 0) elementos.add(objeto); size --;
        else System.out.println("Lista cheia") return;
    }

    public void listar(){
        for(T elem : elementos){
            System.out.println(elem);
        }
    }
}