package Pilha.src;

import java.util.Stack;

//Pilhas - Implementação do Java
public class Programa2 {
    public static void main(String[] args) {
        Stack<String> nomes = new Stack<String>();

        System.out.println(nomes);
        nomes.push("Angelina"); //insere
        nomes.push("Felicity");
        System.out.println(nomes);

        String ret = nomes.peek(); //retorna o elemento do topo
        System.out.println(ret);

        nomes.pop(); //remove
        System.out.println(nomes); 
    }
}
