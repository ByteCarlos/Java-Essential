package Listas_ligadas.src;
//LinkedList do Java
import java.util.LinkedList;
import java.util.List;

public class Programa2 {
    
    public static void main(String[] args) {
        List<String> lista = new LinkedList<String>();

        System.out.println(lista.size());

        lista.add("Felicity");
        lista.add("Angelina");

        lista.add(0, "Maria");

        System.out.println(lista);
    }
}
