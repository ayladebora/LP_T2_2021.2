package pacoteayla;

import javax.swing.JOptionPane;

public class ProgramaStrings {

    public static void main(String [] args){
        String texto = JOptionPane.showInputDialog("Digite seu nome");
        char primeiraLetra = texto.charAt(0);
        int tamanhoTexto = texto.length();
        char ultimaLetra = texto.charAt(tamanhoTexto-1);
        String textoSemBrancos = texto.trim();
        int tamanhoTextoSemBrancos = textoSemBrancos.length();
        System.out.println("A primeira letra do texto é:"+ primeiraLetra);
        System.out.println("O tamanho do texto é:"+ tamanhoTexto);
        System.out.println("A ultima letra do texto é:"+ ultimaLetra);
        System.out.println("O texto sem brancos é:"+ textoSemBrancos);
        System.out.println("O tamanho do texto sem brancos é:"+ tamanhoTextoSemBrancos);
        boolean comecaComA = texto.startsWith("A");
        System.out.println("Começa com A?"+comecaComA);
        System.out.println("O texto em maiúsculas:"+ texto.toUpperCase());

        if (comecaComA == true){
            System.out.println("Esta palavra começa com A");
        } else if (texto.startsWith("E")){
            System.out.println("Esta palavra começa com E");
        } else {
            System.out.println("Não começa nem com A e nem com E");
        }
    }
}
