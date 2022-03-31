
package aulpt2_31mar;

import java.util.Scanner;

public class ProgramaSalarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos empregados há na empresa?");
        int quantEmpregados = Integer.parseInt(leitor.nextLine());
        int contador = 0;
        int salarioMinimo = 1100;
        for (int k = 0; k < quantEmpregados; k++) {
            System.out.println("Qual o nome do empregado [" + k + "]");
            String nome = leitor.nextLine();
            System.out.println("Qual o salário de " + nome);
            double salario = Double.parseDouble(leitor.nextLine());
            if (salario >= salarioMinimo) {
                contador++;
            }
        }
        System.out.println("Valor do contador:" + contador);
        leitor.close();
    }
}
