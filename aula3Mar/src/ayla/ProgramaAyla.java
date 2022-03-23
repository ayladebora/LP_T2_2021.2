package ayla;

import pacoteutil.Util;

public class ProgramaAyla {

    public static void main(String[] args) {
        System.out.println("Oi");

        Util.imprimaMensagemBoasVindas();
        double numero1 = 6.0;
        double numero2 = 7.0;
        double numero3 = 8.0;
        double minhaMedia = Util.calculaMediaAritmetica(numero1, numero2, numero3);
        System.out.println("A média é:");
        System.out.println(minhaMedia);
        String nome = "Ayla Débora Dantas";
        System.out.println("Oi " + nome);
        Util.imprimaMensagemBoasVindas();

    }

}
