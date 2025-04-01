class Pessoa{
    private String name;

    public Pessoa(String name){
        this.name = name;
    }

    public void dirigir(Carro carro){
        System.out.println(this.name + " está dirigindo um " + carro.getModelo());
    }
}

class Carro{
    private String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }
}

class main{
    public static void main(String args[]){
        Pessoa pessoa = new Pessoa("Carlos");
        Carro carro = new Carro("Honda Civic");
        pessoa.dirigir(carro); // Simples associação: apenas interação momentânea
    }
}