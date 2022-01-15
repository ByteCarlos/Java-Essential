package Game.model;

import java.util.Random;

public class Calcular {
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;

    public Calcular(int dificuldade) {
        Random rand = new Random();

        this.operacao = rand.nextInt(3); //0 -> somar, 1 - diminuir, 2 - multiplicar
        this.dificuldade = dificuldade;

        if(dificuldade == 1) {
            //fácil
            this.valor1 = rand.nextInt(10); //0 a 9
            this.valor2 = rand.nextInt(10);
        }else if(dificuldade == 2) {
            //médio
            this.valor1 = rand.nextInt(100); //0 a 99
            this.valor2 = rand.nextInt(100);
        }else if(dificuldade == 3) {
           //difícil
           this.valor1 = rand.nextInt(1000); //0 a 999
           this.valor2 = rand.nextInt(1000); 
        }else if(dificuldade == 4) {
            //insano
           this.valor1 = rand.nextInt(10000); //0 a 9999
           this.valor2 = rand.nextInt(10000);
        }else {
            //ultra
           this.valor1 = rand.nextInt(100000); //0 a 99999
           this.valor2 = rand.nextInt(100000);
        }
    }
    
    public int getDificuldade() {
        return this.dificuldade;
    }

    public int getValor1() {
        return this.valor1;
    }

    public int getValor2() {
        return this.valor2;
    }

    public int getOperacao() {
        return this.operacao;
    }

    public int getResultado() {
        return this.resultado;
    }

    public String toString() {
        String op;
        if(this.operacao == 0) {
            op = "Somar";
        }else if(this.operacao == 1) {
            op = "Diminuir";
        }else if(this.operacao == 2) {
            op = "Multiplicar";
        }else {
            op = "Operação desconhecida";
        }

        return "Valor 1: " + this.getValor1() + 
                "\nValor2: " +  this.getValor2() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperação: " + op;
    }

    // Soma
    public boolean somar(int resposta) {
        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()) {
            System.out.println("Resposta correta!");
            certo = true;
        }else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    // Subtração
    public boolean diminuir(int resposta) {
        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()) {
            System.out.println("Resposta correta!");
            certo = true;
        }else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    // Produto
    public boolean multiplicar(int resposta) {
        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()) {
            System.out.println("Resposta correta!");
            certo = true;
        }else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }
}
