package Executaveis.src;

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
