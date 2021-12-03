//Criando nossa próprias funções

/*

Faça um programa, que receba diversos nomes
de frutas do usuário e no final imprima essas
frutas em ordem contrária. O programa deve
solicitar ao usuário quantas frutas ele quer
informar.

*/
import java.util.Scanner;

public class Funcoes {
    //Variáveis globais
    //Declaração do vetor
    static String frutas[];

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //Variável local
        int qtd;
        
        System.out.println("Informe a quantidade de frutas para cadastrar: ");
        qtd = Integer.parseInt(teclado.nextLine());

        cadastrarDados(qtd);

        mostrarDados(qtd);
       
    }

    /*
    Uma função deve ter o seguinte:
    a) Tipo de retorno (tipo de dado que a função vai retornar);
    b) Nome (corresponde a ação que a função realiza);
    c) Parâmetros/Argumentos de entrada (opcional)
    d) Retorno (opcional -> depende do tipo de retorno)
    */

    //void = vazio
    static void cadastrarDados(int quantidade){
        //Definindo o tamanho do vetor
        frutas = new String[quantidade];

        //Recebendo as frutas
        for(int i = 0; i < quantidade; i++){
            System.out.println("Informe a " + (i + 1) + " primeira fruta:");
            frutas[i] = teclado.nextLine();
        }
    }

    static void mostrarDados(int quantidade){
        //Imprimindo de trás pra frente
         for(int i = quantidade - 1; i >= 0; i--){
            System.out.println(frutas[i]);
        }

        teclado.close();
    }
}