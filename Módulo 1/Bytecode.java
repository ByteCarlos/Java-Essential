//Quando compilamos um programa em Java, diferente da linguagem C,
//O compilador gera um arquivo intermediario chamado bytecode com extensão .class,
//diferente de C que gera um .exe, que pode ser inicializado em qualquer SO. 
public class Bytecode {
    
    public static void main(String[] args){

        //Declarando e inicializando variável
        int idade = 19;

        System.out.println("Eu tenho " + idade + " anos");
        
        //javac Programa.java -> Programa.class -> java Programa
        //código fonte (Programa.java) -> bytecode (Programa.class) -> executável
    }
}
