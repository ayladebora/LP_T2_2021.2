import java.util.Scanner;

public class ProgramaString {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma opcao:\n1.Bom dia!\n2.Boa tarde!");

        String opcao = leitor.nextLine();
        if (opcao.startsWith("1")) {
            System.out.println("Bom dia!");
        } else if (opcao.startsWith("2")) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Opção inválida");
        }

        leitor.close();
    }
}