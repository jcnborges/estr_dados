/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class FatorialRecursivo {
    
    public static int F(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * F(n - 1);
        }
    }
    
    public static void main(String args[]) {
        System.out.println(F(5));
    }
    
}
