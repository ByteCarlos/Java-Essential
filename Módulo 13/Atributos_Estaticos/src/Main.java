package Atributos_Estaticos.src;
//Atributos estáticos

/*
 - Atributos estáticos são atributos, onde os valores são compartilhados
 entre as instâncias da classe.

 - Para utilizar um atributo estático, colocamos o nome da classe
 junto ao atributo.

 Exemplo:
 NomeDaClasse.atributo;
*/
public class Main {
    public static void main(String[] args) {
        
        Conta c1 = new Conta("Pedro da Silva");

        System.out.println(c1.getNumero());

        System.out.println(c1.getCliente());


        Conta c2 = new Conta("Maria José");

        System.out.println(c2.getNumero());

        System.out.println(c2.getCliente());


        Conta c3 = new Conta("Carlos Henrique");

        System.out.println(c3.getNumero());

        System.out.println(c3.getCliente());


        //Podemos alterar o atributo estático tbm
        Conta.contador = 42;

        System.out.println(Conta.contador);

    }
}
