/*Seu aplicativo deve ler um inteiro de quatro dígitos
inserido pelo usuário e criptografá-lo da seguinte maneira: substitua cada dígito pelo resultado
da adição de 7 ao dígito, obtendo o restante depois da divisão do novo valor por 10. Troque
então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então, imprima o inteiro
criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro
dígitos criptografados e o descriptografe (revertendo o esquema de criptografia) para formar o
número original. [Projeto de leitura opcional: pesquise a “criptografia de chave pública em
geral e o esquema de chave pública específica PGP (Pretty Good Privacy). Você também pode
querer investigar o esquema RSA, que é amplamente usado em aplicativos robustos
industriais.
 */
package atividade_02;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de quatro dígitos: ");
        int numero = scanner.nextInt();

        // Divide o número em seus dígitos
        int d1 = (numero / 1000) % 10;
        int d2 = (numero / 100) % 10;
        int d3 = (numero / 10) % 10;
        int d4 = numero % 10;

        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        // Troca os dígitos conforme descrito
        int temp = d1;
        d1 = d3;
        d3 = temp;

        temp = d2;
        d2 = d4;
        d4 = temp;

        int numeroCriptografado = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
        System.out.println("Número criptografado: " + numeroCriptografado);

        scanner.close();
    }
}
