package br.ufpb.dcx.banco;

import java.util.List;

public interface SistemaBanco {

	double consultarSaldoDeConta(String numConta, String numAgencia);

	double consultarSaldoDisponivelDeConta(String numConta, String numAgencia);

	List<Conta> pesquisarContasDoCliente(String cpfCliente);

	void transferir(String numContaO, String numAgenciaO, String numContaD,
			String numAgenciaD, double valor);

	boolean abrirConta(Conta novaConta);

	List<Conta> pesquisarContasComSaldoNegativo();

	void sacarDeConta(String numConta, String numAgencia, double valor) throws SaldoInsuficienteException, ContaNaoExisteException;

	boolean depositarEmConta(String numConta, String numAgencia, double valor);

}
