import java.util.Scanner;

public class ProgramaDescontoV2 {

    public static void main(String [] args){

        Produto p1  = new Produto();

        Produto p2= new Produto("Coca cola", 6.0);


        Produto p3 = new Produto("", 0.0);

        System.out.println("O nome do produto 1 é:"+ p1.getNome());
        System.out.println("O nome do produto 2 é:"+ p2.getNome());
        System.out.println("O nome do produto 3 é:"+ p3.getNome());

        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o nome do produto 1");
        String nomeP1 =  leitor.nextLine();
        p1.setNome(nomeP1);

        System.out.println("digite o nome do produto 3");
        String nomeP3 =  leitor.nextLine();
        p3.setNome(nomeP3);

        System.out.println("O nome do produto 1 é:"+ p1.getNome());
        System.out.println("O nome do produto 2 é:"+ p2.getNome());
        System.out.println("O nome do produto 3 é:"+ p3.getNome());

        System.out.println("Digite o nome do produto 4");
        String nomeP4 = leitor.nextLine();
        System.out.println("Digite o preço do produto 4");
        double precoP4 = Double.parseDouble(leitor.nextLine());
        Produto p4 = new Produto(nomeP4, precoP4);

        System.out.println("O nome do produto 4 é:"+ p4.getNome());


        leitor.close();
    }
}
