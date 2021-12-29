package Listas_ligadas.src;

//import Armazenamento_sequencial.src.*;
//Lista Ligada / LinkedList IMPLEMENTAÇÃO MANUAL
/**
 * Em um vetor, os elementos estão um do lado do outro, enquanto em uma lista
 * ligada, eles estão em lugares diferentes, porém um aponta para o outro
 * indicando o próximo elemento.
 * 
 * [0][3][1][2][5][4][null]
 */
public class Programa1 {
    public static void main(String[] args) {
       ListaLigada lista = new ListaLigada();

       System.out.println(lista);

       lista.adiciona("Angelina");
       System.out.println(lista);

       lista.adiciona("Maria");
       System.out.println(lista);

       lista.adicionaNoComeco("Felicity");
       System.out.println(lista);

       lista.adiciona(1, "Joao");
       System.out.println(lista);

       lista.removeDoComeco();
       System.out.println(lista);

       Object ret = lista.pega(1);
       System.out.println(ret);
    }
}
