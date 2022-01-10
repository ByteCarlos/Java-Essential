//Tipos de dados
//Numéricos (Inteiros e Reais)
public class Numericos {
    public static void main(String[] args) {
        //Tipos primários / primitivos
        long num0 = 99; //Inteiro muito grande
        int num1 = 4;//Inteiro 99999999999999
        short num2 = 4; //Inteiro (curto/menor/baixo) 99999
        byte num3 = 4; //Inteiro

        //Por padrão, os números reais em Java são considerados double
        //por isso para float precisa do "f" depois do valor
        float preco1 = 23.4f; //23.40
        double preco2 = 23.4; //23.43435435453454534534

        //Tipos não primários / não primitivos
        Integer num4 = 98;
        Short num5 = 7;
        Byte num6 = 9;
        Long num7 = (long) 999999999; //Cast

        Float preco3 = 44.5f;
        Double preco4 = 44.5;
        
        //Imprimindo os inteiros
        System.out.println("long -> Num0 = " + num0);
        System.out.println("int -> Num1 = " + num1);
        System.out.println("short -> Num2 = " + num2);
        System.out.println("byte -> Num3 = " + num3);
        System.out.println("Integer -> Num4 = " + num4);
        System.out.println("Short -> Num5 = " + num5);
        System.out.println("Byte -> Num6 = " + num6);
        System.out.println("Long -> Num7 = " + num7);

        //Imprimindo os reais
        System.out.println("float -> preco1 = " + preco1);
        System.out.println("double -> preco2 = " + preco2);
        System.out.println("Float -> preco3 = " + preco3);
        System.out.println("Double -> preco4 = " + preco4);

        //Vendo quanto de espaço em memória cada um ocupa os inteiros
        System.out.println("int/Integer " + Integer.SIZE + " bits");
        System.out.println("short/Short " + Short.SIZE + " bits");
        System.out.println("byte/Byte " + Byte.SIZE + " bits");
        System.out.println("long/Long " + Long.SIZE + " bits");

        //Vendo quanto de espaço em memória cada um ocupa os reais
        System.out.println("float/Float " + Float.SIZE + " bits");
        System.out.println("double/Double " + Double.SIZE + " bits");
    }
}
