/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulpt2_31mar;

import javax.swing.JOptionPane;

/**
 *
 * @author ayla
 */
public class TestaPares {
    
    public static void main(String [] args){
        int [] meuArray = {4, 7, 9, 10, 12, 15};
        System.out.println("Quantidade de pares:"+ contaPares(meuArray));
        int [] numeros = new int[4];
        int k=0; 
        while(k<4){
            numeros[k] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite um inteiro"));
            
            k++;
        }
        System.out.println("Quantidade de pares lidos:"+contaPares(numeros));
    }
    
    public static int contaPares(int [] numeros){
        int cont = 0;
        for (int k=0; k< numeros.length; k++){
            if (numeros[k]%2 == 0){
                cont++;
            }
        }
        return cont;
    }
    
    
    
}
