package pacoteayla;

public class ProgramaMedia {

    public static void main(String [] args){
        System.out.println("Vamos calcular a média de 3 notas");
        double nota1 = 9.5;
        double nota2 = 8.5;
        double nota3 = 10.0;
        double media = (nota1+nota2+nota3)/3;
        System.out.println("A média das 3 notas é: "+media);
        System.out.printf("A média das 3 notas é %.1f\n", media);
    }

}
