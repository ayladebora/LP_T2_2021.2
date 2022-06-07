package br.ufpb.dcx.banco;

public class ContaSimples extends Conta{

	public ContaSimples(String cpf, String numC, 
			String numAg, double saldo) {
		super(cpf, numC, numAg, saldo);
	}

	
	@Override
	public double getSaldoDisponivel() {
		return super.getSaldo();
	}
	

}
