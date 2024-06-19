/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class FilaEncadeada {
    private NoFila primeiro;
    private NoFila ultimo;

    public FilaEncadeada() {
        primeiro = null;
        ultimo = null;
    }
    
    public boolean estaVazia() {
        if (primeiro == null && ultimo == null) {
            System.out.println("Fila vazia!");
            return true;
        } else {
            return false;
        }
    }
    
    // ENQUEUE
    public void inserir(float valor) {
        if (estaVazia()) {
            NoFila no = new NoFila(valor);
            primeiro = no;
            ultimo = no;
        } else {
            NoFila no = new NoFila(valor);
            ultimo.setProx(no);
            ultimo = no;
        }
    }
    
    // UNQUEUE
    public Float remover() {
        if (estaVazia()) {
            return null;
        } else {
            float valor = primeiro.getValor();
            if (primeiro.getProx() == null) {
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = primeiro.getProx();
            }
            return valor;
        }
    }
    
}
