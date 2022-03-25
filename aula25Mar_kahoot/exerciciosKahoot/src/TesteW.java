public class TesteW {
    public static void main(String[] args) {
        int w = 0;
        int[] numeros = { 4, 7, 11 };
        int cont = 0;
        while (cont < numeros.length) {
            if (numeros[cont] > 5) {
                break;
            } else {
                w++;
            }
            cont++;
        }
        System.out.println(w);
    }
}
