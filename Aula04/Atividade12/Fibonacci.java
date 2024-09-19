/*A série de Fibonacci é 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... Os dois primeiros termos são iguais a 1, e a partir do
terceiro, o termo é dado pela soma dos dois termos anteriores. Dado um número n≥ 3, exiba o n-ésimo termo da
série de Fibonacci. (Não use recursivo.) */
package Aula04.Atividade12;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, insira um número maior ou igual a 3. ");
        int n = input.nextInt();

        if (n < 3) {
            System.out.println("Por favor, insira um número maior ou igual a 3.");
            return;
        }

        int num1 = 1, num2 = 1, resultado = 1;

        for (int i = 3; i <= n; i++) {
            resultado = num1 + num2; 
            num1 = num2; 
            num2 = resultado; 
        }

        System.out.printf("O %dº da série de Fibonacci é: %d\n", n, resultado);
        input.close(); 
    }
}
