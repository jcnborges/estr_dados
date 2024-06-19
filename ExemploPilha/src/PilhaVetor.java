/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class PilhaVetor {
    // camada de dados
    private Float[] vetor;
    private int topo;

    public PilhaVetor() {
        vetor = new Float[100];
        topo = -1;
    }
    
    public boolean estaVazia() {
        return topo == -1;
    }
    
    public boolean estaCheia() {
        return topo == vetor.length - 1;
    }
    
    public void push(float valor) {
        if (estaCheia()) {
            System.out.println("Pilha esta cheia!");
        } else {
            topo++;
            vetor[topo] = valor;
        }
    }
    
    public Float pop() {
        if (estaVazia()) {
            System.out.println("Pilha esta vazia!");
            return null;
        }  else {
            float valor = vetor[topo];
            topo--;
            return valor;
        }
    }
}
