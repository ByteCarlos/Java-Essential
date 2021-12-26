package Executaveis.src;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;
    //Em Java podemos criar nosso próprios tipos de dados
    //nesse caso criamos um atributo do tipo cliente

    //Construtor
    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    //Método para sacar dinheiro da conta
    public void sacar(float valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        }else if(valor <= (this.saldo + this.limite)) {
            //calculando o valor excedente do saque
            //100 - 200 -> -100
            float val_ret = this.saldo - valor;
            if(val_ret < 0) {
                this.saldo = 0;
            }
            val_ret = this.limite + val_ret;
            this.limite = val_ret;
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    //Utilidade no Módulo 18 (Threads)

    //Forma 1 
    //Método para depositar dinheiro na conta
    public void depositar(float valor) {
        //serve para o módulo 18
        synchronized (this) {
            this.saldo = this.saldo + valor;
        }
    }

    //Forma 2
    /* 
    public synchronized void depositar(float valor){ 
        this.saldo = this.saldo + valor;
    }
    */


    //Transformando um comentário em um
    /**
     * 
     * Método getter do atributo Saldo
     * 
     * @return a soma do saldo + limite
     */
    public float getSaldo() {
        return this.saldo + this.limite;
    }

    //Método getter do atributo Limite
    public float getLimite() {
        return this.limite;
    }

    //Método getter do atributo Número
    public int getNumero() {
        return this.numero;
    }

    //Método getter do atributo Cliente
    public Cliente getCliente() {
        return this.cliente;
    }


    //Métodos para o módulo 16
    @Override
    public String toString() {
        return "O saldo da conta é " + this.getSaldo();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Conta)) { //verifica se o objeto é uma instância de Conta, senao for retorna false
            return false;
        }else {
            Conta verificar = (Conta) obj; //Cast
            return verificar.getSaldo() == this.getSaldo();
        }
    }
}
