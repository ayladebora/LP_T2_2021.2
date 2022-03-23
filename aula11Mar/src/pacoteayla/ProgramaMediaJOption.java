package pacoteayla;

import javax.swing.JOptionPane;

public class ProgramaMediaJOption {

    public static void main(String [] args){
        JOptionPane.showMessageDialog(null, "Vamos calcular a média de 3 notas");
        String nota1String = JOptionPane.showInputDialog("Digite a nota 1");
        double nota1 = Double.parseDouble(nota1String);
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
        double media = (nota1+nota2+nota3)/3;
        JOptionPane.showMessageDialog(null,"A média das 3 notas é: "+media);
        String texto = String.format("A média das 3 notas é %.1f\n", media);
        JOptionPane.showMessageDialog(null, texto);
        float x = 7.8f;
        int y = 10;
        byte w = 5;
        boolean estouFeliz = true;
        boolean tenhoDinheiro = false;
        char letra = 'A';
        String texto2 = "Ayla";
        System.out.println("A primeira letra do texto 2 é:"+ texto2.charAt(0));

    }
}
