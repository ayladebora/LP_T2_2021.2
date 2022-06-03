package br.ufpb.ayla.banco;

import java.util.List;

public interface SistemaBanco {

    boolean abrirConta(Conta novaConta);
    List<Conta> pesquisarContasComSaldoNegativo();
    void transferir(String numContaO, String numAgenciaO, String numContaD, String numAgenciaD, double valor);
    List<Conta> pesquisarContasDoCliente(String cpf);
    boolean sacarDeConta(String numConta, String numAgencia, double valor);

}
