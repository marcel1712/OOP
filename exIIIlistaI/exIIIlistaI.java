class Celular{
    public String marca;
    public String modelo;
    Processador processador;
    Tela tela;
    Som som;
    SistemaComunicacao sistemaComunicacao;

    Celular(String marca, String modelo, Processador processador, Tela tela, Som som, SistemaComunicacao sistemaComunicacao){
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.tela = tela;
        this.som = som;
        this.sistemaComunicacao = sistemaComunicacao;
    }

    
}

class Processador{
    public String modelo;
    float frequencia;
    int nucleos;
    Processador(String modelo, float frequencia, int nucleos){

    }
}

class Tela{
    float tamanho;
    public String resolucao;
    public String tecnologia;
}

class Som{
    boolean alto_falante_stereo;
    float potencia;
    boolean suporte_dolby;
}

class SistemaComunicacao{
    boolean wifi;
    public String bluetooth;
    public String rede_movel;
}

