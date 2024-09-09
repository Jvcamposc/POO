/*
O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
n!= (n * (n – 1)* (n – 2)* …  * 1 (para valores de n maiores ou iguais a 1) e
n! = 1 (para n = 0)
Por exemplo, 5! = 5 * 4 * 3 * 2 * 1, o que dá 120.
Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.
*/
package atividade_06;

import java.util.Scanner;

public class Atividade06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Calcular Fatorial ---");
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int i = numero;
        int resultado = 1;
        //Continua enquanto i for maior que 0
        while (i > 0) {
            resultado *= i; // multiplica resultado pelo valor i
            if (i == 1) {  //verifica se i e igual a 1, Se for imprime apenas o numero,sem o "*"
                System.out.printf("%d ", i);
            } else {
                System.out.printf("%d * ", i);
            }
            i--; 
        }

        System.out.printf("= %d", resultado);
    }
}