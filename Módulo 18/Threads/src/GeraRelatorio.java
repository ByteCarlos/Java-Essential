package Threads.src;

public class GeraRelatorio implements Runnable{
    
    public void executa() {
        //For 0 até 10 milhões
        for(int i = 0; i < 1000; i++) {
            System.out.println("Gerando relatório...aguarde");
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Gerando relatório...aguarde");
        } 
    }
}
