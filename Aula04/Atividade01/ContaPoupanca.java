/*Uma pessoa investe US$ 1.000 em uma conta-poupança que rende juros de 5% ao ano. Supondo que todo o juro
seja aplicado, calcule e imprima a quantia de dinheiro na conta no fim de cada ano por 10 anos. Utilize a
seguinte fórmula para determinar as quantidades:

a = p(1 + r)n

-p é a quantia original investida (isto é, o principal)
-r é a taxa de juros anual (por exemplo, utilize 0,05 para 5%)
-n é o número de anos
-a é a quantia em depósito no fim do n-ésimo ano.
*/
package Aula04.Atividade01;

import java.util.Scanner;

public class ContaPoupanca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double poupanca = 1000, juros = 0.05;
        int n = 10;

        for (int ano = 1; ano <= 10; ano++) {
            double a = poupanca * Math.pow(1 + juros, ano); //a = p(1 + r)n
            System.out.printf("Ano: %d | Total na conta é: $%.2f%n", ano, a);
        }
    }
}
