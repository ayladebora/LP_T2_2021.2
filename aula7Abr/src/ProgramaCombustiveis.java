import java.util.Scanner;

public class ProgramaCombustiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pesquisas você quer fazer?");
        int quantPesquisas = Integer.parseInt(leitor.nextLine());
        for (int k = 0; k < quantPesquisas; k++) {
            System.out.println("Quantos quilômetros (km) "
                    + "você percorreu desde o abastecimento?");
            int kmPercorridos = Integer.parseInt(leitor.nextLine());
            System.out.println("Quantos litros de combustível gastou?");
            double litros = Double.parseDouble(leitor.nextLine());
            double desempenho = kmPercorridos / litros;
            if (desempenho < 11) {
                System.out.println("Seu carro está gastando "
                        + "muito combustível.");
            } else {
                System.out.println("Parabéns! Seu carro é econômico");
            }
        }
        leitor.close();
    }
}