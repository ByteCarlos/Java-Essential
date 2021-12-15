package Template_Method.src;
//Template Method

/*
 - O padrão Template Method define o esqueleto de um algoritmo dentro de um método,
 transferindo alguns de seus passos para as subclasses. O Template Method permite
 que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura
 do próprio algoritmo.

 - Algoritmos são "receitas" passo-a-passo para resolver algum problema.
 Exemplo:
 receber numero;
 retornar numero * numero;

 Com Template Method:
 metodo_principal() {
     passo1();
     passo2();
     passo3();
 }
*/
public class Main {
    public static void main(String[] args) {
        TreinamentoInicio tit = new TreinamentoInicio();
        
        tit.treinoDiario();

        TreinamentoFinal tft = new TreinamentoFinal();

        tft.treinoDiario();
    }
}
