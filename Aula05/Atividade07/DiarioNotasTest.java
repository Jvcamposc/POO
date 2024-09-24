package Aula05.Atividade07;

import java.util.Scanner;

public class DiarioNotasTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();

        DiarioNotas diario = new DiarioNotas(nomeCurso);

        System.out.print("Quantas notas você deseja inserir? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            diario.adicionarNota(nota);
        }

        System.out.println("\nRelatório de Notas do Curso: " + diario.getNomeCurso());
        System.out.println("Maior Nota: " + diario.maiorNota());
        System.out.println("Menor Nota: " + diario.menorNota());
        System.out.println("Média das Notas: " + diario.mediaNotas());
        diario.graficoBarras();

        scanner.close();
    }
}
