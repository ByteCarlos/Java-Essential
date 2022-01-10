package Listas_duplamente_ligadas.src;
//Listas duplamente ligadas
public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adiciona("Angelina");
        System.out.println(lista);
        lista.adiciona("Maria");
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

        System.out.println(lista.contem("Angelina"));
    }
}
