package Heranca.src;
//Herança
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro da Silva", 1998, "pedro@gmail.com");

        System.out.println("======== Pessoa ==========");
        System.out.println(p1.getNome());
        System.out.println(p1.getAnoNascimento());
        System.out.println(p1.getEmail());
        System.out.println("==========================");

        Aluno a1 = new Aluno("Vanessa da Silva", 2001, "vanessa@gmail.com","123456");
        
        System.out.println("======== Aluno ==========");
        System.out.println(a1.getNome());
        System.out.println(a1.getAnoNascimento());
        System.out.println(a1.getEmail());
        System.out.println(a1.getRa());
        System.out.println("=========================");

        Professor prof1 = new Professor("Augusto da Silva", 1976, "augusto@gmail.com", "ABC987");

        System.out.println("======= Professor ========");
        System.out.println(prof1.getNome());
        System.out.println(prof1.getAnoNascimento());
        System.out.println(prof1.getEmail());
        System.out.println(prof1.getMatricula());
        System.out.println("==========================");
    }
}