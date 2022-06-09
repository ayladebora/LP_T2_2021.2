package br.ufpb.agenda;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class GravandoArquivos2 {

    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("teste2.txt"));
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
            out.write("Deu certo. uh huuuu. Número lido:" + numero + "\n");
            System.out.println("conseguiu escrever");
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Tentou escrever no arquivo");
            if (out != null) {
                out.close();
            }
        }

    }
}
