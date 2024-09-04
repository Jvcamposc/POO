import java.awt.Graphics; //classe para desenhar
import javax.swing.JPanel; //Criar um painel

public class DrawPanel extends JPanel
{
	public void paint(Graphics g)
	{
	super.paintComponent(g);

	int width = getWidth();//largura
	int height = getHeight();//altura

	g.drawLine(0,0 ,width,height);
	g.drawLine(0, height,width,0);
	}

}

