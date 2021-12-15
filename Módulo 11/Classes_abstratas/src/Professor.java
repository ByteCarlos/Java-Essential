package Classes_abstratas.src;
public class Professor extends Pessoa {
    private String matricula;

    public Professor(String nome, int ano_nascimento, String email, String matricula) {
        super(nome, ano_nascimento, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return super.toString() + "\nMatricula: " + this.matricula; 
    }

    public String getNome() {
        return "Professor:  \n" + super.getNome();
    }

    //como implementar um método abstrato nas
    //classes que herdam da classe do método
    @Override
    public void outra_mensagem(String texto) {
        System.out.println(texto);
        
    }
}
