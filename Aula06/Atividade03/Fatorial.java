/*Implemente um método recursivo que calcule o fatorial de um número. Caso o número seja
negativo, o método deve lançar uma exceção personalizada chamada NegativeNumberException . 

EXECUTAR: javac NegativeNumberException.java Fatorial.java Main.java
*/
package Aula06.Atividade03;

public class Fatorial {
    public static int calcularFatorial(int numero) throws NegativeNumberException {
        if (numero < 0) {
            throw new NegativeNumberException("Número negativo não é permitido.");
        }
        if (numero == 0 || numero == 1) {
            return 1; // Fatorial de 0 e 1 é 1
        }
        return numero * calcularFatorial(numero - 1); // Chamada recursiva
    }
}
