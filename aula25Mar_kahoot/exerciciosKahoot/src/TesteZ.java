public class TesteZ {
    public static void main(String[] args) {
        int z = 0;
        String[] nomes = { "Ana", "João" };
        for (int k = 0; k < nomes.length; k++) {
            if (nomes[k].length() > 3) {
                z++;
            }
        }
        System.out.println(z);
    }
}
