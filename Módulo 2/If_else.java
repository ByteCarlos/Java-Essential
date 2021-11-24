//If, else, if else
public class If_else {

    public static void main(String[] args){
        //Declarando e inicializando a variável
        int numero = 10;

        /*
        se(numero > 5) entao{
            escreva("Sim, o número" + numero + "é maior que 5");
        }senão se(numero == 5){
            escreva("Não, o número " + numero + " é igual a 5");
        }senão{
            escreva("Não, o número " + numero + " não é maior que 5");
        }
        */
        
        if(numero > 5){
            System.out.println("Sim, o número " + numero + " é maior que 5");
        }else if(numero == 5){
            System.out.println("Não, o número " + numero + " é igual a 5");
        }else{
            System.out.println("Não, o número " + numero + " não é maior que 5");
        }
    }
}