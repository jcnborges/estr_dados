/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 * N! = N * (N - 1) * (N - 2) * (N - 3) * ... * 1
 * 3! = 3 * 2 * 1 = 6
 * 5! = 5 * 4 * 3 * 2 * 1
 * 1! = 1
 * 0! = 1 // por definição
 * Testar: N = 0, N = 1, N = 5, N = 7 e N = 10
 * @author Aluno
 */
public class FuncaoFatorial {

    public static int calcFatorial(int N) {
        int fat = 1;
        for (int i = N; i > 0; i--) {
            fat = i * fat;
        }
        return fat;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 0;
        int fat = calcFatorial(N);
        System.out.println(N + "! = " + fat);
        N = 1;
        fat = calcFatorial(N);
        System.out.println(N + "! = " + fat);
    }
    
}
