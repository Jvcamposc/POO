/*Atividade 4
Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
a) Número de conta.
b) Saldo no início do mês.
c) Total de todos os itens cobrados desse cliente no mês.
d) Total de créditos aplicados ao cliente no mês.
e) Limite de crédito autorizado
 */
package atividade_03;

import java.util.Scanner;

public class at3 {
    private static double limiteCredito;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        System.out.println("--- Seja Bem-vindo à Verificação de Limite de Crédito ---");

        while (continuar) {

            System.out.println("Digite o número da sua conta: ");
            int numero_Conta = scanner.nextInt();

            System.out.println("Digite o saldo no início do mês: ");
            double saldo_Inicial = scanner.nextDouble();

            System.out.println("Digite o total de créditos aplicados ao cliente no mês: ");
            double total_Credito = scanner.nextDouble();

            System.out.println("Digite o total de itens cobrados do cliente no mês: ");
            double total_Cobrado = scanner.nextDouble();

            System.out.println("Digite o limite de crédito autorizado: ");
            
            double limite_redito = scanner.nextDouble();
            double saldoFinal = saldo_Inicial + total_Credito - total_Cobrado;
            double creditoDisponivel = limiteCredito - saldoFinal;

            if (saldoFinal > limiteCredito) {
                double excesso = saldoFinal - limiteCredito;
                System.out.printf("O cliente com número da conta %d excedeu o limite de crédito.\n", numero_Conta);
                System.out.printf("Você excedeu o limite em: %.2f \n" , excesso);
            } else {
                System.out.printf("O cliente com número da conta %d está dentro do limite de crédito.\n", numero_Conta);
                System.out.printf("Crédito disponível: %.2f\n", creditoDisponivel);
            }

            System.out.print("Deseja verificar outro cliente? (sim/não): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("não")) {
                continuar = false;
            }
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}

