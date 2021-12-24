package HashMap.src;

import java.util.HashMap;
import java.util.Map;

import Executaveis.src.Cliente;
import Executaveis.src.Conta;

//HashMap
/**
 * A classe HashMap implementa a interface Map e trabalha com chave/valor
 * 
 * Não aceita chaves duplicadas, mas valores sim
 */

public class Main {
    public static void main(String[] args) {
        Map<String, Conta> contas = new HashMap<String, Conta>();

        Cliente cli1 = new Cliente(24, "Angelina Jolie", "Rua 1");
        Cliente cli2 = new Cliente(34, "Felicity Jones", "Rua 2");

        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(2, 400, 700, cli2);

        contas.put("Pessoa Física", c1);
        contas.put("Pessoa Jurídica", c2);

        //System.out.println(contas.size());

        //Imprimindo a conta pela key
        //System.out.println(contas.get("Pessoa Física"));
    }
}
