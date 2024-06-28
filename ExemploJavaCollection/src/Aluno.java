/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class Aluno implements Comparable<Aluno> {
    private int numero;
    private int serie;
    private String nome;

    public Aluno(int numero, int serie) {
        this.numero = numero;
        this.serie = serie;
    }

    public Aluno(int numero, int serie, String nome) {
        this.numero = numero;
        this.serie = serie;
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return String.format("numero:%d;nome:%s;serie:%d", numero, nome, serie);
    }

    @Override
    public int compareTo(Aluno o) {
        if (this.numero > o.numero)
            return 1;
        else if (this.numero < o.numero) {
            return -1;
        }
        return 0;
    }
        
}
