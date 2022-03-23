package com.ayladebora.textos;

import java.util.Scanner;

public class TestaLeituraDeTextos {
	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		boolean sair = false;
		
		
		while(!sair) {
			System.out.println("Digite uma opção:\n1.Somar\n2.Subtrair\n3.Sair");
			String opcao = leitor.nextLine();
			switch(opcao) {
				case "1":
					System.out.println("Digite o primeiro número real");
					double num1 = Double.parseDouble(leitor.nextLine());
					System.out.println("Digite o segundo número real");
					double num2 = Double.parseDouble(leitor.nextLine());
					double soma = num1+num2;
					System.out.println("A soma é: "+soma);
					break;
				case "2":
					System.out.println("Digite o primeiro número real");
					double num1Sub = Double.parseDouble(leitor.nextLine());
					System.out.println("Digite o segundo número real");
					double num2Sub = Double.parseDouble(leitor.nextLine());
					double subtracao = num1Sub - num2Sub;
					System.out.println("A subtração é: "+subtracao);
					break;
				case "3":
					sair = true;
					break;
				default:
					System.out.println("Você digitou uma opção inválida. Tente novamente");
			}//fim do switch
			
		}//while
		
		System.out.println("Fim do programa");
		
		leitor.close();
	}
}
