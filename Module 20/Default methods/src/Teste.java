package Default_methods.src;

public interface Teste {
    
    int valor = 9;

    //Método abstrato
    public String mensagem();

    //Default method
    default void meu_metodo() {
        System.out.println("Meu default method...");
    }
}
