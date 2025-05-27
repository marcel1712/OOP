import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {

        try {
            int contagem = 0;
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;

            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
                contagem += 1;
            }

            reader.close();
            System.out.println(contagem);            
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }


    }
}
