package Polimorfismo.src;

/* Benefícios da Herança
 - Evita a repetição de código;
 - Facilita a manutenção do programa;
 - ...

 - Classe específica;
 - Sub-classe
 - Classe filha
*/
//Aluno é uma Pessoa
/*
 - Quando uma classe herda de outra classe ela ganha:
 - Todos os atributos e métodos da classe herdada.
*/
public class Aluno extends Pessoa{ //extends ClasseQueDesejaHerdar
    private String ra;

    public Aluno(String nome, int ano_nascimento, String email, String ra) {
        super(nome, ano_nascimento, email); //super -> construtor da classe herdada
        // = Pessoa(nome, ano_nascimento);
        this.ra = ra;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String toString() { //Polimorfismo
        return super.toString() + "\nR.A: " + this.ra; 
    }

    public String getNome() {
        return "Aluno:  \n" + super.getNome();
    }
}
