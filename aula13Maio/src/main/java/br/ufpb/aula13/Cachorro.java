package br.ufpb.aula13;

public class Cachorro implements EmissorDeSom {


    private String nome;
    private String raca;

    public Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    public Cachorro(String nome){
        this(nome, "Indefinida");
    }

    public String toString(){
        return "Cachorro de nome "+this.nome +" da raça "+this.raca+" e que emite o som: "+this.emitirSom();
    }

    public String emitirSom(){
        return "au au";
    }
}
