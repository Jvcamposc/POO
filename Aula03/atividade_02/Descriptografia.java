package atividade_02;

import java.util.Scanner;

public class Descriptografia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lê o número criptografado de quatro dígitos do usuário
        System.out.print("Digite um número criptografado de quatro dígitos: ");
        int numeroCriptografado = input.nextInt();

        // Divide o número criptografado em seus dígitos
        int d1 = (numeroCriptografado / 1000) % 10;
        int d2 = (numeroCriptografado / 100) % 10;
        int d3 = (numeroCriptografado / 10) % 10;
        int d4 = numeroCriptografado % 10;
        // Troca os dígitos de volta à sua posição original
        int temp = d1;
        d1 = d3;
        d3 = temp;

        temp = d2;
        d2 = d4;
        d4 = temp;

        d1 = (d1 + 10 - 7) % 10;
        d2 = (d2 + 10 - 7) % 10;
        d3 = (d3 + 10 - 7) % 10;
        d4 = (d4 + 10 - 7) % 10;

        int numeroDescriptografado = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
        System.out.println("Número descriptografado: " + numeroDescriptografado);

        input.close();
    }
}
