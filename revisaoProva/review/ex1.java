class Animal {
    protected String nome;
    protected String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void fazerSom() {
        System.out.println(nome + " fazendo som genérico.");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome, "Canis lupus familiaris");
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Au Au!");
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome, "Felis catus");
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Miau miau!");
    }
}

class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Mimi");

        Animal[] animais = {cachorro, gato};

        for (Animal a : animais) {
            a.fazerSom();
        }
    }
}
