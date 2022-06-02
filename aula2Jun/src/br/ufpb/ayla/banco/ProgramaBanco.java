package br.ufpb.ayla.banco;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProgramaBanco {

    public static void main(String [] args){


        List minhaLista = new ArrayList();
        List <String> minhaLista2 = new LinkedList<>();

        Conta conta1 = new ContaSimples("444.444.444-44", "111-1", "222-2", 10);
        conta1.debitar(1000);
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getSaldoDisponivel());

        Conta conta2 = new ContaEspecial("555.555.555-55", "777-7","888-8", 100, 1000);
        conta2.debitar(1050);
        System.out.println(conta2.getSaldo());
        System.out.println(conta2.getSaldoDisponivel());


    }
}
