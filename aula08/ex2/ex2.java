import java.util.ArrayList; // import the ArrayList class

class ListaLimitada<T>{
    private ArrayList<T> elementos = new ArrayList<>();
    private int size = 5;
    
    public void adicionar(T objeto){
        if(size > 0){
            elementos.add(objeto); 
            size --;
        }else{
            System.out.println("Lista cheia");
            return;
        } 
    }

    public void listar(){
        for(T elem : elementos){
            System.out.println(elem);
        }
    }
}

class Main{
    static public void main(String[] args){
        ListaLimitada<Integer> ListaNum = new ListaLimitada<>();

        ListaNum.adicionar(17);
        ListaNum.adicionar(12);
        ListaNum.adicionar(2005);

        ListaNum.listar();
    }
}