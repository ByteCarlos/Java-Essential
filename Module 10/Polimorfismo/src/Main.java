package Polimorfismo.src;
//Herança
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro da Silva", 1998, "pedro@gmail.com");

        System.out.println(p1);
        System.out.println(p1.getNome());
        System.out.println("\n");

        Aluno a1 = new Aluno("Vanessa da Silva", 2001, "vanessa@gmail.com","123456");
        
        System.out.println(a1);
        System.out.println(a1.getNome());
        System.out.println("\n");

        Professor prof1 = new Professor("Augusto da Silva", 1976, "augusto@gmail.com", "ABC987");

        System.out.println(prof1);
        System.out.println(prof1.getNome());
        System.out.println("\n");
        
    }
}