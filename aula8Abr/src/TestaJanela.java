import javax.swing.JFrame;
import javax.swing.JButton;

public class TestaJanela {

    public static void main(String [] args){
        JFrame janela = new JFrame();
        janela.setTitle("Meu primeiro programa OO");
        janela.setLocation(0,0);
        janela.setSize(400, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton botao = new JButton("Meu botão");
        botao.setToolTipText("Botão de teste");
        janela.add(botao);
        janela.setVisible(true);
    }

}
