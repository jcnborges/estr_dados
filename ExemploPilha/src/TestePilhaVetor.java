/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TestePilhaVetor {
    public static void main(String[] args) {
        PilhaVetor pilha = new PilhaVetor();
        
        pilha.pop();
        
        pilha.push(5);
        pilha.push(6);
        pilha.push(10);
        
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
    }
}
