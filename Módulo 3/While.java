import java.util.Scanner;
/*
Receba dados do usuário enquanto a idade for maior que 0
*/

//While
public class While {
    public static void main(String[] args){

        int idade = 1;
        String nome;

        //Para receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);

        while(idade > 0){
            System.out.println("Informe seu nome: ");
            
            //para receber dados do tipo string
            nome = teclado.nextLine();

            System.out.println("Informe sua idade: ");

            //para receber dados do tipo inteiro
            //idade = teclado.nextInt(); //Bug

            //se depois de um inteiro for receber uma string sempre use
            //esse código abaixo para evitar bugs
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos");
        }

        teclado.close();

    }
}
