package br.ufpb.dcx.ayla.banco;

public class Conta {

    private String numero;
    private String cpfTitular;
    private double saldo;

    public Conta(){
        this.numero = "";
        this.cpfTitular = "";
        this.saldo = 0.0;
    }

    public Conta(String numero, String cpfTitular, double saldoInicial){
        this.numero = numero;
        this.cpfTitular = cpfTitular;
        this.saldo = saldoInicial;
    }


    public String toString(){
        return "Conta de número "+ this.numero + ", que pertence ao cliente de CPF "
                + this.cpfTitular+" e tem saldo de R$ "+saldo;
    }
    /**
     * Este método retorna o saldo atual da conta.
     *
     * @return o valor do saldo atual da conta.
     */
    public double getSaldo(){
        return this.saldo;
    }


    public String getCpfTitular(){
        return this.cpfTitular;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setCpfTitular(String cpf){
        this.cpfTitular = cpf;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    /**
     * Este método acrescenta um certo valor
     * ao saldo atual da conta.
     * @param valor O valor a ser adicionado ao saldo da conta.
     * @return O novo valor do saldo após o depósito.
     */
    public double depositar(double valor){
        this.saldo+= valor;
        return this.saldo;
    }

    public double sacar(double valor){
        this.saldo-=valor;
        return this.saldo;
    }



}
