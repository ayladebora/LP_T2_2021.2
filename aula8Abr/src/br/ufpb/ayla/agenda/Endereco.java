package br.ufpb.ayla.agenda;

public class Endereco {

    private String logradouro;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;


    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }


    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setCidade(String novaCidade){
        this.cidade = novaCidade;
    }

    public String getLogradouro(){
        return this.logradouro;
    }

    public String getBairro(){
        return this.bairro;
    }

    public void setBairro(String novoBairro){
        this.bairro = novoBairro;
    }

    public void setLogradouro(String novoLogradouro){
        this.logradouro = novoLogradouro;
    }


}
