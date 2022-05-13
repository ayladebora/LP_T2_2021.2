package br.ufpb.aula13;

import java.util.ArrayList;

public class CaixaDeSom {

    private ArrayList<EmissorDeSom> emissores;

    public CaixaDeSom(){
        this.emissores = new ArrayList<>();
    }

    public void adicionarEmissor(EmissorDeSom e){
        this.emissores.add(e);
    }

    public ArrayList<EmissorDeSom> getEmissores(){
        return this.emissores;
    }

    public boolean removerEmissor(EmissorDeSom e){
        return this.emissores.remove(e);
    }

    public void tocarTodosOsEmissores(){
        for (EmissorDeSom e: this.emissores){
            System.out.println(e.emitirSom());
        }
    }

}
