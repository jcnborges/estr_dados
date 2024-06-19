/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class FibonacciRecursivo {
    public static int F(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }
    
    public static void main(String args[]) {
        System.out.println(F(6));
    }    
}
