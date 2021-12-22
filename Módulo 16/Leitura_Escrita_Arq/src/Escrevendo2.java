package Leitura_Escrita_Arq.src;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

//Escrita em arquivos 2

/**
 * Desta forma o arquivo não é excluído, mas sim novos textos são adicionados, diferente do Escrevendo.java
 */
public class Escrevendo2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            PrintStream escrever = new PrintStream(new FileOutputStream("Modulo 16 - saida.txt", true));
            //O PrintStream lança uma exceção do tipo FileNotFoundException por isso o try/catch

            for(int i = 0; i < 5; i++) { //Para escrever 5 mensagens
                System.out.println("Escreva algo: ");
                String msg = teclado.nextLine();
                escrever.println(msg);
            }
            escrever.close();

        }catch(FileNotFoundException e) {
            System.out.println("Não foi possível criar o arquivo");
        }

        teclado.close();
    }
}
