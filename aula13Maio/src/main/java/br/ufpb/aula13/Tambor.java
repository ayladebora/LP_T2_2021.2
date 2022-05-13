package br.ufpb.aula13;

public class Tambor implements EmissorDeSom{

    private String tamanho;
    private String marca;
    public Tambor(String tamanho, String marca){
        this.tamanho = tamanho;
        this.marca = marca;
    }
    public String toString(){
        return "Tambor da marca "+this.marca+", de tamanho "+this.tamanho+ " e que emite o som "+ this.emitirSom();
    }
    public String emitirSom(){
        return "tum tum";
    }
}
