/* Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que
insere cinco números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o
somente se ele não tiver uma duplicata de um número já lido. Cuide de tratar o “pior casoˮ, em
que todos os cinco números são diferentes. Utilize o menor array possível para resolver esse
problema. Exiba o conjunto completo de valores únicos inseridos depois que o usuário inserir
cada valor novo */
package Aula05.Atividade02;
import java.util.Scanner;
public class ValoresUnicos {
    private static final ValoresUnicos Verificacao = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Insira 5 números entre (10 - 100):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 100) {
                if (!existeNoArray(numeros, i, numero)) {
                    numeros[i] = numero;
                } else {
                    System.out.println("Opção invalida!!");
                    i--; 
                }
            } else {
                System.out.println("Opção invalida!! ");
                i--;
            }
        }

        numeros = obterNumerosUnicos(numeros);

        System.out.println("Numeros escolhidos:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static boolean existeNoArray(int[] array, int tamanho, int numero) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == numero) {
                return true; 
            }
        }
        return false;
    }

    public static int[] obterNumerosUnicos(int[] numeros) {
        int[] numerosUnicos = new int[numeros.length];
        int count = 0;

        // Verificar duplicatas e armazenar apenas números únicos
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0 && !existeNoArray(numerosUnicos, count, numeros[i])) {
                numerosUnicos[count] = numeros[i];
                count++;
            }
        }

        // Retornar apenas os elementos únicos no array
        int[] resultado = new int[count];
        System.arraycopy(numerosUnicos, 0, resultado, 0, count);
        return resultado;
    }
}

