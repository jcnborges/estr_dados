
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class EscreveFile {
    public static void main(String[] args) {
        File arquivo = new File("texto.txt");
        
        System.out.println("Escreva o seu texto, digite 'sair' para encerrar...");
        
        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(System.in);
        
        String linha;
        do {
            System.out.print(":>");
            linha = input.nextLine();
            if (!linha.equals("sair")) {
                sb.append(linha);
                sb.append("\n");
            }
        } while(!linha.equals("sair"));
        
        // Código para gravar o conteúdo do texto
        try {
            FileWriter writer = new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(sb.toString());
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
    }
}
