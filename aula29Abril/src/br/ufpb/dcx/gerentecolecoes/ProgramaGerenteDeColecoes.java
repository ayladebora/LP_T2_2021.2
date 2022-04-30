package br.ufpb.dcx.gerentecolecoes;

import java.util.Scanner;

public class ProgramaGerenteDeColecoes {

    public static void main(String [] args){
        SistemaGerenciadorDeColecoes sistema = new SistemaGerenciadorDeColecoes();
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;
        while(continuar){
            System.out.println("Digite uma opção:\n1.Cadastrar item\n2.Pesquisar itens por tipo\n3.Pesquisar itens por nome\n4.Sair");
            String opcao = leitor.nextLine();
            if (opcao.equals("1")){
                //CADASTRAR O ITEM
            } else if (opcao.equals("2")){
                //pesquisa por tipo
            } else if (opcao.equals("3")){
                //pesquisar por nome
            } else {
                continuar = false;
                System.out.println("FIM DO PROGRAMA! ATÉ MAIS");
            }
        }

        leitor.close();
    }
}
