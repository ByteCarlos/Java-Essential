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

Ou seja, só temos acesso ao atributo ou método privado
dentro da própria classe onde ele foi declarado
*/

//Protected (Protegido)

//É o modificador de acesso default (Padrão)
//se não declarar nem private e nem public

/*
 - O modificador de acesso Protected faz com que
 o elemento seja visível somente dentro do mesmo
 pacote onde o elemento foi declarado
*/

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

        this.dizer_oi();
    }

    private void dizer_oi() {
        System.out.println("Olá " + this.nome + ", Bem vindo!");
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }
}
