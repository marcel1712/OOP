class Celular {
    public String marca;
    public String modelo;
    public Processador processador;
    public Tela tela;
    public Som som;
    public SistemaComunicacao sistemaComunicacao;

    public Celular(String marca, String modelo, Processador processador, Tela tela, Som som, SistemaComunicacao sistemaComunicacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.tela = tela;
        this.som = som;
        this.sistemaComunicacao = sistemaComunicacao;
    }

    // Método para exibir todas as informações do celular
    public void exibirInformacoes() {
        System.out.println("\n=== Detalhes do Celular ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);

        processador.exibirInformacoes();
        tela.exibirInformacoes();
        som.exibirInformacoes();
        sistemaComunicacao.exibirInformacoes();
    }
}

class Processador {
    public String modelo;
    public float frequencia;
    public int nucleos;

    public Processador(String modelo, float frequencia, int nucleos) {
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.nucleos = nucleos;
    }

    public void exibirInformacoes() {
        System.out.println("\n=== Processador ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Frequência: " + frequencia + " GHz");
        System.out.println("Núcleos: " + nucleos);
    }
}

class Tela {
    public float tamanho;
    public String resolucao;
    public String tecnologia;

    public Tela(float tamanho, String resolucao, String tecnologia) {
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.tecnologia = tecnologia;
    }

    public void exibirInformacoes() {
        System.out.println("\n=== Tela ===");
        System.out.println("Tamanho: " + tamanho + " polegadas");
        System.out.println("Resolução: " + resolucao);
        System.out.println("Tecnologia: " + tecnologia);
    }
}

class Som {
    public boolean altoFalanteStereo;
    public float potencia;
    public boolean suporteDolby;

    public Som(boolean altoFalanteStereo, float potencia, boolean suporteDolby) {
        this.altoFalanteStereo = altoFalanteStereo;
        this.potencia = potencia;
        this.suporteDolby = suporteDolby;
    }

    public void exibirInformacoes() {
        System.out.println("\n=== Som ===");
        System.out.println("Alto-falante estéreo: " + (altoFalanteStereo ? "Sim" : "Não"));
        System.out.println("Potência: " + potencia + "W");
        System.out.println("Suporte Dolby: " + (suporteDolby ? "Sim" : "Não"));
    }
}

class SistemaComunicacao {
    public boolean wifi;
    public String bluetooth;
    public String redeMovel;

    public SistemaComunicacao(boolean wifi, String bluetooth, String redeMovel) {
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.redeMovel = redeMovel;
    }

    public void exibirInformacoes() {
        System.out.println("\n=== Sistema de Comunicação ===");
        System.out.println("Wi-Fi: " + (wifi ? "Sim" : "Não"));
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Rede móvel: " + redeMovel);
    }
}

// Classe para testar
 class TesteCelular {
    public static void main(String[] args) {
        // Criando os componentes do celular
        Processador processador = new Processador("Snapdragon 888", 2.84f, 8);
        Tela tela = new Tela(6.5f, "1080x2400", "AMOLED");
        Som som = new Som(true, 5.0f, true);
        SistemaComunicacao sistemaComunicacao = new SistemaComunicacao(true, "Bluetooth 5.2", "5G");

        // Criando o celular com os componentes
        Celular celular = new Celular("Samsung", "Galaxy S21", processador, tela, som, sistemaComunicacao);

        // Exibindo todas as informações do celular
        celular.exibirInformacoes();
    }
}
