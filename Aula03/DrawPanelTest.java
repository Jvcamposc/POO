import javax.swing.JFrame;

public class DrawPanelTest
{
public static void main(String[] args){
	DrawPanel panel = new DrawPanel();

	JFrame aplicacao = new JFrame();
	aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que a tela fecha apos apertar o X
	aplicacao.setSize(200,200); //tamanho da tela
	aplicacao.add(panel); // adicionar o painel
	aplicacao.setVisible(true); 
}
}