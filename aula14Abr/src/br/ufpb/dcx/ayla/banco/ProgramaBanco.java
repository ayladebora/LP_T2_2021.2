package br.ufpb.dcx.ayla.banco;

import java.util.Scanner;

public class ProgramaBanco {

    public static void main(String [] args){
        Conta conta1 = new Conta();

        System.out.println("Saldo da conta:"+ conta1.getSaldo());
        System.out.println("Número da conta:"+ conta1.getNumero());
        System.out.println("Cpf do titular da conta:"+ conta1.getCpfTitular());

        System.out.println("ALTERANDO DADOS DA CONTA 1");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o número da conta?");
        String numConta = leitor.nextLine();
        conta1.setNumero(numConta);

        System.out.println("Qual o cpf do titular da conta?");
        String cpfTitular = leitor.nextLine();
        conta1.setCpfTitular(cpfTitular);

        System.out.println("Quanto você quer depositar na conta?");
        double valor = Double.parseDouble(leitor.nextLine());
        double novoSaldo = conta1.depositar(valor);
        System.out.println("A conta agora tem saldo de R$ "+novoSaldo);

        System.out.println("Quanto você quer sacar da conta?");
        double valorSacar = Double.parseDouble(leitor.nextLine());
        double novoSaldoPosSaque = conta1.sacar(valorSacar);
        System.out.println("A conta agora tem saldo de R$ "+novoSaldoPosSaque);

        System.out.println("A conta de número "
                + conta1.getNumero()+", cujo titular tem cpf "
                +conta1.getCpfTitular()+ " está com saldo de "
                + conta1.getSaldo());

        System.out.println(conta1.toString());

        System.out.println("Criando nova conta");

        Conta conta2 = new Conta("111-1", "444.444.444-44", 100);

        System.out.println("A nova conta criada é:"+ conta2.toString());

        leitor.close();
    }

}
