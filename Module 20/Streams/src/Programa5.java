package Streams.src;
//Stream

import java.util.ArrayList;
import java.util.List;

public class Programa5 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        
        cursos.add(new Curso("Programação para Leigos", 170));
        cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
        cursos.add(new Curso("Programação em C: Essencial", 125));
        cursos.add(new Curso("Programação em Java: Essencial", 0));
        cursos.add(new Curso("Programação em Python: Essencial", 0));
        cursos.add(new Curso("Banco de Dados: Essencial", 0));

        cursos.stream()
            .filter(c -> c.getAlunos() < 1)
            // .findAny() //pega qualquer um de acordo com o filtro
            .findFirst()
            .ifPresent(System.out::println); //se encontrar algum curso, imprime
    }
}
