import java.util.Scanner;

public class ProgramaCombustiveisArray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pesquisas você quer fazer?");
        int quantPesquisas = Integer.parseInt(leitor.nextLine());
        double [] arrayDesempenhos = new double [quantPesquisas];
        for (int k = 0; k < quantPesquisas; k++) {
            System.out.println("Quantos quilômetros (km) "
                    + "você percorreu desde o abastecimento?");
            int kmPercorridos = Integer.parseInt(leitor.nextLine());
            System.out.println("Quantos litros de combustível gastou?");
            double litros = Double.parseDouble(leitor.nextLine());
            double desempenho = kmPercorridos / litros;
            arrayDesempenhos[k] = desempenho;
            if (desempenho < 11) {
                System.out.println("Seu carro está gastando "
                        + "muito combustível.");
            } else {
                System.out.println("Parabéns! Seu carro é econômico");
            }
        }

        if (arrayDesempenhos.length>0){

            double soma = 0.0;
            for (int k=0; k< arrayDesempenhos.length; k++){
                soma += arrayDesempenhos[k];
            }
            double mediaDesempenhos = soma/arrayDesempenhos.length;
            System.out.printf("A média dos desempenhos foi de %.2f km/l\n", mediaDesempenhos);

            double maior = arrayDesempenhos[0];
            for (int k=1; k< arrayDesempenhos.length; k++){
                if (arrayDesempenhos[k]> maior){
                    maior = arrayDesempenhos[k];
                }
            }
            System.out.printf("O maior desempenho foi de %.3f km/l\n", maior);


        }




        leitor.close();
    }
}