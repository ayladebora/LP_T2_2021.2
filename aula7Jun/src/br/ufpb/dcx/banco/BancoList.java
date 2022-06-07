package br.ufpb.dcx.banco;

import java.util.List;
import java.util.LinkedList;

public class BancoList implements SistemaBanco {
	private String nome;
	private String cnpj;
	private List<Conta> contas;

	public BancoList(String nome, String cnpj,
			List<Conta> contas) {
		this.setNome(nome);
		this.setCnpj(cnpj);
		this.contas = contas;
	}

	public BancoList(){
		this("Sem nome", "Sem cnpj", new LinkedList<>());
	}

	@Override
	public List<Conta> pesquisarContasComSaldoNegativo() {
		LinkedList<Conta> contasNeg = new LinkedList<>();
		for (Conta c : this.contas) {
			if (c.getSaldo() < 0) {
				contasNeg.add(c);
			}
		}
		return contasNeg;
	}

	@Override
	public boolean abrirConta(Conta novaConta) {
		for (Conta c : this.contas) {
			if (c.equals(novaConta)) {
				return false;
			}
		}
		this.contas.add(novaConta);
		return true;
	}

	@Override
	public void transferir(String numContaO, String numAgenciaO, String numContaD, String numAgenciaD, double valor) {
		Conta contaO = null;
		Conta contaD = null;
		for (Conta c : this.contas) {
			if (c.getNumeroAgencia().equals(numAgenciaO) && c.getNumeroConta().equals(numContaO)) {
				contaO = c;
			}
			if (c.getNumeroAgencia().equals(numAgenciaD) && c.getNumeroConta().equals(numContaD)) {
				contaD = c;
			}
		}
		if (contaO != null && contaD != null) {
			contaO.debitar(valor);
			contaD.creditar(valor);
		}

	}

	@Override
	public List<Conta> pesquisarContasDoCliente(String cpfCliente) {
		// TODO: IMPLEMENTAR
		return null;// Implementar
	}

	@Override
	public double consultarSaldoDisponivelDeConta(String numConta, String numAgencia) {
		// TODO: Implementar
		return 0.0;
	}// ...

	@Override
	public double consultarSaldoDeConta(String numConta, String numAgencia) {
		double saldo = 0;
		for (Conta c : this.contas) {
			if (c.getNumeroConta().equals(numConta)
					&& c.getNumeroAgencia().equals(numAgencia)) {
				saldo = c.getSaldo();
			}
		}
		return saldo;
	}// ...

	@Override
	public void sacarDeConta(String numConta, String numAgencia, double valor) throws SaldoInsuficienteException, ContaNaoExisteException {
		boolean encontrouConta = false;
		for (Conta c : this.contas) {
			if (c.getNumeroAgencia().equals(numAgencia) && c.getNumeroConta().equals(numConta)) {
				encontrouConta = true;
				if (c.getSaldoDisponivel()>=valor) {
					c.debitar(valor);
				} else {
					throw new SaldoInsuficienteException("Não há saldo suficiente na conta para realizar o saque de R$"+valor);
				}
			}
		}
		if (!encontrouConta){
			throw new ContaNaoExisteException("Não existe no banco nenhuma conta de número "+numConta+", na agência "+numAgencia);
		}
	}

	@Override
	public boolean depositarEmConta(String numConta, String numAgencia, double valor) {
		for (Conta c : this.contas) {
			if (c.getNumeroAgencia().equals(numAgencia) && c.getNumeroConta().equals(numConta)) {
				c.creditar(valor);
				return true;
			}
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
