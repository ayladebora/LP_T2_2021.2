package br.ufpb.dcx.ayla.agenda;

import javax.swing.*;

public class ProgramaAgenda {

    public static void main(String [] args){
        int maxContatos = 1000;
        AgendaEnderecos agenda = new AgendaEnderecos(maxContatos);
        boolean sair = false;
        while(!sair){
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar contato\n2.Pesquisa endereço\n3.Pesquisa número de contatos do bairro\n4.Apaga contato\n5.Sair\n"));
            switch(opcao){
                case 1: //cadastrar
                    String nome = JOptionPane.showInputDialog("Digite o nome do contato");
                    String logradouro = JOptionPane.showInputDialog("Digite o nome da rua/avenida onde mora");
                    String numero = JOptionPane.showInputDialog("Digite o número de onde mora");
                    String bairro = JOptionPane.showInputDialog("Digite o bairro onde mora");
                    String cidade = JOptionPane.showInputDialog("Digite a cidade onde mora");
                    String estado = JOptionPane.showInputDialog("Digite o estado onde mora");
                    Endereco end = new Endereco(logradouro, numero, bairro, cidade, estado);
                    Contato c = new Contato(nome, end);
                    boolean cadastrou = agenda.cadastraContato(c);
                    if (cadastrou){
                        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Problema ao cadastrar. Remova contatos antigos pois sua agenda está cheia");
                    }
                    break;
                case 2:    //pesquisar endereço
                    String nomeContato = JOptionPane.showInputDialog("Qual o nome do contato que você quer pesquisar?");
                    Endereco enderecoAchado = agenda.pesquisaEndereco(nomeContato);
                    if (enderecoAchado==null){
                        JOptionPane.showMessageDialog(null, "Não existe nenhum contato com este nome");

                    } else {
                        JOptionPane.showMessageDialog(null, "O endereço encontrado para "+ nomeContato +" foi "+ enderecoAchado.toString());
                    }
                    break;
                case 3:
                    //TODO
                    break;
                case 4:
                    //TODO
                    break;

                case 5:
                    sair = true;
                    break;
            }
        }
    }
}
