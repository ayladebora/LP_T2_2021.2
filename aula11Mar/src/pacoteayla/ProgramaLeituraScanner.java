package pacoteayla;

import java.util.Scanner;

public class ProgramaLeituraScanner {

    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        boolean acabou = false;
        while (acabou == false) {
            System.out.println("Digite seu nome");
            String nome = leitor.nextLine();
            System.out.println("O nome lido foi:" + nome);
            System.out.println("Digite sua idade");
            int idade = Integer.parseInt(leitor.nextLine());
            System.out.println("Você tem " + idade + " anos mesmo?");
            System.out.println("Digite sua altura");
            double altura = Double.parseDouble(leitor.nextLine());
            System.out.printf("Sua altura é de %.2f\n", altura);
            System.out.println("Você deseja continuar?S/N");
            String querContinuar = leitor.nextLine();
            if (querContinuar.startsWith("N") || querContinuar.startsWith("n")){
                acabou = true;
            }
        }
        System.out.println("Até mais");
        leitor.close();
    }
}
