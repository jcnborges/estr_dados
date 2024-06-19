/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class NoFila {
    private float valor;
    private NoFila prox;

    public NoFila(float valor) {
        this.valor = valor;
        this.prox = null;
    }

    public void setProx(NoFila prox) {
        this.prox = prox;
    }

    public NoFila getProx() {
        return prox;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }
    
}
