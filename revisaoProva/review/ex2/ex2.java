
abstract class Forma{
    //classe abstrata deve ser declarada e nao implemetnado
    public abstract double calcularArea();
}

class triangulo extends Forma{
    protected double base;
    protected double altura;

    triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        System.out.println((this.base * this.altura)/2);
        return ((this.base * this.altura)/2);
    }
}

class Circulo extends Forma{
    protected double raio;

    Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        System.out.println(3.14*(Math.pow(this.raio, 2)));
        return (Math.pow(this.raio, 2));
    }
}

class Main {
    public static void main(String[] args) {
        triangulo triangulo1 = new triangulo(4, 10);
        triangulo1.calcularArea();

        Circulo circulo1 = new Circulo(5);
        circulo1.calcularArea();
    }
}