/*Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, exibe um quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis entre 1 e 20.
 */
package atividade_05;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho;
        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        tamanho = scanner.nextInt();

        if (tamanho < 1 || tamanho > 20) {
            System.out.println("Tamanho inválido. O valor deve estar entre 1 e 20.");
            scanner.close();
            return; 
        }

        int largura = 0;
        while (largura < tamanho) { //enquanto largura for menor que o tamanho do quadrado, continue construindo a linha
            int altura = 0;
            while (altura < tamanho) {
                if (largura == 0 || largura == tamanho - 1 || altura == 0 || altura == tamanho - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                altura++;
            }
            // Move para a próxima linha
            System.out.println();
            largura++;
        }

        scanner.close();
    }
}
 