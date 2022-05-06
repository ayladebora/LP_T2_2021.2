package br.ufpb.ayla.banco;

import java.util.ArrayList;

public class BancoList {
    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    public String toString() {
        return "Banco " + this.nome + " de CNPJ " + this.cnpj + " e que tem " + this.contas.size() + " contas";
    }

    public void transferir(String numContaO, String numAgO, String numContaD, String numAgenciaD, double valor) {
        // TODO: IMPLEMENTAR
    }

    public void abrirConta(String cpfTitular, String numConta, String numAgencia, double saldoInicial) {
        // TODO: IMPLEMENTAR
    }

    public ArrayList<Conta> pesquisarContasComSaldoNegativo() {
        // TODO: IMPLEMENTAR
        return null;
    }

    public double consultarSaldoDeConta(String numConta, String numAgencia) {
        double saldo = 0;
        for (Conta c : this.contas) {
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)) {
                saldo = c.getSaldo();
            }
        }
        return saldo;
    }// ...

    public double sacarDeConta(String numConta, String numAgencia, double valor) {
        // TODO: IMPLEMENTAR
        return 0.0;
    }

    public double depositarEmConta(String numConta, String numAgencia, double valor) {
        // TODO: IMPLEMENTAR
        return 0.0;
    }

    public ArrayList<Conta> pesquisarContasDoCliente(String cpf) {
        // TODO: IMPLEMENTAR
        return null;
    }
}
