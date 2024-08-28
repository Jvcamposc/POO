import java.util.Scanner;
import javax.swing.JOptionPane;

public class CachorroTest{

public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	String name;

	//System.out.println("Qual e o nome do seu cachorro? ");
	//name = input.nextLine();

	name = JOptionPane.showInputDialog(null, "Qual e o nome do seu cachorro? ");
	
	Cachorro zeca = new Cachorro(name);

	System.out.printf("O nome do seu cachorro e %s\n", zeca.getNome());
	zeca.latir();
	zeca.lamber();

	zeca.setNome("Belinha");
	zeca.latir();
	zeca.lamber();
   }
}