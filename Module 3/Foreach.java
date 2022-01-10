//Foreach // Para cada
public class Foreach {
    
    public static void main(String[] args) {
        String nome = "Geek University";

        //Para cada um dos caracteres da string, imprima o caractere
        for (char letra : nome.toCharArray()) {
            System.out.println(letra);
            //System.out.print(letra); para printar um na frente do outro
        }
    }
}
