/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulpt2_31mar;

import java.util.Scanner;

public class ProgramaSalariosArray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantEmpregados = 5;
        double[] salarios = new double[quantEmpregados];
        for (int k = 0; k < quantEmpregados; k++) {
            System.out.println("Qual o nome do empregado [" + k + "]");
            String nome = leitor.nextLine();
            System.out.println("Qual o salário de " + nome);
            salarios[k] = Double.parseDouble(leitor.nextLine());
        }
        System.out.println("Quantidade de salários menores que 2000:" + contaSalariosMenoresQue2000(salarios));

        System.out.println("Menor salário:" + calculaMenor(salarios));
        leitor.close();
    }

    /*
     * Crie um novo método que recebe como parâmetro um array de números reais e
     * retorna um inteiro indicando a quantidade de valores do array que são menores
     * que 2000.
     */
    public static double contaSalariosMenoresQue2000(double[] valores) {
        if (valores.length == 0) {
            return 0;
        } else {
            int contMenores = 0;
            for (int k = 0; k < valores.length; k++) {
                if (valores[k] < 2000) {
                    contMenores++;
                }
            }
            return contMenores;
        }
    }

    public static int contaSalariosMenoresQue2000V2(double[] valores) {
        if (valores.length == 0) {
            return 0;
        } else {
            int contMenores = 0;
            int k = 0;
            while (k < valores.length) {
                if (valores[k] < 2000) {
                    contMenores++;
                }
                k++;
            }
            return contMenores;
        }
    }

    public static double calculaMenor(double[] valores) {
        if (valores.length == 0) {
            return 0;
        } else {
            double menor = valores[0];
            for (int k = 0; k < valores.length; k++) {
                if (valores[k] < menor) {
                    menor = valores[k];
                }
            }
            return menor;
        }
    }
}
