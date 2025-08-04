import java.util.ArrayList;

class Par<K,V>{
    private K chave;
    private V valor;

    public K getChave(){
        return this.chave;
    }

    public V getValor(){
        return this.valor;
    }

    public Par(K chave, V valor){
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "(" + chave + ", " + valor + ")";
    }

}

class Main{
    public static void main(String[] args){
        Par<String, Integer> dupla1 = new Par<>("Marcel", 19);
        System.out.println(dupla1.getChave());
        System.out.println(dupla1.getValor());
        System.out.println(dupla1);
    }
}