abstract class ProcessadorNumero{
    protected ProcessadorNumero proximo;

    public void setProximo(ProcessadorNumero proximo){
        this.proximo = proximo;
    }

    public abstract void classificar(double numero);
}

class ProcessadorePar extends ProcessadorNumero{
    @Override
    public void classificar(double numero){
        if((numero % 2) == 0){
            System.out.println("EH par caraaalhooo");
        }
        if (proximo != null) {
            proximo.classificar(numero);
        }
    }
}
class ProcessadoreImpar extends ProcessadorNumero{
    @Override
    public void classificar(double numero){
        if((numero % 2) != 0){
            System.out.println("Eh impar porra");
        }
        if (proximo != null) {
            proximo.classificar(numero);
        }

    }
}
class ProcessadorDEEEEZ extends ProcessadorNumero{
    @Override
    public void classificar(double numero){
        if((numero % 10) == 0){
            System.out.println("OIA QUE O NUMERO DA PA DIVIDI POR DEIXXXXXX");
        }
        if (proximo != null) {
            proximo.classificar(numero);
        }
    }
}

class Main{
    public static void main(String[] args){
        ProcessadorNumero processadorParBoladoPraDedeu = new ProcessadorePar();
        ProcessadorNumero ProcessadorBrabisssimo = new ProcessadoreImpar();
        ProcessadorNumero ProcessadorGigatonico = new ProcessadorDEEEEZ();

        processadorParBoladoPraDedeu.setProximo(ProcessadorBrabisssimo);
        ProcessadorBrabisssimo.setProximo(ProcessadorGigatonico);

        processadorParBoladoPraDedeu.classificar(1000000000);
    }
}