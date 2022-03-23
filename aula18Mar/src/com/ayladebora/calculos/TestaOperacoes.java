package com.ayladebora.calculos;

import java.util.Scanner;

public class TestaOperacoes {
	
	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("De qual número você quer o somatório?");
		int numero = Integer.parseInt(leitor.nextLine());
		
		int cont = 1;
		while(cont<=numero) {
			
			//soma = soma+cont;
			soma+=cont;
			
			//cont = cont+1;
			//cont+=1;
			cont++;
		}
		
		System.out.println("Soma de 1 a "+numero+"  é "+soma);
		leitor.close();
	}

}
