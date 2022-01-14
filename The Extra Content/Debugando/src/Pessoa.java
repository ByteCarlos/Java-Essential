package Debugando.src;
// Os Break Points (pontos marcados) definem onde a IDE vai realizar o Debug
// dessa forma clicando em Debug você verá cada passo das linhas de códigos
// com o intuito de entender e remover bugs do seu programa
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome; //Break Point
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void falar(String msg) {
        msg = msg.replace('o', '0');//Break Point
        System.out.println(this.getNome() + " disse " + msg);//Break Point
    } 
}
