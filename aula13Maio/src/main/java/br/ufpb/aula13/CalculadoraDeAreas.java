package br.ufpb.aula13;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeAreas {

    public static void main(String [] args){
        Quadrado quad1  = new Quadrado(4);
        Quadrado quad2 = new Quadrado();
        Figura quad3 = new Quadrado(3);
        Figura figura4 = new Triangulo(4, 9);
        Figura figura5 = new Circulo(7);


        List<Figura> figuras = new ArrayList<>();
        figuras.add(quad1);
        figuras.add(quad2);
        figuras.add(quad3);
        figuras.add(figura4);
        figuras.add(figura5);

        double soma = 0.0;
        for (Figura f: figuras){
            double areaDeF = f.calcularArea();
            soma+=areaDeF;
            System.out.println(areaDeF);
            System.out.println(f.toString());
        }
        System.out.println("A soma das áreas é "+soma);


    }
}
