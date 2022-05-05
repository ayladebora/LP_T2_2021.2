package br.ufpb.dcx.gerentecolecoes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProgramaGerenteDeColecoes {

    public static void main(String[] args) {
        SistemaGerenciadorDeColecoes sistema = new SistemaGerenciadorDeColecoes();
        boolean continuar = true;
        while (continuar) {

            String opcao = JOptionPane.showInputDialog(
                    "Digite uma opção:\n1.Cadastrar item\n2.Pesquisar itens por tipo\n3.Pesquisar itens por nome\n4.Sair");
            switch (opcao) {
                case "1":
                    String nomeItem = JOptionPane.showInputDialog("Digite o nome do item");
                    String dataIngressoItem = JOptionPane
                            .showInputDialog("Digite a data de ingresso do item na coleção");
                    String descricaoItem = JOptionPane.showInputDialog("Digite a descrição do item");
                    String tipoItem = JOptionPane.showInputDialog("Digite o tipo de coleção deste item");

                    ItemColecionavel item = new ItemColecionavel(nomeItem, dataIngressoItem, descricaoItem, tipoItem);

                    sistema.adicionarItem(item);
                    break;
                case "2":

                    String tipoAPesquisar = JOptionPane.showInputDialog("Qual o tipo de coleção que você quer?");
                    ArrayList<ItemColecionavel> itensAchados = sistema.pesquisarItensPorTipo(tipoAPesquisar);
                    if (itensAchados.size() == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Não foi encontrado nenhum item desse tipo:" + tipoAPesquisar);
                    } else {
                        for (ItemColecionavel itemAchado : itensAchados) {
                            JOptionPane.showMessageDialog(null, itemAchado.toString());
                        }
                    }
                    break;
                case "3":
                    // TODO: PESQUISAR POR NOME
                    String prefixoAPesquisar = JOptionPane.showInputDialog("Qual nome do item (prefixo)?");
                    ArrayList<ItemColecionavel> itensAchadosPorNome = sistema
                            .pesquisarItensComNomeComecandoCom(prefixoAPesquisar);
                    if (itensAchadosPorNome.size() == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Não foi encontrado nenhum item começando com esse nome:" + prefixoAPesquisar);
                    } else {
                        for (ItemColecionavel itemAchado : itensAchadosPorNome) {
                            JOptionPane.showMessageDialog(null, itemAchado.toString());
                        }
                    }

                    break;
                case "4":
                    continuar = false;
                    System.out.println("FIM DO PROGRAMA! ATÉ MAIS");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }

    }
}
