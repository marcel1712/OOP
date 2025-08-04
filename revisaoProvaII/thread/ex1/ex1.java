class Relogio implements Runnable {
    private String nome;

    public Relogio(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        int contador = 0;
        while (contador < 5) {
            contador++;
            System.out.println(nome + ": " + contador + " segundo(s)");
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                System.out.println(nome + " foi interrompido.");
            }
        }
    }
}


class Main {
    public static void main(String[] args) {
        Relogio r1 = new Relogio("Relogio A");
        Relogio r2 = new Relogio("Relogio B");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main foi interrompido.");
        }

        System.out.println("Os dois relógios terminaram.");
    }
}
