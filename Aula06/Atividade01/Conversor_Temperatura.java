/* Escreva um programa que converte temperaturas de Celsius para Fahrenheit e vice-versa. Se o
usuário fornecer um valor que não seja numérico, o programa deve capturar a
exceção NumberFormatException e exibir uma mensagem de erro apropriada. */
package Aula06.Atividade01;

import java.util.Scanner;

public class Conversor_Temperatura{

    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para converter Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha a conversão:");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius");
        
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Digite a temperatura:");
        String entrada = scanner.nextLine();

        try {
            double temperatura = Double.parseDouble(entrada);

            switch (opcao) {
                case 1:
                    double fahrenheit = celsiusParaFahrenheit(temperatura);
                    System.out.printf("%.2f Celsius é igual a %.2f Fahrenheit%n", temperatura, fahrenheit);
                    break;
                case 2:
                    double celsius = fahrenheitParaCelsius(temperatura);
                    System.out.printf("%.2f Fahrenheit é igual a %.2f Celsius%n", temperatura, celsius);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada não numérica. Por favor, forneça um número válido.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
