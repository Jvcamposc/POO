/*O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial
+ despesas – créditos), exibir o novo saldo e determinar se o novo saldo excede ao limite de
crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve
exibir a mensagem "Limite de crédito excedido
 */
package atividade_04;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldo = 3500, despensas = 0, creditos = 0, limite_credito = 5000;
        boolean continuar;

        System.out.println("Informe o saldo inicial do cliente:");
        saldo = scanner.nextInt();

        System.out.println("Informe o total de despesas do cliente:");
        despensas = scanner.nextInt();

        System.out.println("Informe o total de créditos do cliente:");
        creditos = scanner.nextInt();

        System.out.println("Informe o limite de crédito do cliente:");
        limite_credito = scanner.nextInt();

        int novo_saldo = saldo + creditos - despensas;

        if(novo_saldo < 0){
            System.out.println("Limite de credito excedido");
        }else{
            System.out.println("Seu novo saldo: " + novo_saldo);
        }
    }
}
