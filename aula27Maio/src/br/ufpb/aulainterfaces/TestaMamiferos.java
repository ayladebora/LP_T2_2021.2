package br.ufpb.aulainterfaces;

public class TestaMamiferos {

    public static void main(String [] args){
        Mamifero animal1 = new Cachorro("Lulu","Pequinês");
        System.out.println("Quantos meses de gestação? \n"+ animal1.getNumMesesGestacao());
        Cachorro animal2 = new Cachorro("Bob", "Pastor Alemão");
        System.out.println(animal2.getNumMesesGestacao());
        Cachorro animal3 = new Cachorro("Lili",  Cachorro.RACA_POODLE);
        System.out.println("Quantos meses de gestação? \n"+ animal3.getNumMesesGestacao());
        Cachorro animal4 = new Cachorro("Lili", Cachorro.RACA_POODLE);
        if (animal3.equals(animal4)){
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
    }
}
