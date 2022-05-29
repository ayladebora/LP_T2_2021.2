package br.ufpb.aulainterfaces;

import java.util.Objects;

public class Cachorro extends Mamifero implements SerComunicante, Comparable<Cachorro>{

    private String nome;
    private String raca;

    public static final String RACA_POODLE = "Poodle";
    public static final String RACA_PASTOR_ALEMAO = "Pastor Alemão";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cachorro cachorro = (Cachorro) o;
        return nome.equals(cachorro.nome) && raca.equals(cachorro.raca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, raca);
    }

    public Cachorro(String nome, String raca){
        super(2);
        this.nome = nome;
        this.raca = raca;
    }

    public Cachorro(){
        this("","");
    }

    public String getNome(){
        return this.nome;
    }


    @Override
    public String emitirSom() {
        return "au au";
    }

    @Override
    public String toString(){
        return "Cachorro de nome "+this.nome+" da raça "+this.raca;
    }


    @Override
    public int compareTo(Cachorro o) {
        if (this.nome.compareTo(o.getNome())<0){
            return -1;
        } else if (this.nome.compareTo(o.getNome())==0){
            return 0;
        } else {
            return 1;
        }
    }
}
