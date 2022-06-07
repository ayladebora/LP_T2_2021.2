package br.ufpb.dcx.banco;

public abstract class Conta {

	private String cpfTitular;
	private String numeroConta;
	private String numeroAgencia;
	private double saldo;

	public Conta(String cpf, String numC, String numAg, double saldo) {
		this.cpfTitular = cpf;
		this.numeroConta = numC;
		this.numeroAgencia = numAg;
		this.saldo = saldo;
	}

	public Conta() {
		this("Sem CPF", "", "1", 0.0);
	}

	public abstract double getSaldoDisponivel();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroAgencia == null) ? 0 : numeroAgencia.hashCode());
		result = prime * result + ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta outraConta = (Conta) obj;
		if (numeroAgencia == null) {
			if (outraConta.numeroAgencia != null)
				return false;
		} else if (!numeroAgencia.equals(outraConta.numeroAgencia))
			return false;
		if (numeroConta == null) {
			if (outraConta.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(outraConta.numeroConta))
			return false;
		return true;
	}

	public String toString() {
		return "Conta número " + this.numeroConta + " do cliente de CPF " + this.cpfTitular;
	}

	public String getCpfTitular() {
		return this.cpfTitular;
	}

	public void setCpfTitular(String cpf) {
		this.cpfTitular = cpf;
	}

	public String getNumeroAgencia() {
		return this.numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(String novoNumero) {
		this.numeroConta = novoNumero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public double creditar(double valor) {
		this.saldo = this.saldo + valor;
		return this.saldo;
	}

	public double debitar(double valor) {
		if (this.getSaldoDisponivel() > valor) {
			this.saldo = this.saldo - valor;
		}
		return this.saldo;
	}

}
