package br.ufpb.dcx.gerentecolecoes;

import javax.swing.JOptionPane;

public class TestaItens {

    public static void main(String[] args) {
        ItemColecionavel item1 = new ItemColecionavel();
        System.out.println(item1.toString());
        ItemColecionavel item2 = new ItemColecionavel("Barbie", "05/10/2015", "Barbie Sereia", "BONECA");
        System.out.println(item2.toString());

        String nomeItem3 = JOptionPane.showInputDialog("Digite o nome do item");
        String dataIngressoItem3 = JOptionPane.showInputDialog("Digite a data de ingresso do item na coleção");
        String descricaoItem3 = JOptionPane.showInputDialog("Digite a descrição do item");
        String tipoItem3 = JOptionPane.showInputDialog("Digite o tipo de coleção deste item");

        ItemColecionavel item3 = new ItemColecionavel(nomeItem3, dataIngressoItem3, descricaoItem3, tipoItem3);
        System.out.println(item3.toString());

        System.out.println("Vamos modificar nosso carrinho...");
        String novaDescricaoItem3 = JOptionPane.showInputDialog("Digite a nova descrição para o item 3");
        item3.setDescricao(novaDescricaoItem3);
        System.out.println(item3.toString());
    }
}
