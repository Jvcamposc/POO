/* Escreva um programa que solicite três números ao usuário e utilize assert para garantir que os
números estejam em ordem crescente */
package Aula06.Atividade09;

import java.util.Scanner;

public class Numeros_Crescentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita três números ao usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Usando assertivas para garantir que os números estão em ordem crescente
        assert num1 <= num2 && num2 <= num3 : "Os números devem estar em ordem crescente.";

        System.out.println("Os números estão em ordem crescente: " + num1 + ", " + num2 + ", " + num3);

        scanner.close();
    }
}
