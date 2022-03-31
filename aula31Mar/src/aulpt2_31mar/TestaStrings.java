/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulpt2_31mar;

import java.util.Scanner;

/**
 *
 * @author ayla
 */
public class TestaStrings {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de nomes");
        int quant = Integer.parseInt(leitor.nextLine());
        String [] nomes = new String[quant];
        for (int k=0; k< nomes.length; k++){
            System.out.println("Digite o próximo nome");
            nomes[k] = leitor.nextLine();
        }
        
        int quantNomesComecandoComA = contaNomesComA(nomes);
        System.out.println("Há "+ quantNomesComecandoComA + "  nomes começando com A/a");
        
        int quantNomesComecandoComAV2 = contaNomesComAV2(nomes);
        System.out.println("V2: Há "+ quantNomesComecandoComAV2 + "  nomes começando com A/a");
        
        leitor.close();
    }
    
    public static int contaNomesComAV2(String [] palavras){
        int cont = 0;
        for (int k=0; k< palavras.length; k++){
            if (palavras[k].toLowerCase().charAt(0)=='a'){
                cont++;
            }
        }
        return cont;
    }
    
    public static int contaNomesComA(String [] palavras){
        int cont = 0;
        for (int k=0; k< palavras.length; k++){
            if (palavras[k].charAt(0)=='A' || palavras[k].charAt(0)=='a'){
                cont++;
            }
        }
        return cont;
    }
}
