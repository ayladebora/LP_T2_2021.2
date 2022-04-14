package br.ufpb.dcx.ayla.agenda;

public class Contato {
    private String nome;
    private Endereco endereco;

    public Contato(){
        this.nome = "";
        this.endereco = new Endereco();
    }

    public Contato(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public String toString(){
        return "Contato de nome "+this.nome+" e que mora no endereço "+
                this.endereco.toString();
    }

}
