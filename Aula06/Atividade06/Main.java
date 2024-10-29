/*Crie um programa que solicite ao usuário um número entre 1 e 100. Use uma assertiva para
verificar se o número está dentro do intervalo. Caso contrário, o programa deve lançar um erro. */
package Aula06.Atividade06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número entre 1 e 100: ");
        int numero = scanner.nextInt();

        try {
            verificarNumero(numero);
            System.out.println("Você digitou o número: " + numero);
        } catch (NumeroInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }

    public static void verificarNumero(int numero) throws NumeroInvalidoException {
        if (numero < 1 || numero > 100) {
            throw new NumeroInvalidoException("O número deve estar entre 1 e 100.");
        }
    }
}
