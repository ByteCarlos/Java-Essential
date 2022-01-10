package Default_methods.src;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
//forEach
public class Programa3 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Consumer<String> consumidor = new imprimeNaLinha();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("Outlast 2");

        palavras.forEach(consumidor); //For each -> para cada
    }
}
