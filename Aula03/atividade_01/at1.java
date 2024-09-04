package atividade_01;

import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int viagem, contador = 1;
        int total_quilometros = 0, total_litros = 0;

        System.out.println("Digite quantas viagem foram realizadas: ");
        viagem = scanner.nextInt();

        while (contador <= viagem) {
            System.out.println("\nViagem " + contador + ":");

            System.out.println("Digite quantos quilometros foi percorrido: ");
            int quilometros = scanner.nextInt();

            System.out.println("Digite quantos litros de gasolina foi consumidos: ");
            int litros = scanner.nextInt();

            double consumo = quilometros / litros;

            total_quilometros += quilometros;
            total_litros += litros;

            contador++;
        }
        //
        System.out.println("-----Resultado final: ----");
        System.out.printf("Quilometragem total %d km\n", total_quilometros);
        System.out.printf("Total de litros consumidos: %d\n", total_litros);

        double consumo_total = total_quilometros / total_litros;

        System.out.printf("Consumo medio total: %.2f km/l\n", consumo_total);
        
    }
}
