package Leitura_Escrita_Arq.src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Lendo arquivos
public class Lendo {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(new FileInputStream("Modulo 16 - entrada.txt"));
            
            //Lendo linha a linha, enquanto tiver próxima linha
            while(ler.hasNextLine()) {
                String linha = ler.nextLine();
                System.out.println(linha);
            }

            ler.close();

        }catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
        
    }
}
