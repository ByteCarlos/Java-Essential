package Metodos_Estaticos.src;
//Métodos estáticos

/* 
 - Um método estático, não depende de uma instância da classe
 para ser utilizado.

 - Pode-se utilizar conforme:

 NomeDaClasse.metodo();
*/
public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta("Pedro da Silva");
        System.out.println("Número da conta: " + c1.getNumero());
        System.out.println("Cliente: " + c1.getCliente());

        //Chamando o método estático
        System.out.println("A próxima conta será: " + Conta.proximaConta());
        //não precisa ser por exemplo c1.proximaConta(), pois esse método
        //não depende de uma instância

    }
}
