package br.ufpb.dcx.pacotegeral;

import java.util.Scanner;

public class TestaArray {
	
	public static void main(String [] args) {
		if (args.length == 0) {
			System.out.println("Não foi passado argumento para este programa");
		} else {
			System.out.println("Lista de argumentos do programa:");
			for (int k=0; k< args.length; k++) {
				System.out.println("Args["+ k +"]:"+ args[k]);
			}
		}
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantos nomes você quer ler?");
		int tamanho = Integer.parseInt(leitor.nextLine());
		
		String [] nomes = new String[tamanho];
		for (int k=0; k<tamanho; k++) {
			System.out.println("Digite o próximo nome:");
			nomes[k] = leitor.nextLine();
		}
		
		System.out.println("Nomes lidos:");
		for (int k=0; k< nomes.length; k++) {
			System.out.println("Nome ["+k+"]:"+ nomes[k]);
			System.out.println("Tamanho do nome:"+ nomes[k].length());
		}
		
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = leitor.nextLine();
		String [] arrayDoNome = nomeCompleto.split(" ");
		System.out.println("Array de nomes:");
		for (int k=0; k< arrayDoNome.length; k++) {
			System.out.println(arrayDoNome[k]);
		}
		leitor.close();
	}

}
