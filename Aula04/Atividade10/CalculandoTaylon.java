//Faça um programa que calcule o valor aproximado de cos(x) pela série de Taylor, dado pela aproximação abaixo:
package Aula04.Atividade10;

import java.util.Scanner;

public class CalculandoTaylon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite x (graus): ");
        double graus = input.nextDouble();

        // Converter graus para radianos
        double radianos = Math.toRadians(graus);

        System.out.print("Digite o número de termos: ");
        int termos = input.nextInt();

        double resultado = 1; // Inicia a soma com o primeiro termo
        int sinal = -1; // Para alternar entre + e -

        // Calcular a série de Taylor
        for (int i = 1; i <= termos; i++) {
            double termo = Math.pow(radianos, 2 * i) / fatorial(2 * i);
            resultado += sinal * termo; 
            sinal *= -1; // Troca o sinal
        }

        System.out.printf("A aproximação de cos(%.1f) é: %.4f%n", graus, resultado);
        
        input.close(); 
    }

    // Método para calcular o fatorial
    public static double fatorial(int num) {
        double fatorial = 1;
        for (int i = 2; i <= num; i++) {
            fatorial *= i; // Multiplica para calcular o fatorial
        }
        return fatorial;
    }
}
