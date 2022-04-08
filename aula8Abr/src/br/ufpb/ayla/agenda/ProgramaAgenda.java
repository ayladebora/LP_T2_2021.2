package br.ufpb.ayla.agenda;

import javax.swing.*;

public class ProgramaAgenda {
    public static void main(String [] args){

        JOptionPane.showMessageDialog(null, "Vamos cadastrar contatos e endereços");

        Contato contato1 = new Contato();
        String nomeContato1 = JOptionPane.showInputDialog("Digite o nome do contato 1");
        contato1.setNome(nomeContato1);

        Endereco end1 = new Endereco();
        String logradouroEnd1 = JOptionPane.showInputDialog("Digite o logradouro do endereço 1");
        end1.setLogradouro(logradouroEnd1);
        String bairroEnd1 = JOptionPane.showInputDialog("Digite o bairro do endereço 1");
        end1.setBairro(bairroEnd1);

        contato1.setEndereco(end1);


        Contato contato2 = new Contato();
        String nomecontato2 = JOptionPane.showInputDialog("Digite o nome do contato 2");
        contato2.setNome(nomecontato2);

        Endereco end2 = new Endereco();
        String logradouroEnd2 = JOptionPane.showInputDialog("Digite o logradouro do endereço 2");
        end2.setLogradouro(logradouroEnd2);
        String bairroEnd2 = JOptionPane.showInputDialog("Digite o bairro do endereço 2");
        end2.setBairro(bairroEnd2);

        contato2.setEndereco(end2);


        System.out.println("Contato 1:"+ contato1.getNome());
        System.out.println("End1:"+ end1.getLogradouro()+ ", que fica no bairro "+ end1.getBairro());
        System.out.println("Contato 2:"+ contato2.getNome());
        System.out.println("End2:"+ end2.getLogradouro()+ ", " +
                "que fica no bairro "+ end2.getBairro());
        System.out.println(contato2.getEndereco().getBairro());

    }
}
