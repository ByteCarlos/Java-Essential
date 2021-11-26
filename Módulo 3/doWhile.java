import java.util.Scanner;
/*
Receba dados do usuário enquanto a idade for maior que 0
*/

//do While
public class doWhile {
    public static void main(String[] args){

        int idade = 1;
        String nome;

        //Para receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);

        //Primeira executa o código, depois faz a checagem
        do{
            System.out.println("Informe seu nome: ");
            
            //para receber dados do tipo string
            nome = teclado.nextLine();

            System.out.println("Informe sua idade: ");

            //para receber dados do tipo inteiro
            //idade = teclado.nextInt(); //Bug

            //se depois de um inteiro for receber uma string sempre use
            //esse código abaixo para evitar bugs
            idade = Integer.parseInt(teclado.nextLine());

            if(idade > 0){
                System.out.println(nome + " tem " + idade + " anos");
            }
        }while(idade > 0);

        teclado.close();

    }
}
