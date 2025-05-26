import java.util.ArrayList;
import java.util.List;

abstract class Documento{
    private String titulo;
    private String autor;
    private double tamanho;

    public Documento(String titulo, String autor, double tamanho){
        this.titulo = titulo;
        this.autor = autor;
        this.tamanho = tamanho;
    }

    public String getTitulo() { return this.titulo; }
    public String getAutor() { return this.autor; }
    public double getTamanho() { return this.tamanho; }

    public void abrir(){
        System.out.println("Abrindo documento: " + this.titulo + " Autor: " + this.autor + " tamanho arquivo: " + this.tamanho + "KB");
    }

    public abstract void formatar();
}

class Texto extends Documento{
    private int numeroDePalavras;

    public Texto(String titulo, String autor, double tamanho, int numeroDePalavras){
        super(titulo, autor, tamanho);
        this.numeroDePalavras = numeroDePalavras;

    }

    @Override
    public void abrir(){
        super.abrir();
        System.out.println("Numero de palavras: " + this.numeroDePalavras);
    }

    public int getNumPalavras(){ return this.numeroDePalavras;}

    @Override
    public void formatar() {
        System.out.println("Formatando texto: aplicando fonte, margens e espaçamento.");
    }
}

class Planilha extends Documento{
    private int quantidadeDeCedulas;

    public Planilha(String titulo, String autor, double tamanho, int quantidadeDeCedulas){
        super(titulo, autor, tamanho);
        this.quantidadeDeCedulas = quantidadeDeCedulas;
    }

    public int getQuantidadeDeCedulas(){ return this.quantidadeDeCedulas;}

    @Override
    public void abrir(){
        super.abrir();
        System.out.println("Quantidade de cedulas: " + this.quantidadeDeCedulas);
    }

    @Override
    public void formatar() {
        System.out.println("Formatando planilha: aplicando fórmulas, bordas e estilos de célula.");
    }
}

class Apresentacao extends Documento{
    private int numeroDeSlides;

    public Apresentacao(String titulo, String autor, double tamanho, int numeroDeSlides){
        super(titulo, autor, tamanho);
        this.numeroDeSlides = numeroDeSlides;
    }

    public int getNumeroDeSlides(){ return this.numeroDeSlides;}

    @Override
    public void abrir(){
        super.abrir();
        System.out.println("Numero de slides: " + this.numeroDeSlides);
    }

    @Override
    public void formatar() {
        System.out.println("Formatando apresentação: aplicando temas, transições e layout de slides.");
    }
    
}           

class Main {

    public static void main(String[] args) {


        List<Documento> biblioteca = new ArrayList<>();

        biblioteca.add(new Texto("Relatório Anual", "Carlos Silva", 250, 1500));
        biblioteca.add(new Planilha("Finanças", "Maria Souza", 120, 500));
        biblioteca.add(new Apresentacao("Pitch Vendas", "João Pereira", 340, 15));

        for (Documento doc : biblioteca) {
            doc.abrir();
            doc.formatar();
            System.out.println(doc);
            System.out.println("----");
        }
    }
}
