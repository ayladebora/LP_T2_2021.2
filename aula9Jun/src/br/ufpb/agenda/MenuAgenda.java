package br.ufpb.agenda;

import java.io.IOException;
import java.util.List;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class MenuAgenda {

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        boolean continuar = true;
        try {
            agenda.recuperarDados();
            JOptionPane.showMessageDialog(null, "Dados recuperados com sucesso");
        } catch (IOException e1) {
            JOptionPane.showMessageDialog(null, "Problemas ao recuperar dados salvos. Detalhes:" + e1.getMessage());
        }

        while (continuar) {
            String opcao = JOptionPane
                    .showInputDialog("Digite uma opção:\n1.Cadastrar contato\n2.Listar contatos\n3.Sair");
            if (opcao.equals("1")) {
                String nome = JOptionPane.showInputDialog("Digite o nome do contato");
                String telefone = JOptionPane.showInputDialog("Digite o telefone do contato");
                Contato c = new Contato(nome, telefone);
                try {
                    agenda.cadastrarContato(c);
                    JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso");
                } catch (ContatoJaExisteException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else if (opcao.equals("2")) {
                List<Contato> contatos = agenda.obterTodosOsContatos();
                for (Contato c : contatos) {
                    System.out.println("NOme:" + c.getNome() + ", Telefone:" + c.getTelefone());
                }
            } else if (opcao.equals("3")) {
                continuar = false;
                try {
                    agenda.salvarDados();
                    JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
                } catch (IOException e) {

                    JOptionPane.showMessageDialog(null,
                            "Problemas ao salvar arquivo. Detalhes do erro:" + e.getMessage());
                }
            }
        }

    }

}
