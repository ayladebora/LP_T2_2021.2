package br.ufpb.ayla.banco;

import java.util.Objects;

public abstract class Conta implements Comparable<Conta>{

    private String cpfTitular;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta(String cpf, String numC, String numAg, double saldo){
        this.cpfTitular = cpf;
        this.numeroConta = numC;
        this.numeroAgencia = numAg;
        this.saldo = saldo;
    }

    public Conta(){
        this("","","",0.0);
    }

    public abstract double getSaldoDisponivel();

    public double debitar(double valor){
        if (this.getSaldoDisponivel()> valor){
            this.saldo-= valor;
        }
        return this.saldo;
    }

    @Override
    public int compareTo(Conta conta2){
        if (this.getSaldo() < conta2.getSaldo()){
            return -1;
        } else if (this.getSaldo()== conta2.getSaldo()){
            return 0;
        } else {
            return 1;
        }
    }



    @Override
	public int hashCode() {
		return Objects.hash(numeroAgencia, numeroConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numeroAgencia, other.numeroAgencia) && Objects.equals(numeroConta, other.numeroConta);
	}

	public double creditar(double valor){
        this.saldo+=valor;
        return this.saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getCpfTitular(){
        return this.cpfTitular;
    }

    public void setCpfTitular(String cpf){
        this.cpfTitular = cpf;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

}
