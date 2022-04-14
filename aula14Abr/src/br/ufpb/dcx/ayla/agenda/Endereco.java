package br.ufpb.dcx.ayla.agenda;

public class Endereco {

    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(){
        this.logradouro = "";
        this.numero = "";
        this.bairro = "";
        this.cidade = "";
        this.estado = "";
    }

    public Endereco(String logradouro, String numero, String bairro, String cidade, String estado){
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString(){
        return this.logradouro+", "+ this.numero+" - "+ this.bairro+", da cidade "+this.cidade+"-"+this.estado;
    }

    public String getLogradouro(){
        return this.logradouro;
    }
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }


    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
