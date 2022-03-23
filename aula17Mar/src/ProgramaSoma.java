import java.util.Scanner;

public class ProgramaSoma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String strA = leitor.nextLine();
        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(leitor.nextLine());
        int x = a + b;
        System.out.println("X = " + x);
        leitor.close();
    }
}
