/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class FuncaoRecursiva {
    public static int F(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * F(n - 1);
        }
    }
    
    public static void main(String args[]) {
        int valor = F(5);
        System.out.println(valor);
    }
}
