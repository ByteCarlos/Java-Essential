//Instrução switch
public class Instrucao_switch {
    public static void main(String[] args) {
        int numero = 3;

        //É muito útil para fazer menus no console
        //o break é fundamental para parar o switch
        switch(numero){
            case 1:
                System.out.println("O número é 1");
                break;
            case 3:
                System.out.println("O número é 3");
                break;
            case 5:
                System.out.println("O número é 5");
                break;
            default:
                System.out.println("O número é " + numero);
                break;
        }
    }
}
