//Tipos de dados alfanuméricos
//caracteres e strings
public class alfaNumericos {
    public static void main(String[] args) {
        //Tipos primitivos
        char letra1 = 'a';
        char letra2 = 97; //97 em decimal == 'a'
        //char letra3 = "b"; //Errado 
        //string nome = "adads"; Não existe o tipo primitivo string em Java

        System.out.println("Letra2 " + letra2);

        letra2 = (char) (letra2 + 1); //cast

        System.out.println("Letra1 " + letra1);
        System.out.println("Letra2 " + letra2);

        //Tipos não primitivos
        Character letra3 = 'A';
        String nome = "Geek University";

        System.out.println("Letra3 " + letra3);
        System.out.println("Nome " + nome);

        System.out.println("char/Character " + Character.SIZE + " bits");
        //System.out.println("String " + String.SIZE + " bits"); Não existe SIZE de string
        //gambiarra para saber o espaço que a string ocupa
        //lembre que string é um array de caracteres
        System.out.println("String " + (Character.SIZE * nome.length()) + " bits"); 
    }
}
