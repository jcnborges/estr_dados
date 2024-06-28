
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Aluno> mapAlunos = new HashMap<>();
        mapAlunos.put("Representante Discente", new Aluno(2, 2, "Joao da Silva"));
        mapAlunos.put("Representante de Sala", new Aluno(22, 1, "Ana"));
        mapAlunos.put("Aniversariante do Dia", new Aluno(24, 3, "Leleo"));
        
        System.out.println(mapAlunos.get("Professor"));
    }
}
