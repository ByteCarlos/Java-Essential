package Threads.src;
//Simulação da geração de relatório + barra de tarefa
//COM a utilização de threads

public class Programa2 {
    public static void main(String[] args) {
        BarraDeProgesso barra = new BarraDeProgesso();
        Thread t1 = new Thread(barra);
        t1.start();

        GeraRelatorio relatorio = new GeraRelatorio();
        Thread t2 = new Thread(relatorio);
        t2.start();
    }
    
}
