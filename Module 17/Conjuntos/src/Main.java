package Conjuntos.src;
//Conjuntos

//Imports necessários
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Os conjuntos são implementados com a interface Set, e uma das
 * classes que implementam esta interface é a HashSet
 * 
 * A maioria das coleções possuem os mesmos métodos já conhecidos
 * e utilizados com as listas, mas o comportamento desses objetos
 * é um pouco diferente.
 * 
 * A performance também é melhor em conjuntos do que em listas.
 * 
 * Características dos conjuntos:
 *  - Não aceitam valores repetidos;
 *  - A ordem de inserção não é respeitada (Realiza uma semi-ordenação);
 *  - Não aceita ordenação
 *  - Não possui índice
 */
public class Main {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();
        Scanner teclado = new Scanner(System.in);
        boolean res;

        //Adicionando 5 nomes
        for(int i = 0; i < 5; i++) {
            System.out.println("Informe o " + (i + 1) + "/5 nome: ");
            String nome = teclado.nextLine();
            res = nomes.add(nome);
            
            if(!res) {//Prevenção para não repetir nomes
                i--;
                System.out.println("O nome não pode ser repetido. ");
            }
        }

        //Imprimindo o tamanho do conjunto
        System.out.println("No conjunto nomes temos " + nomes.size() + " elementos");

        //Imprimindo nomes
        for(String nome : nomes) {
            System.out.println(nome);
        }
        teclado.close();

    }
}
