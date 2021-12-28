package Armazenamento_sequencial.src;
//Armazenamento sequencial

/**
 * int numeros[] = new int[5];
 * 
 * numeros[0] = 1;
 * numeros[1] = 3;
 * numeros[2] = 5;
 * numeros[3] = 7;
 * numeros[4] = 9;
 */
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Angelina");
        Aluno a2 = new Aluno("Felicity");

        Vetor lista = new Vetor();
        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista); //imprime o vetor

        System.out.println(lista.contem(a1)); //verifica se contém na lista

        System.out.println(lista.pega(0));  //retorna o aluno pela posição

        try {
            System.out.println(lista.pega(101));
        }catch(IllegalArgumentException e) {
            System.out.println("O aluno da posição 101 não existe");
            System.out.println(e.getMessage());
        }

        Aluno a3 = new Aluno("Maria");

        lista.adiciona(1, a3);

        try {
            lista.adiciona(101, a3);
        }catch(IllegalArgumentException e) {
            System.out.println("A posição 101 é inválida");
        }

        lista.remove(0);
        
        System.out.println(lista);
    }
}
