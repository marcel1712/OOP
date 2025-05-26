
class Produto {
    private int id;
    private String nome;
    private int quantidade;

    public Produto(int id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Quantidade: " + quantidade;
    }
}


class Estoque {
    private Produto[] produtos;
    private int contador;

    public Estoque(int capacidade) {
        this.produtos = new Produto[capacidade];
        this.contador = 0;
    }

    public void adicionarProduto(Produto produto) {
        if (contador < produtos.length) {
            produtos[contador] = produto;
            contador++;
        } else {
            System.out.println("Estoque cheio! Não é possível adicionar mais produtos.");
        }
    }

    public void removerProdutoPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (produtos[i].getId() == id) {
                // Move os elementos para trás
                for (int j = i; j < contador - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }
                produtos[contador - 1] = null;
                contador--;
                System.out.println("Produto com ID " + id + " removido.");
                return;
            }
        }
        System.out.println("Produto com ID " + id + " não encontrado.");
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (int i = 0; i < contador; i++) {
            if (produtos[i].getNome().equals(nome)) {
                System.out.println("Produto encontrado: " + produtos[i]);
                return produtos[i];
            }
        }
        System.out.println("Produto com nome \"" + nome + "\" não encontrado.");
        return null;
    }

    @Override
    public String toString() {
        String lista = "Produtos no estoque:\n";
        for (int i = 0; i < contador; i++) {
            lista += produtos[i].toString() + "\n";
        }
        return lista;
    }
}


class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque(5); // capacidade de 5 produtos

        Produto p1 = new Produto(1, "Notebook", 10);
        Produto p2 = new Produto(2, "Mouse", 30);
        Produto p3 = new Produto(3, "Teclado", 20);

        // Adicionando produtos
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);

        // Buscando produto por nome
        estoque.buscarProdutoPorNome("Mouse");

        // Removendo produto por ID
        estoque.removerProdutoPorId(2);

        // Exibindo o estoque atualizado
        System.out.println(estoque.toString());
    }
}
