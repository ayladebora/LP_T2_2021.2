package br.ufpb.dcx.banco;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
