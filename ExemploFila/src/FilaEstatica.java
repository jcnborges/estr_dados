/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class FilaEstatica {
    private Float vetor[];
    private int primeiro;
    private int ultimo;
    private int qtd;

    public FilaEstatica() {
        vetor = new Float[10];
        primeiro = 0;
        ultimo = 0;
        qtd = 0;
    }
    
    public boolean estaVazia() {
        if (qtd == 0) {
            System.out.println("Fila vazia!");
            return true;
        } else {
            return false;
        }
    }
    
    public boolean estaCheia() {
        if (qtd == vetor.length) {
            System.out.println("Fila cheia!");
            return true;
        } else {
            return false;
        }
    }
    
    // ENQUEUE    
    public void inserir(float valor) {
        if (!estaCheia()) {
            if (estaVazia()) {
                primeiro = 0;
                ultimo = 0;
                vetor[ultimo] = valor;
                qtd++;
            } else {
                ultimo++;
                if (ultimo > vetor.length - 1) {
                    ultimo = 0;
                }
                vetor[ultimo] = valor;
                qtd++;
            }
        }
    }
    
    // UNQUEUE
    public Float remover() {
        if (!estaVazia()) {
            float valor = vetor[primeiro];
            primeiro++;
            if (primeiro > vetor.length - 1) {
                primeiro = 0;
            }
            qtd--;
            return valor;
        } else {            
            return null;
        }        
    }
    
}
