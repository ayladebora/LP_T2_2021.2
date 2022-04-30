package br.ufpb.dcx.gerentecolecoes;

import java.util.ArrayList;

public class SistemaGerenciadorDeColecoes {

    private ArrayList<ItemColecionavel> itensDaColecao;

    public SistemaGerenciadorDeColecoes(){
        this.itensDaColecao = new ArrayList<>();
    }

    public void adicionarItem(ItemColecionavel item){
        this.itensDaColecao.add(item);
    }

    public ArrayList<ItemColecionavel> pesquisarItensPorTipo(String tipo){
        ArrayList<ItemColecionavel> itensAchados = new ArrayList<>();
        for (ItemColecionavel item: this.itensDaColecao){
            if (item.getTipo().equals(tipo)){
                itensAchados.add(item);
            }
        }
        return itensAchados;
    }



}
