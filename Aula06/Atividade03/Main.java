/*Implemente um método recursivo que calcule o fatorial de um número. Caso o número seja
negativo, o método deve lançar uma exceção personalizada chamada NegativeNumberException . 

EXECUTAR: javac NegativeNumberException.java Fatorial.java Main.java
*/
package Aula06.Atividade03;

public class Main {
    public static void main(String[] args) {
        try {
            int numero = 5; // Altere este valor para testar
            int resultado = Fatorial.calcularFatorial(numero);
            System.out.printf("Fatorial de %d é %d%n", numero, resultado);
        } catch (NegativeNumberException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
