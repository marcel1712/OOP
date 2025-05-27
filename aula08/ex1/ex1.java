class Caixa<T>{
    T objeto;
    public void guardar(T objeto){
        this.objeto = objeto;
    }

    public T pegar(){
        return objeto;
    }
}
class Main{
    public static void main(String[] args){
        Caixa<String> caixaDeStrin = new Caixa<>();
        caixaDeStrin.guardar("Lena");
        System.out.println(caixaDeStrin.pegar());

        Caixa<Integer> caixaDeInt = new Caixa<>();
        caixaDeInt.guardar(16);
        System.out.println(caixaDeInt.pegar());
    }
}