package br.ufpb.ayla.banco;

import java.util.List;

public class BancoList implements SistemaBanco {

    private String nome;
    private String cnpj;
    private List<Conta> contas;

    public BancoList(String nome, String cnpj, List<Conta> contas){
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    public boolean existeConta(Conta conta){
        for (Conta c: this.contas){
            if (c.equals(conta)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean abrirConta(Conta novaConta) {
        for (Conta c: this.contas){
            if (c.getNumeroAgencia().equals(novaConta.getNumeroAgencia()) &&
              c.getNumeroConta().equals(novaConta.getNumeroConta())){
                return false;
            }
        }
        this.contas.add(novaConta);
        return true;
    }

    @Override
    public List<Conta> pesquisarContasComSaldoNegativo() {
        return null; //TODO: IMPLEMENTAR
    }

    @Override
    public void transferir(String numContaO, String numAgenciaO, String numContaD, String numAgenciaD, double valor) {
        //TODO: IMPLEMENTAR
    }

    @Override
    public List<Conta> pesquisarContasDoCliente(String cpf) {
        return null;
        //TODO: IMPLEMENTAR
    }

    @Override
    public boolean sacarDeConta(String numConta, String numAgencia, double valor) {
        return false;
        //TODO: IMPLEMENTAR
    }
}
