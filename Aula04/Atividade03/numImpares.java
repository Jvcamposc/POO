/*Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15. */
package Aula04.Atividade03;
public class numImpares {
    public static void main(String[] args) {
        int numero = 1;

        for(int i = 1; i <= 15; i++){
            if(i % 2 != 0){
                numero *= i;
                System.out.println("Os numeros impares sao: " + i);
            }
        }
        System.out.println("O produto dos numeros inteiros impares de 1 a 15 e:" + numero);
    }
}
