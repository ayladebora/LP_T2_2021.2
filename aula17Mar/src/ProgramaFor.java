import java.util.Scanner;

public class ProgramaFor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número");
        int cont = Integer.parseInt(leitor.nextLine());

        // int k = 0;
        // while (k < cont) {
        // System.out.println("Oi");
        // k++;
        // }

        System.out.println("Testando o for:");

        for (int x = 0; x < cont; x++) {
            System.out.println("Oi " + x);
        }

        leitor.close();

    }
}
