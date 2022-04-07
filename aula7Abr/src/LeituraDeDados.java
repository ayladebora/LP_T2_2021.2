import javax.swing.*;
import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String [] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        if (numero%2 == 0){
            System.out.println("O número é par");

        } else {
            System.out.println("O número é ímpar");
        }

        String mensagem = (numero%2 == 0) ? "O número é par" : "O número é ímpar";
        System.out.println(mensagem);


        String nome = "Ayla";
        System.out.println("nome é String:"+ (nome instanceof String));

        Scanner leitor = new Scanner(System.in);
        System.out.println("nome é Scanner:"+ (leitor instanceof java.util.Scanner));
    }
}
