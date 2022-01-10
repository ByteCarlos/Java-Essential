//Classes

/*
 - O nome das classes inicia com letra maiúscula;
 - O nome não deve conter: Acentuaçõa, caracteres especiais, espaço
 - Nas classes Java, não existe a implementação da função main()
 - O nome da classe Java DEVE ser o mesmo nome do arquivo java
 - Tudo que estiver dentro das chaves {} faz parte da classe
 - Toda classes Java possui a seguinte forma:

public class NomeDaClasse {

}
*/

//Atributos

/*
 - São as características da classe/molde/modelo de dados;
 - Podemos entender atributos como variáveis da classe;
 - Uma outra forma de nomenclatura para os atributos são estados;
 - Atributos são nomeados em letras minúsculas, sem espaços, sem
caracteres especiais, sem acentuação.
*/

//Métodos

/*
 - Podemos entender os métodos como a ação que é realizada por um objeto da classe;
 - Podemos entender também que os métodos são comportamentos dos objetos da classe;

 - Mesmos requisitos para funções
    Uma função deve ter o seguinte:
    a) Tipo de retorno (tipo de dado que a função vai retornar);
    b) Nome (corresponde a ação que a função realiza);
    c) Parâmetros/Argumentos de entrada (opcional)
    d) Retorno (opcional -> depende do tipo de retorno)
*/

public class Produto {
    String nome;
    float preco;
    float desconto;

    //Método para aumentar o preço do produto com um valor desejado
    void aumentar_preco(float valor) {
        this.preco = this.preco + valor;
    }
}