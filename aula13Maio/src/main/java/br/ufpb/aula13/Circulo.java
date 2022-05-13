package br.ufpb.aula13;

public class Circulo implements Figura {

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    public String toString(){
        return "Círculo de raio "+this.getRaio()+", e que tem área "+ this.calcularArea();
    }

    public double calcularArea(){
        return Math.PI * this.raio* this.raio;
    }
}
