class Item{
    public String nome;
    double precoUnitario;
    int quantidade;
    
    Item(String Nome, int Quantidade, double PrecoUnitario){
        nome = Nome;
        quantidade = Quantidade;
        precoUnitario = PrecoUnitario;
    }

    public void ImprimirItem(){
        System.out.println(nome + " " + quantidade + " " + precoUnitario);
    }
}

class Pedido{

        Item[] itens = new Item[15];
        int quantidadeItens = 0;

    public void AdicionarItem(Item item){
        if(quantidadeItens < itens.length){
            itens[quantidadeItens] = item;
            quantidadeItens ++;
        }else{
            System.out.println("Não é possível adicionar mais itens ao pedido.");
        }
    }

    public void calcularTotal(){
        double total = 0;
        for(int i = 0; i < quantidadeItens;i++){
            total += itens[i].quantidade * itens[i].precoUnitario;
        }
        System.out.println(total);
    }

    public void exibirPedido(){
        for (int i = 0; i < quantidadeItens;i++){
            System.out.println(itens[i].nome + " " + itens[i].precoUnitario + " " + itens[i].quantidade);
        }
    }

}

class Main{
    public static void main(String[] args){
        Item item1 = new Item("Shampoo", 1, 15);
        Item item2 = new Item("Sabao", 2, 60);
        item1.ImprimirItem();
        Pedido pedido1 = new Pedido();
        pedido1.AdicionarItem(item1);
        pedido1.AdicionarItem(item2);
        pedido1.calcularTotal();
        pedido1.exibirPedido();
    }
}