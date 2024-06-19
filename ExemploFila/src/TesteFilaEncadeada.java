/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TesteFilaEncadeada {
    public static void main(String[] args) {
        FilaEncadeada fila = new FilaEncadeada();    
        
        System.out.println(fila.remover());
        
        fila.inserir(50);
        fila.inserir(30);
        fila.inserir(6);
        fila.inserir(17);
        fila.inserir(8);
        
        System.out.println(fila.remover());
        System.out.println(fila.remover());
        
        fila.inserir(3);
        fila.inserir(7);
        fila.inserir(23);
        fila.inserir(100);
        fila.inserir(4);
        fila.inserir(66);
        fila.inserir(0);
        fila.inserir(103);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(fila.remover());
        }
        
        System.out.println(fila.remover());
        System.out.println(fila.remover());
        
        fila.inserir(3);
        fila.inserir(7);
        fila.inserir(23);
        fila.inserir(100);
        fila.inserir(4);
        fila.inserir(66);
        fila.inserir(0);
        fila.inserir(103);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(fila.remover());
        }        
    }
}
