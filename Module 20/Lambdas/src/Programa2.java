package Lambdas.src;
//Lambdas

import java.util.ArrayList;
import java.util.List;

public class Programa2 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");  
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("Outlast 2");                              
                                   
        //Forma                                                                                  
        // palavras.sort((s1, s2) -> {                                                                                                                                          
        //     if(s1.length() < s2.length()) {
        //         return -1;
        //     }
        //     if(s1.length() > s2.length()) {
        //         return 1;
        //     }
        //     return 0;
        // });

        //Forma 2
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.forEach(s -> System.out.println(s));
    }
}
