
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class AlunoTeste {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Random gerador = new Random();
        
        for (int i = 0; i < 200; i++) {
            int numero = gerador.nextInt(1000) + 1;
            int serie = gerador.nextInt(9) + 1;
            Aluno aluno = new Aluno(numero, serie);
            alunos.add(aluno);
        }
        
        System.out.println(alunos);
        
        Collections.sort(alunos);
        
        System.out.println(alunos);
    }
}
