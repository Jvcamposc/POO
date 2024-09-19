package Aula04.Atividade13;
import java.util.Scanner;
public class numPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();

        // Números menores que 2 não são primos
        if (n < 2) {
            System.out.println(n + " não é primo.");
            input.close();
            return;
        }

        boolean isPrimo = true; // Vamos supor que n é primo

        // Verifica se n é divisível por qualquer número de 2 até n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrimo = false; // Encontrou um divisor
                break; // Não precisa continuar
            }
        }

        // Resultado
        if (isPrimo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }

        input.close();
    }
}
