import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Coloque o nome do arquivo que voce quer copiar: ");
        String nomeArquivo = myObj.nextLine();

        System.out.println("Coloque o nome do arquivo copia: ");
        String nomeNovoArquivo = myObj.nextLine();           


        try{

            FileInputStream in = new FileInputStream(nomeArquivo);
            FileOutputStream out = new FileOutputStream(nomeNovoArquivo);

            byte[] buffer = new byte[1024];
            int bytesLidos;

            while((bytesLidos = in.read(buffer)) != -1){
                out.write(buffer, 0, bytesLidos);
            }

            in.close();
            out.close();
            System.out.println("Arquivo copiado com sucesso");
        
        } catch(IOException e){
            System.out.println("Erro ao copiar o arquivo");
            e.printStackTrace();
        }
    }
}