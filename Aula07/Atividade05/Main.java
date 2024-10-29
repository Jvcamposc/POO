/*Crie uma classe chamada Rational para realizar aritmética com frações. Escreva um programa
para testar sua classe. Use variáveis de inteiros para representar as variáveis de instância
private da classe — o numerator e o denominator. Forneça um construtor que permita que um
objeto dessa classe seja inicializado quando ele for declarado. O construtor deve armazenar a
fração em uma forma reduzida. A fração
é equivalente a 1/2 e seria armazenada no objeto como 1 no numerator e 2 no denominator.
Forneça um construtor sem argumento com valores padrão caso nenhum inicializador seja
fornecido. Forneça métodos public que realizam cada uma das operações a seguir:
parteReal + parteImaginaria ∗ i
i = −1
1/2
Programação Orientada a Objetos: Construtores, Enum e Static11a Somar dois números Rational: o resultado da adição deve ser armazenado na forma
reduzida. Implemente isso como um método static.
b Subtrair dois números Rational: o resultado da subtração deve ser armazenado na forma
reduzida. Implemente isso como um método static.
c Multiplicar dois números Rational: o resultado da multiplicação deve ser armazenado na
forma reduzida. Implemente isso como um método static.
d Dividir dois números Rational: o resultado da divisão deve ser armazenado na forma
reduzida. Implemente isso como um método static.
e Retorne uma representação String de um número Rational na forma a/b, onde a é o
numerator e b é o denominator.
f Retorne uma representação String de um número Rational no formato de ponto flutuante */
package Aula07.Atividade05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Rational r1 = getRationalInput(scanner, 1);
        Rational r2 = getRationalInput(scanner, 2);

        // Operações
        Rational sum = Rational.add(r1, r2);
        Rational difference = Rational.subtract(r1, r2);
        Rational product = Rational.multiply(r1, r2);
        Rational quotient = Rational.divide(r1, r2);

        // Resultados
        displayResults(sum, difference, product, quotient);
        
        scanner.close();
    }

    private static Rational getRationalInput(Scanner scanner, int fractionNumber) {
        int numerator = getInput("Digite o numerador da fração " + fractionNumber + ": ", scanner);
        int denominator;
        do {
            denominator = getInput("Digite o denominador da fração " + fractionNumber + " (não pode ser zero): ", scanner);
            if (denominator == 0) {
                System.out.println("O denominador não pode ser zero. Tente novamente.");
            }
        } while (denominator == 0);
        return new Rational(numerator, denominator);
    }

    private static int getInput(String prompt, Scanner scanner) {
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            try {
                value = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Limpa o buffer
            }
        }
        return value;
    }

    private static void displayResults(Rational sum, Rational difference, Rational product, Rational quotient) {
        System.out.println("Soma: " + sum + " = " + sum.toDouble());
        System.out.println("Subtração: " + difference + " = " + difference.toDouble());
        System.out.println("Multiplicação: " + product + " = " + product.toDouble());
        System.out.println("Divisão: " + quotient + " = " + quotient.toDouble());
    }
}
