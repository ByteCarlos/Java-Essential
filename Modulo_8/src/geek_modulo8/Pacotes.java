package geek_modulo8;
//Pacotes

/*
 - Pacotes servem para organizar o código fonte do projeto;
 - Pacotes indicam onde determinado arquivo do projeto se encontra;
 - Os nomes de pacotes devem ser em letra minúsculas, sem espaço, sem
 caractere especial, sem acentuação;
 - Por convenção, é utilizado nos nomes de pacotes, o domínio da empresa
 criadora do projeto, ao contrário, sendo a última parte do nome
 o especificador do pacote;
*/

public class Pacotes {
    String nome, email;
    int ano_nascimento;

    //construtor vazio
    public Pacotes() {}

    //construtor com parâmetros
    public Pacotes(String nome, String email, int ano_nascimento) {
        //this == Este objeto
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_informacoes() {
        System.out.println("============= Pessoa ============");
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Ano de Nascimento: " + this.ano_nascimento);
    
}

}