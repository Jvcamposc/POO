import java.awt.Graphics; //classe para desenhar
import javax.swing.JPanel; //Criar um painel

public class DrawPanel extends JPanel//Criar painel
{
	public void paint(Graphics g)
	{
	super.paintComponent(g);
//medir a largura e a altura
	int width = getWidth();//largura
	int height = getHeight();//altura
//desenham 2 linhas que se cruzam
	g.drawLine(0,0 ,width,height);
	g.drawLine(0, height,width,0);
	}

}

