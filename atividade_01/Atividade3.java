import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
	
	float a, b, c;
	double delta, x1, x2;
	
	System.out.println("Digite o valor a: ");
	a = scanner.nextFloat();

	System.out.println("Digite o valor b: ");
	b = scanner.nextFloat();

	System.out.println("Digite o valor c: ");
	c = scanner.nextFloat();
	
	delta = (b * b) + (-4 * (a * c));
	System.out.println("Valor de delta e: " + delta);
	
	x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
        x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
	
	System.out.println("As raizes da equação são:");
	System.out.println("x' = " + x1);
        System.out.println("x'' = " + x2);
      }
}