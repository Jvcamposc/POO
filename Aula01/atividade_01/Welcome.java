import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
	int n1, n2, soma, produto, diferenca, divisao;
	
	System.out.println("Por favor, Digite um numero: ");
	n1 = scanner.nextInt();

	System.out.println("Por favor, Digite outro numero: ");
	n2 = scanner.nextInt();
	
	System.out.println("------RESULTADO-----");

	soma = n1 + n2;
	System.out.println("O resultado da soma e: " + soma);

	produto = n1 * n2;
	System.out.println("Produto: " + produto); 

	diferenca = n1 - n2;
	System.out.println("Diferença: " + diferenca);

	divisao = n1 / n2;
	System.out.println("Divisão: " + divisao);
	
    }
}
