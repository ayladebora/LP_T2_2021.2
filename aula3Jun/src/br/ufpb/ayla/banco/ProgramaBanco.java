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
        
        Conta conta1B = new ContaEspecial("444.444.444-44", "111-1", "222-2", 10, 1000);
        
        if (conta1.equals(conta1B)) {
        	System.out.println("Conta1 é igual à conta 1B");
        } else {
        	System.out.println("São diferentes");
        }
        

        Conta conta2 = new ContaEspecial("555.555.555-55", "777-7","888-8", 100, 1000);
        conta2.debitar(1050);
        System.out.println(conta2.getSaldo());
        System.out.println(conta2.getSaldoDisponivel());
        
        
        Conta conta3 = new ContaEspecial("555.555.555-55", "777-7","888-8", 100, 1000);
        

        if (conta2.equals(conta3)) {
        	System.out.println("Conta 2 e conta 3 são considerados iguais");
        } else {
        	System.out.println("São objetos diferentes");
        }
        
        
        Conta conta4 = conta3;
        
        if (conta4.equals(conta3)) {
        	System.out.println("Conta 3 e conta 4 são considerados iguais");
        } else {
        	System.out.println("São diferentes");
        }
        
        String numero = "444-4";
        if (conta4.equals(numero)) {
        	System.out.println("A conta é diferente do número");
        } else {
        	System.out.println("São diferentes");
        }
        
        System.out.println("HashCode conta1:"+ conta1.hashCode());
        System.out.println("HashCode conta2:"+ conta2.hashCode());   
        System.out.println("HashCode conta3:"+ conta3.hashCode());
        System.out.println("HashCode conta4:"+ conta4.hashCode());

    }
}
