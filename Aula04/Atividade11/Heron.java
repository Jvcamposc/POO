/*Um método para o cálculo de raiz quadradas de um número N já era conhecido pelos babilônios em... bom, há muito tempo (também é conhecido como Método de Heron, um matemático grego que o descreveu 20 séculos depois, perto do ano 50 DC). Começando com um valor inicial k (geralmente valendo 1), os babilônios geravam um novo valor de k de acordo com a regra: A medida em que o processo é repetido, os novos valores de k se aproximam cada vez mais da raiz de N. Faça um programa que leia o valor de N e exiba os primeiros doze valores calculados com essa fórmula, verificando se eles realmente se aproximaram da raiz correta. */
package Aula04.Atividade11;

import java.util.Scanner;

public class Heron {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Método de Heron ---");
        System.out.print("Insira o valor que deseja calcular: ");
        int valorN = input.nextInt();

        double valorK = 1;

        System.out.println("--- Resultado ---");
        System.out.print("Os 12 primeiros valores com o método de Heron são: ");

        for (int i = 0; i < 12; i++) {
            valorK = (valorK + (valorN / valorK)) / 2;
            System.out.printf("%.2f ", valorK);
        }

        System.out.printf("\nLogo, a raiz de %d é igual a %.2f!\n", valorN, valorK);
        input.close(); // Fecha o scanner
    }
}
