package Strings.src;
//Trabalhando com Strings
/**
 * Em Java, Strings são imutáveis, ou seja, não mudam.
 */
public class Main {
    public static void main(String[] args) {
        String curso = "Programação em Java: Essencial";

        //Método que altera na String, se encontrar, a primeira palavra pela segunda
        curso.replace("Java", "Python"); //Na verdade isso não afeta a string :)
        //Lembre-se strings são imutáveis

        System.out.println(curso);

        //Eu teria que declarar uma nova string, veja:
        //String novaString = curso.replace("Java", "Python");
        //System.out.println(novaString);

        //Ou podemos redeclarar a variável curso, veja:
        curso = curso.replace("Java", "Python");

        System.out.println(curso);

        //Método que converte todos os caracteres maiúsculos para minúsculos
        curso = curso.toLowerCase();
        System.out.println(curso);

        //Método que converte todos os caracteres minúsculos para maiúsculos
        curso = curso.toUpperCase();
        System.out.println(curso);

        //Lembre-se: uma string é um array de caracteres
        //Sendo assim podemos imprimir um caractere nesse array, veja:
        System.out.println(curso.charAt(0));

        //Ou, imprimir todos os caracteres
        for(int i = 0; i < curso.length(); i++) {
            System.out.println(curso.charAt(i));
        }

        //Ao contrário
        for(int i = (curso.length()) - 1; i >= 0; i--) {
            System.out.println(curso.charAt(i));
        }
    }
}