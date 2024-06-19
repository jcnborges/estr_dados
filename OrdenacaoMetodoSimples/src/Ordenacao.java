
import java.util.Random;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Ordenacao {
    
    public static void main(String[] args) {
        int[] vetor = new int[20];
        Random gerador = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(100) + 1;
        }
        mostrar(vetor);
        
        int[] copiaVetor = Arrays.copyOf(vetor, vetor.length);
        selectionSort(copiaVetor);
        
        System.out.println();
        mostrar(copiaVetor);
    }
    
    public static void mostrar(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
    
    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[min_index]) {
                    min_index = j;
                }
            }
            if (i != min_index) {
                int temp = vetor[i];
                vetor[i] = vetor[min_index];
                vetor[min_index] = temp;
            }
        }
    }
    
}
