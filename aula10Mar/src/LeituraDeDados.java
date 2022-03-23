import javax.swing.JOptionPane;

/**
 * Classe responsável pela leitura de dados com JOptionPane e formatação de
 * valores
 * 
 */
public class LeituraDeDados {

    /**
     * Método principal e que é responsável por ler dados do usuário e mostrar
     * mensagens formatadas.
     * 
     * @param args Argumentos do programa, mas que estão sendo ignorados.
     */
    public static void main(String[] args) {
        System.out.println("Oi");
        String nome = JOptionPane.showInputDialog("Digite seu nome");

        System.out.println("Oi " + nome);
        JOptionPane.showMessageDialog(null, "Oi " + nome);

        String idadeString = JOptionPane.showInputDialog("Digite sua idade");

        int idade = Integer.parseInt(idadeString);
        JOptionPane.showMessageDialog(null, "Que idade ótima essa dos " + idade +
                " anos");

        String notaString = JOptionPane.showInputDialog("Digite sua nota");

        double nota = Double.parseDouble(notaString);
        // JOptionPane.showMessageDialog(null, "A sua nota foi " + nota);

        String texto = String.format("A sua nota foi %.1f\nQue legal %s", nota, nome);
        JOptionPane.showMessageDialog(null, texto);

        System.out.printf("A sua nota foi %.1f\nQue legal %s. Você tem %d mesmo?\n", nota, nome, idade);

    }

}