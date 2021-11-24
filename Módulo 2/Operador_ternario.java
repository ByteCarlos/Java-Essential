//Operador ternário

//Se você precisar criar a função main() programa java
//digite main e no teclado pressione CTRL + barra de espaço
//aperte ENTER para criar automático
public class Operador_ternario {
    
    public static void main(String[] args) {
        int valor = 3, numero;

        /*
        if(valor > 0){
            numero = valor;
        }else{
            numero = 7;
        }
        */

        //faz a mesma condição do if else acima
        //Operador ternário
        numero = (valor > 0) ? valor : 7;
 
        System.out.println(numero);
    }
}