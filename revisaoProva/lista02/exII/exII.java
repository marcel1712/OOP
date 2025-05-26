// Classe base abstrata
abstract class Driver {
    protected boolean ligado;
    protected String status;

    public Driver() {
        this.ligado = false;
        this.status = "Desligado";
    }

    public void ligarDispositivo() {
        if (!ligado) {
            ligado = true;
            status = "Ligado";
            System.out.println("Dispositivo ligado.");
        } else {
            ligado = false;
            status = "Desligado";
            System.out.println("Dispositivo desligado.");
        }
    }

    public String verificaStatus() {
        return "Status: " + status + " | Ligado: " + ligado;
    }

    public void executaTeste() {
        System.out.println("Executando teste no dispositivo...");
        status = "Testado";
    }
}

// Dispositivo de Rede
class DispositivoRede extends Driver {
    public void enviaPacoteDeDados(String pacote) {
        if (ligado) {
            System.out.println("Enviando pacote: " + pacote);
            status = "Dados enviados";
        } else {
            System.out.println("Rede desligada.");
        }
    }
}

// Dispositivo de Impressão
class DispositivoImpressao extends Driver {
    public void imprimePaginas(int paginas) {
        if (ligado) {
            System.out.println("Imprimindo " + paginas + " página(s).");
            status = "Impressão realizada";
        } else {
            System.out.println("Impressora desligada.");
        }
    }
}

// Dispositivo de Vídeo
class DispositivoVideo extends Driver {
    private int brilho;

    public void alteraBrilhoDeExibicao(int brilho) {
        if (ligado) {
            this.brilho = brilho;
            System.out.println("Brilho ajustado para: " + brilho);
            status = "Brilho alterado";
        } else {
            System.out.println("Monitor desligado.");
        }
    }
}

// Classe principal que agrupa os drivers
class SistemaOperacional {
    private DispositivoRede rede;
    private DispositivoImpressao impressora;
    private DispositivoVideo video;

    public SistemaOperacional() {
        this.rede = new DispositivoRede();
        this.impressora = new DispositivoImpressao();
        this.video = new DispositivoVideo();
    }

    public void iniciarSistema() {
        System.out.println("Iniciando o sistema operacional...\n");

        rede.ligarDispositivo();
        impressora.ligarDispositivo();
        video.ligarDispositivo();

        rede.enviaPacoteDeDados("Dados iniciais");
        impressora.imprimePaginas(2);
        video.alteraBrilhoDeExibicao(80);

        System.out.println("\nSTATUS DOS DISPOSITIVOS:");
        System.out.println(rede.verificaStatus());
        System.out.println(impressora.verificaStatus());
        System.out.println(video.verificaStatus());
    }
}

// Execução
class Main {
    public static void main(String[] args) {
        SistemaOperacional so = new SistemaOperacional();
        so.iniciarSistema();
    }
}
