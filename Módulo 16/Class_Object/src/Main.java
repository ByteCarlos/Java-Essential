package Class_Object.src;
import Executaveis.src.*;
//Object: A mãe de todas as classes

/*
 - A classe Object, faz parte do pacote java.lang
*/

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente(17, "Carlos", "Rua A");
        Cliente cli2 = new Cliente(19, "Maria", "Rua B");

        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(2, 200, 300, cli2);

        Caixa prateleira = new Caixa();

        System.out.println(c1); //por padrão a instância imprime com toString()
        System.out.println(c2);

        if(c1.equals(cli1)) { //Mesma coisa de c1 == c2, não podemos comparar com equals objetos diferentes
            System.out.println("São a mesma conta");
        }else {
            System.out.println("São contas diferentes");
        }

        prateleira.adicionar(c1);
        prateleira.adicionar(c2);

        //Conta conta = prateleira.pegar(0);

        //System.out.println(conta.getSaldo());

        /* 
        Quando temos um array de objetos temos que especificar para o sistema
        qual objetos estamos tratando senão não poderemos usar seus métodos
        */

        System.out.println(((Conta)prateleira.pegar(0)).getSaldo());

        prateleira.adicionar(cli1); //2 = não tem getSaldo();

        System.out.println(((Cliente)prateleira.pegar(2)).getNome());

        if((Object)cli1 instanceof Conta) { //método para verificar tipo do Objeto
            System.out.println("O objeto é do tipo Conta");
        }else {
            System.out.println("O objeto não é do tipo Conta");
        }
    }
}
