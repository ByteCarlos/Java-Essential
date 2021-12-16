package Atributos_Estaticos.src;

public class Conta {
    private int numero;
    private String cliente;

    //Atributo estático
    public static int contador = 1;

    public Conta(String cliente) {
        this.numero = contador;
        this.cliente = cliente;
        //Pq não this.contador
        //Todo atributo estático é recomendado usar
        //o nome_da_classe.atributo
        Conta.contador = Conta.contador + 1;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getCliente() {
        return this.cliente;
    }
}
