package com.ayladebora.calculos;

import java.util.Scanner;

public class TestaDecremento {
	
	
	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = Integer.parseInt(leitor.nextLine());
		
		for (int k=numero; k>=0; k--) {
			System.out.println("K="+k);
		}
		System.out.println("Fim do programa");
		
		leitor.close();
	}

}
