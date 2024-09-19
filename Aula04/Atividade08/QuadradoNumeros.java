/*O quadrado de um número natural n é dado pela soma dos n primeiros números ímpares consecutivos. Por
exemplo: 1 =2 1, 2 =2 1 + 3, 3 =2 1 + 3 + 5.
Dado um número n, calcule seu quadrado usando a soma de ímpares ao invés de produto*/
package Aula04.Atividade08;

import java.util.Scanner;

public class QuadradoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma= 0;
        System.out.println("Digite o numero que deseja saber o quadrado: ");
        int numero = scanner.nextInt();
        
        for(int i = 0; i < numero; i ++){
            soma = soma + 2 * i + 1;
        }
        System.out.printf("O quadrado de %d e: %d!", numero , soma);
    }
}
