package br.ufpb.aula13;

public class Triangulo implements Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){
        this(0.0, 0.0);
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public String toString(){
        return "Triângulo de base "+this.base+ ", altura "+this.altura+ " e que tem área de "+ this.calcularArea();
    }


    public double calcularArea(){
        return (this.base * this.altura) / 2;
    }

}
