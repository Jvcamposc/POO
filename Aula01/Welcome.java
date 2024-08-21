import java.util.Scanner;

public class Welcome{
	public static void main(String[] args)
{
	int num1, num2, soma;

	Scanner entrada = new Scanner(System.in);
	System.out.println("Entre com um numero: ");	
	num1 = entrada.nextInt();

	System.out.print("Entre com outro numero: ");	
	num2 = entrada.nextInt();

	soma = num1 + num2;
	System.out.printf("A soma de %d + %d = %d", num1, num2, soma);
}

}
