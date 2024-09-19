/*Faça um aplicativo que verifique se o número digitado n é um número primo. Lembrando que todo número
primeiro é divisível apenas por 1 ou por ele mesmo. */
package Aula04.Atividade13;
import java.util.Scanner;
public class numPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println(n + " não é primo.");
            input.close();
            return;
        }

        boolean Primo = true; 
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                Primo = false; 
                break; 
            }
        }
        // Resultado
        if (Primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }

        input.close();
    }
}
