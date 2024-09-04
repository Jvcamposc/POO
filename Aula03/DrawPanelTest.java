import javax.swing.JFrame; // ajudar a colocar nosso desenho em uma "janela" na tela do computador.

public class DrawPanelTest
{
public static void main(String[] args){
	DrawPanel panel = new DrawPanel();

	JFrame aplicacao = new JFrame();
	aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //faz com que a janela feche quando clicamos no "X".
	aplicacao.setSize(200,200); //tamanho da tela
	aplicacao.add(panel); // adicionar o painel
	aplicacao.setVisible(true); //Mostrar o desenho 
}
}