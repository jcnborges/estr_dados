
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class ExemploSet {
    public static void main(String[] args) {
        Random gerador = new Random();
        Set<Integer> numeros = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            int numero = gerador.nextInt(101);
            numeros.add(numero);
        }
        System.out.println("Tamanho:"+numeros.size());
        System.out.println(numeros);
    }
}
