package br.ufpb.dcx.banco;

public class ContaNaoExisteException extends Exception {

    public ContaNaoExisteException(String msg){
        super(msg);
    }
}
