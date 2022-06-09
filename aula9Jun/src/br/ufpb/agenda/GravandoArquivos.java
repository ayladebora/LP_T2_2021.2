package br.ufpb.agenda;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravandoArquivos {

    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("teste.txt"));
            out.write("Deu certo. uh huuuu");
            System.out.println("conseguiu escrever");
        } catch (FileNotFoundException e) {
            System.err.println("O arquivo teste.txt não foi encontrado");
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        } finally {
            System.out.println("Tentou escrever no arquivo");
            if (out != null) {
                out.close();
            }
        }

    }
}