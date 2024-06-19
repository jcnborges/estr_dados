/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class PilhaEncadeada {
    private NoPilha topo;
    private NoPilha inicio;

    public PilhaEncadeada() {
        topo = null;
    }
    
    public boolean estaVazia() {
        return topo == null;
    }
    
    public void push(float valor) {
        NoPilha no = new NoPilha();
        no.setInfo(valor);
        if (estaVazia()) {
            topo = no;
        } else {
            no.setProx(topo);
            topo = no;
        }
    }
    
    public float pop() {
        if (estaVazia()) {
            System.out.println("Pilha esta vazia!");
            return -1;
        } else {
            float valor = topo.getInfo();
            topo = topo.getProx();
            return valor;
        }
    }
}
