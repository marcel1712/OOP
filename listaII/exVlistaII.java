class Superpoder {
    String nome;
    int dano; // Dano causado pelo golpe

    Superpoder(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public int getDano() {
        return this.dano;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Personagem {
    String nome;
    String nomeVidaReal;
    Superpoder[] poderes;
    double vida;

    Personagem(String nome, String nomeVidaReal, Superpoder[] poderes) {
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
        this.poderes = poderes;
        this.vida = 100; // vida inicial
    }

    public void status() {
        System.out.println("==== STATUS DE " + nome + " ====");
        System.out.println("Vida: " + vida);
        System.out.println("Poderes:");
        for (Superpoder poder : poderes) {
            System.out.println("- " + poder.nome + " (Dano: " + poder.dano + ")");
        }
        System.out.println("==============================");
    }

    public void atacar(Personagem inimigo, String nomeDoGolpe) {
        Superpoder golpeEscolhido = null;

        // Procurando o golpe
        for (Superpoder poder : poderes) {
            if (poder.nome.equalsIgnoreCase(nomeDoGolpe)) {
                golpeEscolhido = poder;
                break;
            }
        }

        if (golpeEscolhido == null) {
            System.out.println(this.nome + " tentou usar " + nomeDoGolpe + ", mas não conhece esse golpe!");
            return;
        }

        // Causando dano
        double dano = golpeEscolhido.dano;
        inimigo.vida -= dano;

        System.out.println(this.nome + " atacou " + inimigo.nome + " com " + golpeEscolhido.nome + " causando " + dano + " de dano!");

        if (inimigo.vida <= 0) {
            inimigo.vida = 0;
            System.out.println(inimigo.nome + " foi derrotado! 🏆");
        } else {
            System.out.println("Agora " + inimigo.nome + " tem " + inimigo.vida + " de vida restante.");
        }
    }
}

class Vilao {
    Personagem vilao;
    int anosPrisao;

    Vilao(Personagem vilao, int anosPrisao) {
        this.vilao = vilao;
        this.anosPrisao = anosPrisao;
    }

    public void statusVilao() {
        System.out.println("=== VILÃO ===");
        System.out.println("Nome: " + vilao.nome);
        System.out.println("Anos de Prisão: " + anosPrisao);
        vilao.status();
    }
}

class Main {
    public static void main(String[] args) {
        // Criando Superpoderes
        Superpoder fogo = new Superpoder("Lançar Fogo", 30);
        Superpoder superForca = new Superpoder("Super Soco", 25);
        Superpoder velocidade = new Superpoder("Ataque Supersônico", 20);
        Superpoder regeneracao = new Superpoder("Golpe de Cristal", 35);
        
        // Vilões - poderes
        Superpoder tentaculo = new Superpoder("Tentáculos Esmagadores", 28);
        Superpoder laserVilgax = new Superpoder("Rajada de Laser", 33);
        Superpoder invisibilidade = new Superpoder("Ataque Fantasma", 25);
        Superpoder possessao = new Superpoder("Possessão Sombria", 30);

        // Criando Heróis
        Personagem chama = new Personagem(
                "Chama",
                "Ben Tennyson",
                new Superpoder[]{fogo, superForca}
        );

        Personagem xlr8 = new Personagem(
                "XLR8",
                "Ben Tennyson",
                new Superpoder[]{velocidade}
        );

        Personagem diamante = new Personagem(
                "Diamante",
                "Ben Tennyson",
                new Superpoder[]{regeneracao, superForca}
        );

        // Criando Vilões
        Personagem vilgaxPersonagem = new Personagem(
                "Vilgax",
                "Vilgax Supremo",
                new Superpoder[]{tentaculo, laserVilgax}
        );

        Personagem fantasmaticoPersonagem = new Personagem(
                "Fantasmático",
                "Zs'Skayr",
                new Superpoder[]{invisibilidade, possessao}
        );

        Vilao vilgax = new Vilao(vilgaxPersonagem, 1000);
        Vilao fantasmatico = new Vilao(fantasmaticoPersonagem, 500);

        // Mostrar status inicial
        chama.status();
        diamante.status();
        vilgax.statusVilao();
        fantasmatico.statusVilao();

        System.out.println("\n===== BATALHA HEROIS VS VILÕES =====\n");

        // Exemplo de combate
        chama.atacar(vilgaxPersonagem, "Lançar Fogo");
        vilgaxPersonagem.atacar(chama, "Tentáculos Esmagadores");

        diamante.atacar(fantasmaticoPersonagem, "Golpe de Cristal");
        fantasmaticoPersonagem.atacar(diamante, "Possessão Sombria");

        // Mais ataques pra ver o vilão caindo
        chama.atacar(vilgaxPersonagem, "Super Soco");
        chama.atacar(vilgaxPersonagem, "Super Soco"); // Chama vai finalizar aqui

        // Mostrar status final
        System.out.println("\n===== STATUS FINAL =====");
        chama.status();
        diamante.status();
        vilgax.statusVilao();
        fantasmatico.statusVilao();
    }
}
