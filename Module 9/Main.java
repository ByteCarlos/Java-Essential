public class Main {
//Encapsulamento
//Cápsula
    public static void main(String[] args) {

        //Criando os clientes
        Cliente c1 = new Cliente("João da Silva", "Rua da Paz, 45");
        Cliente c2 = new Cliente("Maria da Silva", "Rua da Paz, 25");

        //Criando as contas
        Conta conta1 = new Conta(1, 100.0f, 200.0f, c1);
        Conta conta2 = new Conta(2, 300.0f, 500.0f, c2);

        //Imprimindo as informações de cada um
        //Cliente 1
        System.out.println("================================");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Endereco: " + c1.getEndereco());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println("================================");

        //Cliente 2
        System.out.println("================================");
        System.out.println("Nome: " + c2.getNome());
        System.out.println("Endereco: " + c2.getEndereco());
        System.out.println("Saldo: " + conta2.getSaldo());
        System.out.println("================================");

        //Sacando da primeira conta
        conta1.sacar(300);

        //Imprimindo o saldo depois do saque
        System.out.println("Saldo do João (Depois do saque): " + conta1.getSaldo());

        //Imprimindo o limite de cada um
        System.out.println("Saldo do João: " + conta1.getLimite());
        System.out.println("Saldo da Maria: " + conta2.getLimite());
    }
}
