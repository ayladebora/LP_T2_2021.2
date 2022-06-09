package br.ufpb.agenda;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class AgendaContatos {

    private List<Contato> contatos;
    private GravadorDeDados gravador;

    public AgendaContatos() {
        this.contatos = new LinkedList<>();
        gravador = new GravadorDeDados("contatos.txt");
    }

    public void salvarDados() throws IOException {
        List<String> texto = new LinkedList<>();
        for (Contato c : this.contatos) {
            String linha = c.getNome() + "#" + c.getTelefone();
            texto.add(linha);
        }
        this.gravador.gravaTextoEmArquivo(texto);
    }

    public void recuperarDados() throws IOException {
        List<String> texto = this.gravador.recuperarDados();
        for (String linha : texto) {
            String[] dados = linha.split("#");
            Contato c = new Contato(dados[0], dados[1]);
            this.contatos.add(c);
        }
    }

    public boolean contatoExiste(Contato contato) {
        for (Contato c : this.contatos) {
            if (c.getNome().equals(contato.getNome())) {
                return true;
            }
        }
        return false;
    }

    public void cadastrarContato(Contato c) throws ContatoJaExisteException {
        if (contatoExiste(c)) {
            throw new ContatoJaExisteException("Já existe contato com o nome " + c.getNome());
        } else {
            this.contatos.add(c);
        }

    }

    public List<Contato> obterTodosOsContatos() {
        return this.contatos;
    }

}
