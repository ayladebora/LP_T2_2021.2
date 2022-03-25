public class TesteMetodos {
    public static void main(String[] args) {
        System.out.println("Quantidade de pares é:");
        int[] numeros = { 4, 6, 7, 12 };
        System.out.println(contaPares(numeros));
    }

    public static int contaPares(int[] numeros) {
        int cont = 0;
        for (int k = 0; k < numeros.length; k++) {
            if (numeros[k] % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }
}
