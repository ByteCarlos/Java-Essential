package Math.src;
//Realizando cálculos com Math
/**
 * A biblioteca Math possui vários métodos e constantes estáticas
 * para que possamos utilizar nos nosso programas.
 */
public class Main {
    public static void main(String[] args) {
        //Constantes
        System.out.println(Math.E); 
        System.out.println(Math.PI);

        //Seno de 45 graus
        System.out.println(Math.sin(45));
        //Cosseno de 45 graus
        System.err.println(Math.cos(45));
        //Tangente de 45 graus
        System.out.println(Math.tan(45));

        //Método que arredonda o número para baixo
        System.out.println(Math.round(Math.PI)); //retorna um inteiro
        System.out.println(Math.floor(Math.PI)); //retorna um float
        //Método que arredonda o número para cima
        System.out.println(Math.ceil(Math.PI));

        //Método para calcular a potência
        System.out.println(Math.pow(3, 2)); // 3 ** 2

        //Método para calcular a raiz quadrada
        System.out.println(Math.sqrt(9));

        //LEMBRANDO QUE TEM MUITO MAIS QUE ISSO NA BIBLIOTECA MATH :)
    }
}
