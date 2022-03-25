public class TesteD {
    public static void main(String[] args) {
        int d = 0;
        int[] numeros = { 3, 7, 10 };
        for (int k = 0; k < numeros.length; k++) {
            if (numeros[k] % 2 != 0) {
                d++;
            } else {
                continue;
            }
            d += 10;
        }
        System.out.println(d);
    }
}
