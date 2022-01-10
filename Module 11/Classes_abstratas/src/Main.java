package Classes_abstratas.src;
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
    classe com métodos abstratos, precisa implementar estes métodos.
*/ 

public class Main {
    public static void main(String[] args) {
        //Pessoa maria = new Pessoa("Maria da Silva", 1999, "maria@gmail.com");
        Aluno maria = new Aluno("Maria da Silva", 1999, "maria@gmail.com", "123456");
        System.out.println(maria);

        maria.outra_mensagem("Meu nome é: " + maria.getNome());
    }
}
