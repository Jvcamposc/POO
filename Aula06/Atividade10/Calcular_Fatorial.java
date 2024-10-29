/*Crie um programa que calcula o fatorial de um número inteiro positivo. Use assert para garantir que o número fornecido seja não negativo. Lembrete Para ativar as assertions , você deve executar o programa com o argumento -ea (enable assertions): java -ea NomeDoPrograma */
package Aula06.Atividade10;

import java.util.Scanner;

public class Calcular_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Usando assertiva para garantir que o número seja não negativo
        assert numero >= 0 : "O número deve ser não negativo.";

        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
