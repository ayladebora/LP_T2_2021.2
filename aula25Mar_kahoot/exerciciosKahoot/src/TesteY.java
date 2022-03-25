public class TesteY {
    public static void main(String[] args) {
        int y = 0;
        String[] nomes = { "Ana", "João" };
        for (int k = 0; k < 2; k++) {
            if (nomes[k].startsWith("B")) {
                y++;
            }
        }
        System.out.println(y);
    }
}