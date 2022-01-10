package Try_Catch.src;
//Tratando exceções com try/catch

/*
 - Utilizamos o try para tentar realizar algo, geralmente realizar aquilo que
 pode acarretar em um problema.

 - Utilizamos o catch para capturar o erro e com isso oferecer ao usuário do sistema
 uma mensagem adequada sem que o sistema quebre.
*/

//Finally
/*
 - Faz parte do conjunto do Try/Catch
 - Após realizar ou não a captura do erro o finally executa algo "finalizando" o bloco de código
*/
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número para divisão: ");
        int num1 = teclado.nextInt();

        System.out.println("Informe o segundo número para divisão: ");
        int num2 = teclado.nextInt();
        try {
            System.out.println("A divisão de " + num1 + " por " + num2 + " é " + num1 / num2);
        }catch(ArithmeticException e) {
            System.out.println("Não é possível dividir " + num1 + " por " + num2);
        }finally{
            System.out.println("Faça isso também...");
        }

        teclado.close();
    }
}