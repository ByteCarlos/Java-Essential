package Mapas.src;
import java.util.Collection;
//Mapas/Map
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Os mapas são representados em Java pela interface Map
 * e mapeia seus elementos utilizando o conceito de chave/valor
 * 
 * Mapas são conhecidos como se fossem/representassem 3 coleções
 *  - Coleção de chaves;
 *  - Coleção de valores;
 *  - Coleção de associações;
 */

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<Integer, String>();

        pessoas.put(21, "Felicity Jones");
        pessoas.put(34, "Maria Antonieta");
        pessoas.put(41, "Angelina Jolie");

        //Coleção de chaves
        System.out.println("Chaves: " + pessoas.keySet());

        //Coleção de valores
        System.out.println("Valores: " + pessoas.values());

        //Coleção de associações
        System.out.println("Associação: " + pessoas.entrySet());

        //Forma 1
        //forEach -> Disponibilizado a partir do Java 8
        pessoas.keySet().forEach(idade -> { //Keyset -> devolve as chaves
            System.out.println(pessoas.get(idade));//Imprimindo as chaves
        });

        //Forma 2
        //Iterar na coleção de chaves
        Set<Integer> chaves = pessoas.keySet();
        for(Integer idade : chaves) {
            System.out.println(idade);
        }

        //Forma 1
        //Iterar na coleção de valores
        Collection<String> valores = pessoas.values();
        for(String nome : valores) {
            System.out.println(nome);
        }

        //Forma 2
        pessoas.values().forEach(nome -> {
            System.out.println(nome);
        });

        //Forma 1
        //Iterar a coleção de associações
        Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
        for(Entry<Integer, String> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

        //Forma 2
        pessoas.entrySet().forEach(associacao -> {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        });


    }
}
