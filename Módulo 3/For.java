import java.util.Scanner;

//Laço For
public class For {
    
    public static void main(String[] args) {
        int idade = 1;
        String nome;

        //Para receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);

        //variável de controle; condição de parada; forma de incremento
        //i++ -> i = i + 1
        for(int i = 0; i < 5; i++){
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
        }
        teclado.close();
    }
}
