package Filas.src;
//Filas

/*
Todo elemento entra no final da fila.

O primeiro elemento a entrar é também o primeiro a sair.

<- [0][1][2][3][4]
*/
public class Main {
    public static void main(String[] args) {
        //Criando a fila
        Fila fila = new Fila();
        System.out.println(fila);

        //Adicionando
        fila.adiciona("Angelina");
        fila.adiciona("Felicity");
        fila.adiciona("Maria");

        System.out.println(fila);

        //Removendo
        String ret = fila.remove();
        System.out.println(ret);

        System.out.println(fila);

        //Deixando vazia
        fila.remove();
        fila.remove();
        fila.remove(); //error
        System.out.println(fila.vazia());
    }
}
