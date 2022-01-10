package Threads.src;
/**
 * Para executar métodos em paralelo, nossa classe
 * deve implementar a interface Runnable, e o método
 * que precisar ser executado em paralelo deve
 * ser executado dentro do método run.
 */

public class BarraDeProgesso implements Runnable{
    
    public void executa() {
        //For 0 até 10 milhões
        for(int i = 0; i < 1000; i++) {
            System.out.println("Barra de progesso...aguarde");
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Barra de progesso...aguarde");
        }
    }
}
