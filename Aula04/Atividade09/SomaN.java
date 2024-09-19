/* Faça um programa que leia um valor N qualquer, inteiro e positivo, calcule e mostre a seguinte soma:E=1+2!1+3!1+…+N!1:*/
package Aula04.Atividade09;

import java.util.Scanner;

public class SomaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro e positivo (N): ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            int soma = 0;
            System.out.print("Soma dos números: ");

            for (int i = 1; i <= N; i++) {
                soma = soma + i;
                System.out.print(i);
                if (i < N) {
                    System.out.print(" + ");
                }
            }
            System.out.println("\nA soma é: " + soma);
        }
        scanner.close();
    }
}