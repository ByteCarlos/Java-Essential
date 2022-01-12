package Lambdas.src;
//Lambdas

/**
 * Expressões lambdas são funções anônimas.
 */

import Classes_anonimas.src.ComparadorPorTamanho;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa1 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();


        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("Outlast 2");

        palavras.sort(comparador);

        //Expressão Lambda - forma 1
        // palavras.forEach((String s) -> {
        //     System.out.println(s);
        // });
        
        //Expressão Lambda - forma 2
        palavras.forEach(s -> System.out.println(s));
    }
}
