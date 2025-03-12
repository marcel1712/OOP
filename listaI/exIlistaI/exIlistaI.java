class Produto{
    public String nome;
    double preco;
    int quantDisponivel;
    Produto(String Nome, double Preco, int QuantDisponivel){
        nome = Nome;
        preco = Preco;
        quantDisponivel = QuantDisponivel;
    }

    public void ImprimirQuant(){
        System.out.println(quantDisponivel);
    }

    public void ImprimirNome(){
        System.out.println(nome);
    }
    public void ImprimirPreco(){
        System.out.println(preco);
    }
    public void ImprimeProduto(){
        System.out.println(nome + " - " + quantDisponivel + " - " + preco); 
    }

    public void removerEstoque(int quantidade){
        quantDisponivel -= quantidade;
    }

    public void adicionarEstoque(int quantidade){
        quantDisponivel += quantidade;
    }
}

class Main{
    public  static void main(String[] args){
        Produto produto1 = new Produto("Shampoo", 15, 100);
        produto1.ImprimeProduto();
        produto1.removerEstoque(2);
        produto1.ImprimeProduto();
        produto1.adicionarEstoque(1);
        produto1.ImprimeProduto();
    }
}