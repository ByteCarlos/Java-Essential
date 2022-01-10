/*
Getters e Setters

Getter
    - é um método público, que serve para consultar dados;
    - A nomenclatura desses métodos é get_nome_do_atributo();
*/

//Public

/*
Público - Pode ser utilizado em todo o projeto
*/

//Private

/*
Privado à própria classe
*/

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
            val_ret = this.limite - val_ret;
            this.limite = val_ret;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    //Método para depositar dinheiro na conta
    public void depositar(float valor) {
        this.saldo = this.saldo + valor;
    }

    //Método getter do atributo Saldo
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
}
