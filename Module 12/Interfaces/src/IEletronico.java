package Interfaces.src;
//é recomendável colocar "I" antes do nome do arquivo para identificar interface.

/*
 - Uma interface pode conter:
    - Constantes;
    - Métodos abstratos;

 - Interface para servir de contrato para produtos eletrônicos.
 Todo produto eletrônico que implementar esta interface OBRIGATORIAMENTE
 deverão implementar os métodos abstratos.
*/
public interface IEletronico {
    
    //Constante
    public String MARCA = "Geek";

    public void ligar();

    public void desligar();
}
