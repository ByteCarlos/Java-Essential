package Try_Catch.src;
//Tratando exceções com try/catch

/*
 - Utilizamos o try para tentar realizar algo, geralmente realizar aquilo que
 pode acarretar em um problema.

 - Utilizamos o catch para capturar o erro e com isso oferecer ao usuário do sistema
 uma mensagem adequada sem que o sistema quebre.
*/
public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[5];//0...4 -> [0][1][2][3][4] -> elemento final = n - 1

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3 * 2;
        }

        for(int i = 0; i <= numeros.length; i++) {
            //aqui temos um erro de out index na posição 5 do array devido ao "<="
            try { //Tente fazer isso
                System.out.println(numeros[i]);
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Você está tentando acessar uma posição do array que não existe.");
            }
        }
    }
}