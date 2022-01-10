package Threads.src;
//Simulação da geração de relatório + barra de tarefa
//sem a utilização de threads

public class Programa1 {
    public static void main(String[] args) {
        BarraDeProgesso barra = new BarraDeProgesso();
        barra.executa();

        GeraRelatorio relatorio = new GeraRelatorio();
        relatorio.executa();
    }
}
