package Listas_ligadas.src;
/**
 * Classe que representa um célula (container) onde
 * teremos o objeto (valor) e uma célula que será a
 * ligação para o próximo.
 * 
 * @author Carlos
 */
public class Celula {
    private Object elemento;
    private Celula proximo;

    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula getProximo() {
        return this.proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return this.elemento;
    }
}
