
/*Dada uma coleção de dados = [-12, -2, 4, 8, 29, 45, 78, 36, -17, 2, 12, 8, 3, 3,-52] faça um
programa que:
a) imprima o maior elemento;
b) imprima o menor elemento;
c) imprima os números pares;
d) imprima o número de ocorrências do primeiro elemento da lista;
e) imprima a média dos elementos;
f) imprima a soma dos elementos de valor negativo. */
package Aula05.Atividade01;

public class Organizador {
    public static void main(String[] args) {
        int[] dados = { 12, -2, -4, 8, 29, 45, 78, -17, 2, 12, 8, 3, 3, -52 };

        // imprima o maior elemento
        int maiorElemento = dados[0];
        boolean numerosPares = false;
        int menorElemento = dados[0];
        int primeiroNumero = dados[0];
        int contadorPrimeiro = 0;
        int soma = 0;
        int somaNegativos = 0;

        //a) imprima o maior elemento;
        for (int i = 0; i < dados.length; i++) {
            // Verifica o maior elemento
            if (dados[i] > maiorElemento) {
                maiorElemento = dados[i];
            }

            // b) imprima o menor elemento;
            if (dados[i] < menorElemento) {
                menorElemento = dados[i];
            }
            //c)imprima os números pares;
            if (dados[i] % 2 == 0) {
                System.out.print(dados[i] + " ");
            }
            // d) imprima o número de ocorrências do primeiro elemento da lista;
            if (dados[i] == primeiroNumero) {
                contadorPrimeiro++;
            }
            soma += dados[i];

            // imprima a soma dos elementos de valor negativo
            if (dados[i] < 0) {
                somaNegativos += dados[i];
            }
        }

        double media = (double) soma / dados.length;

        System.out.printf("\nA média dos números é: %.2f%n", media);
        System.out.println("O primeiro elemento é: " + primeiroNumero);
        System.out.println("Os numeros pares são: " + numerosPares);
        System.out.println("O menor elemento é: " + menorElemento);
        System.out.println("O maior elemento é: " + maiorElemento);
        System.out.println("Número de ocorrências do primeiro elemento: " + contadorPrimeiro);
        System.out.println("Soma dos elementos negativos: " + somaNegativos);
    }
}
