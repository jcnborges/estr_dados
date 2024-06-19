
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Aluno
 */
public class LeituraFile {

    public static void main(String[] args) {
        File arquivo = new File("texto.txt");
        List<String> palavras = new ArrayList<String>();

        try {
            FileReader reader = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(reader);
            String linha = br.readLine();
            while (linha != null) {
                palavras.add(linha);
                linha = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
        // Converter lista para array e mostrar os elementos
        String[] vetor = palavras.toArray(new String[palavras.size()]);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("vetor[%d] = %s", i, vetor[i]));
        }
    }
}
