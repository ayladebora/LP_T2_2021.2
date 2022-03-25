public class TesteC {
    public static void main(String[] args) {
        int c = 0;
        String nome = "Ana Paula da Silva";
        String[] cadaNome = nome.split(" ");
        for (int k = 0; k < cadaNome.length; k++) {
            if (cadaNome[k].charAt(1) == 'a') {
                c++;
            }
        }
        System.out.println(c);
    }
}
