package br.ufpb.agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class GravadorDeDados {

    private String nomeArquivo;

    public GravadorDeDados(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void gravaTextoEmArquivo(List<String> texto) throws IOException {
        BufferedWriter gravador = null;
        try {
            gravador = new BufferedWriter(new FileWriter(this.nomeArquivo));
            for (String s : texto) {
                gravador.write(s + "\n");
            }
        } finally {
            if (gravador != null) {
                gravador.close();
            }
        }

    }

    public List<String> recuperarDados() throws IOException {
        List<String> textoLido = new LinkedList<>();
        BufferedReader leitor = null;
        try {
            leitor = new BufferedReader(new FileReader(this.nomeArquivo));
            String linha = null;
            do {
                linha = leitor.readLine();
                if (linha != null) {
                    textoLido.add(linha);
                }
            } while (linha != null);
        } finally {
            if (leitor != null) {
                leitor.close();
            }
        }
        return textoLido;
    }
}
