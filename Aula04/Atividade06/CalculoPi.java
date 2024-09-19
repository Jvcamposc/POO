/*Calcule o valor de a partir de uma série infinita Imprima uma tabela que mostre o valor aproximado de Pi calculando os 200.000 primeiros termos dessa série.
Quantos termos você tem de utilizar antes de primeiro obter um valor que começa com 3,14159?
 */
package Aula04.Atividade06;

public class CalculoPi {
    public static void main(String[] args) {
        double pi = 0.0;
        int termosUsados = 0;
        double alvo = 3.14159;

        System.out.printf("Termo \t Aproximação\n");

        // Calcula Pi com uma série diferente
        for (int i = 0; i < 200000; i++) {
            pi += (i % 2 == 0 ? 4.0 : -4.0) / (2 * i + 1);
            if (i % 5000 == 0) {
                System.out.printf("%d \t %.5f\n", i, pi);
            }
            if (Math.abs(pi - alvo) < 0.00001) {
                termosUsados = i;
                break;
            }
        }

        System.out.println("--- Resultado ---");
        System.out.printf("O valor de Pi (%.5f) foi encontrado em %d termos!\n", alvo, termosUsados);
    }
}
