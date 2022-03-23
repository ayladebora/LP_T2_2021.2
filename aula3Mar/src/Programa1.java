public class Programa1 {

    public static void imprimaMensagemBoasVindas() {
        System.out.println("==================");
        System.out.println("====BEM-VINDO(A)==");
        System.out.println("==================");

    }

    public static double calculaMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        return media;
    }

    public static void main(String[] args) {
        System.out.println("oi");
        System.out.println("turma");
        imprimaMensagemBoasVindas();
        System.out.println(Programa1.calculaMedia(4.0, 5.0, 6.0));
        imprimaMensagemBoasVindas();
    }

}