package br.ufpb.dcx.banco;

import javax.swing.*;

public class MenuBanco {

    public static void main(String [] args){
        boolean continuar = true;
        SistemaBanco sistema = new BancoList();

        while (continuar) {
            try {
                boolean idadeOk = false;
                int idade = Integer.parseInt(JOptionPane.showInputDialog(
                        "Quantos anos você tem?"));
                JOptionPane.showMessageDialog(
                        null, "Que idade boa a dos "
                                + idade + " anos");
                String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Abrir conta\n2.Sacar de conta\n3.Sair");
                if (opcao.equals("1")) {
                    String cpf = JOptionPane.showInputDialog("Digite o cpf da conta");
                    String numConta = JOptionPane.showInputDialog("Digite o número da conta");
                    String numAgencia = JOptionPane.showInputDialog("Digite o número da agencia");
                    double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta"));
                    Conta conta = new ContaSimples(cpf, numConta, numAgencia, saldoInicial);
                    boolean abriu = sistema.abrirConta(conta);
                    if (abriu) {
                        JOptionPane.showMessageDialog(null, "Conta criada com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Problema ao abrir conta. veja se o número da conta já existe na agência");
                    }
                } else if (opcao.equals("2")) {
                    //Sacar de conta
                    String numConta = JOptionPane.showInputDialog("Digite o número da conta");
                    String numAgencia = JOptionPane.showInputDialog("Digite o número da agencia");
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a sacar"));
                    sistema.sacarDeConta(numConta, numAgencia, valor);
                    JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
                } else if (opcao.equals("3")) {
                    continuar = false;
                }

            } catch (ContaNaoExisteException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + ". Verifique os números digitados");
            } catch(SaldoInsuficienteException e){
                JOptionPane.showMessageDialog(null, e.getMessage() + ". Verifique o valor digitado e o saldo da conta");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro ao converter o valor digitado. Veja se você tem realmente um número"
                        + "\nDetalhes do erro:" + e.getMessage()+"\nTente Novamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro geral encontrado:" + e.getMessage() +"\nTente Novamente");
            }
        }
    }
}
