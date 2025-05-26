import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"));
            String linha;

            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }

    }
}
