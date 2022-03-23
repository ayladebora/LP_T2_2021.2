package com.ayladebora.calculos;

import java.util.Scanner;

public class TestaOperacoesFor {

	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("De qual número você quer o somatório?");
		int numero = Integer.parseInt(leitor.nextLine());
		
		for ( int cont = 1; cont<=numero ; cont++) {
			soma+=cont;
		}

		
		System.out.println("Soma de 1 a "+numero+"  é "+soma);
		leitor.close();
	}
	
}
