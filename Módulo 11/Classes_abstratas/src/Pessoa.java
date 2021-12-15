package Classes_abstratas.src;
/*
 - Classe base
 - Classe mãe
 - Classe pai
 - Super classe
 - Classe genérica
*/

//Classes abstratas

/*
 - É um recurso que proporciona um bloqueio na criação de objetos;
 - Definimos como abstract a classe pessoa;
 - Desta forma, impossibilitamos a criação de objetos desta classe
 - Uma Classe abstrata pode ter:
    - Atributos;
    - Métodos;
    - Métodos abstratos;

 - Métodos abstratos:
    - São métodos que não possuem implementação, possuem apenas
    declaração, e, obrigatoriamente, as classes que herdarem desta
    classe com método abstrato, precisa implementar estes métodos.
*/ 

public abstract class Pessoa {
    private String nome;
    private int ano_nascimento;
    private String email;

    public Pessoa(String nome, int ano_nascimento, String email) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return this.ano_nascimento;
    }

    public void setAnoNascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nAno Nascimento: " + this.ano_nascimento;
    }

    //vamos criar um método abstrato
    //declarando método abstrato (não pode implementar)
    public abstract void outra_mensagem(String texto);
}