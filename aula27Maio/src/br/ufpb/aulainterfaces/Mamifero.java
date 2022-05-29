package br.ufpb.aulainterfaces;

public class Mamifero {

    private int numMesesGestacao;

    public Mamifero(int numMesesGestacao){
        this.numMesesGestacao = numMesesGestacao;
    }

    public int getNumMesesGestacao(){
        return this.numMesesGestacao;
    }

    public void setNumMesesGestacao(int numMeses){
        this.numMesesGestacao = numMeses;
    }
}
