/*2.	Escreva um aplicativo que insere um número consistindo em cinco dígitos do usuário, separa o número em seus
dígitos individuais e imprime os dígitos separados uns dos outros por três espaços cada. Por exemplo, se o
usuário digitar o número 42339, o programa deve imprimir:
4 2 3 3 9.
 */
import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

	int[] digitos = new int[5];
	int i;

	for(i = 0; i < 5; i++){
	System.out.println("Por favor, digite o " + (i + 1) + "º número: ");
	digitos[i] = scanner.nextInt();
	}
			
	System.out.println("O numero que voce digitou foi: ");
	for (i = 0; i < 5; i++){
	System.out.print(" " + digitos[i]);
	}
     }
}
