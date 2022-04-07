public class BonsDesempenhos {
    public static void main(String[] args) {
        double[] desempenhos = { 10, 11, 12, 9 };
        System.out.println("Quantidade de bons desempenhos:"+ contaBonsDesempenhos(desempenhos));
    }

    // Declaração do método "contaBonsDesempenhos"
    public static int contaBonsDesempenhos(double [] valores){
        int cont = 0;
        for (int k=0; k< valores.length; k++){
            if (valores[k]>=11){
                cont++;
            }
        }
        return cont;
    }
}