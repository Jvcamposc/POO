/*Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras. Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido, seu programa deve exibir o mesmo número de asteriscos adjacentes. Por exemplo, se seu programa lê o número 7, ele deve exibir *******. Exiba as barras dos asteriscos depois de ler os cinco números. */
package Aula04.Atividade05;

import java.util.Scanner;

public class GraficoBarras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            int numero;
            System.out.println("Digite um numero de (1 - 30): ");
            numero = scanner.nextInt();
            if (numero < 1 || numero > 30) {
                System.out.printf("Numero invalido! \nDigite um numero de (1 - 30): \n");
                numero = scanner.nextInt();
            }
            while (numero < 1 || numero > 30);
            numeros[i] = numero;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + ": ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
