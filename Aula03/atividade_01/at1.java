/* Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista
monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível
em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como
entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros) para
cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada
viagem e imprimir a quilometragem total e a soma total de litros de combustível consumidos até
esse ponto para todas as viagens. Todos os cálculos de média devem produzir resultados de
ponto flutuante. Utilize classe Scanner e repetição controlada por seleção para obter os dados
do usuário.
*/
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
