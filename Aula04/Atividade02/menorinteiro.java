/*Escreva um aplicativo que localiza o menor de vários números inteiros. Suponha que o primeiro valor lido
especifica o número de valores a serem inseridos pelo usuário. */
package Aula04.Atividade02;
import java.util.Scanner;
public class menorinteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador, numero = 0;
        
        System.out.println("Digite a quantidade de numero a ser digitados: ");
        numero = scanner.nextInt();

            if(numero <= 0){
                System.out.println("Quantidade invalida! Deve ser maior que zero.");
                return;
            }

        System.out.printf("Quantidade de numero a digitar: %d\n", numero);

        for(contador = 1; contador <= numero; contador++){
            System.out.printf("\nDigite o %dº numero: ", contador);
            numero = scanner.nextInt();
        }
        int menor = numero;
        if (numero < menor) {
            menor = numero;
        }
        System.out.printf("O menor numero digitado foi: %d", menor);
    }
}
