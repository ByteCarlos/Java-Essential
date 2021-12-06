//Construtor

/*
 - O construtor de uma classe SEMPRE tem o mesmo nome da classe;
 - Por padrão, a JVM - Java Virtual Machine, cria em tempo de execução,
 um construtor padrão - um construtor vazio;
 - Podemos ter mais de um construtor na classe;
*/

public class Construtor {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); // (Método) Construtor
        //Colocando informações nos atributos da classe
        pessoa1.nome = "Felicity Jones";
        pessoa1.email = "felicity@gmail.com";
        pessoa1.ano_nascimento = 1986;
        //Usando método para imprimir as informações
        pessoa1.imprime_informacoes();

        //Usando construtor com parâmetro
        Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelina@gmail.com", 1976);
        //Usando método para imprimir as informações
        pessoa2.imprime_informacoes();
    }
}
