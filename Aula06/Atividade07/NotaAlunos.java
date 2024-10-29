/*Crie um programa que receba as notas de um aluno e use assert para garantir que as notas
estejam entre 0 e 10 */
package Aula06.Atividade07;

import java.util.Scanner;

public class NotaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array para armazenar as notas
        double[] notas = new double[3]; // Supondo que o aluno tenha 3 notas

        // Loop para receber as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + " (entre 0 e 10): ");
            notas[i] = scanner.nextDouble();

            // Usando assertiva para verificar se a nota está no intervalo
            assert notas[i] >= 0 && notas[i] <= 10 : "A nota deve estar entre 0 e 10.";
        }

        // Se todas as notas forem válidas, exibe as notas
        System.out.println("Notas cadastradas:");
        for (double nota : notas) {
            System.out.println(nota);
        }

        scanner.close();
    }
}