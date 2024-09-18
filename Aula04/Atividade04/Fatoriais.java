/*Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n (escrito como n! e pronunciado como “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais de 1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular. Que
dificuldade poderia impedir você de calcular o fatorial de 100? */
package Aula04.Atividade04;

public class Fatoriais {
    public static void main(String[] args) {
        System.out.println("Número | Fatorial");
        System.out.println("-------------------");

        //loop para calcular de 1 ate 20
        for (int i = 1; i <= 20; i++) {
            long fatorial = 1; //iniciar fatorial com 1

            for (int j = 1; j <= i; j++) {
                fatorial *= j;//Ele começa com j igual a 1 e vai até i. Isso significa que ele vai multiplicar todos os números de 1 até i. fazendo isso 20 vezes
            }
            System.out.println(i + "      | " + fatorial);
        }
    }
}
