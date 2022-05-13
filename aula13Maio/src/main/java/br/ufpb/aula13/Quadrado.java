package br.ufpb.aula13;

public class Quadrado implements Figura {

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public Quadrado(){
        this(0.0);
    }

    @Override
    public String toString(){
        return "Quadrado de lado "+this.lado+ " e que tem área de "+ this.calcularArea();
    }


    public double getLado(){
        return this.lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }



    public double calcularArea(){
        return this.lado * this.lado;
    }

}
