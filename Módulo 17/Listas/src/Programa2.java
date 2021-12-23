package Listas.src;

import java.util.ArrayList;
import java.util.Collections;

//Listas
public class Programa2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(42);
        numeros.add(24);
        numeros.add(12);
        numeros.add(2);
        numeros.add(91);

        //Para ordenar a lista
        Collections.sort(numeros);

        for(int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
}
