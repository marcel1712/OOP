class Pessoa{
    private String nome;
    private Carro carro;

    public Pessoa(String nome, Carro carro){
        this.nome = nome;
        this.carro = carro;
    }

    public void dirigir(Carro carro){
        System.out.println(this.nome + " está dirigindo um " + carro.getModelo());
    }

    public void mostrarCarro(){
        if(this.carro != null){
            System.out.println(nome + " está dirigindo um " + this.carro.getModelo());
        }else{
            System.out.println(nome + " nao possui um carro.");
        }
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
        Carro carro = new Carro("Toyota Corolla");
        Pessoa pessoa = new Pessoa("Alice", carro); // O Carro é passado como parâmetro
        pessoa.mostrarCarro(); // Agregação: Pessoa tem um Carro
    }
}