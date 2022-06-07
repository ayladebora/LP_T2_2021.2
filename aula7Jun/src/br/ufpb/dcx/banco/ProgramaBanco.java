package br.ufpb.dcx.banco;

import java.util.LinkedList;

public class ProgramaBanco {
	public static void main(String[] args) {
		SistemaBanco meuBanco = new BancoList("Ayla's Bank", "123/321",
				new LinkedList<Conta>());
		Conta contaAyla = new ContaSimples("233.333.345-44", "111-1",
				"222-2", 200.00);
		meuBanco.abrirConta(contaAyla);
		System.out.println(meuBanco.consultarSaldoDisponivelDeConta(
				"111-1", "222-2"));
//		meuBanco.sacarDeConta(
//				"111-1", "222-2", 200);
		System.out.println(meuBanco.consultarSaldoDisponivelDeConta(
				"111-1", "222-2"));
	}
}