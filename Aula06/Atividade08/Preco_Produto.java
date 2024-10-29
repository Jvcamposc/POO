/*Crie um programa para verificar se o preço de um produto é válido (maior que zero).
Utilize assert para garantir que o preço nunca seja negativo ou zero */
package Aula06.Atividade08;

import java.util.Scanner;

public class Preco_Produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        // Usando assertiva para verificar se o preço é válido
        assert preco > 0 : "O preço deve ser maior que zero.";

        System.out.println("O preço do produto é: R$ " + preco);

        scanner.close();
    }
}
