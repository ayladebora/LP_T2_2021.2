import java.util.Scanner;

public class TestaMenor {

    public static double descobreOMenor(double[] valores) {
        if (valores.length == 0) {
            return 0.0;
        } else {
            double menor = valores[0];
            for (int k = 1; k < valores.length; k++) {
                if (valores[k] < menor) {
                    menor = valores[k];
                }
            }
            return menor;
        }
    }

    public static void main(String[] args) {
        double[] array = { 34.6, 6.7, 5.7, 100.7 };
        System.out.println(descobreOMenor(array));

        double[] array2 = new double[4];
        array2[0] = 2.2;
        array2[1] = 3.5;
        array2[2] = 6.7;
        array2[3] = 1.1;
        System.out.println(descobreOMenor(array2));

        double[] array3 = {};
        System.out.println(descobreOMenor(array3));

        System.out.println("Digite valores reais separados por ;");
        Scanner leitor = new Scanner(System.in);
        String[] valoresStr = leitor.nextLine().split(";");
        double[] numeros = new double[valoresStr.length];
        for (int k = 0; k < numeros.length; k++) {
            numeros[k] = Double.parseDouble(valoresStr[k]);
        }
        System.out.println(descobreOMenor(numeros));

        double[] x = new double[20];
        System.out.println("O décimo quinto elemento:" + x[14]);
        
        System.out.println("Elemento índice 15:" + x[15]);
        System.out.println("último Elemento :" + x[x.length - 1]);
    }
}