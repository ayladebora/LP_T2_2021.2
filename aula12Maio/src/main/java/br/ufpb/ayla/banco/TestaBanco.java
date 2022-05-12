package br.ufpb.ayla.banco;

import java.util.ArrayList;

public class TestaBanco {
    public static void main(String[] args) {

        // Conta c = new Conta();
        // Conta c2 = new Conta("111.111.444-67", "888-8", "999-9", 50);

        // System.out.println(c.getSaldo());
        // System.out.println(c2.getSaldo());

        BancoList meuBanco = new BancoList("Ayla's Bank", "123/321", new ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3", 100);
        System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3"));
        // ...

    }
}
