/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class NoPilha {
    private float info;
    private NoPilha prox;

    public NoPilha() {
        info = 0;
        prox = null;
    }    

    public void setInfo(float info) {
        this.info = info;
    }

    public float getInfo() {
        return info;
    }
    
    public void setProx(NoPilha prox) {
        this.prox = prox;
    }

    public NoPilha getProx() {
        return prox;
    }
    
}
