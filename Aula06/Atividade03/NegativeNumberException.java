/*Implemente um método recursivo que calcule o fatorial de um número. Caso o número seja
negativo, o método deve lançar uma exceção personalizada chamada NegativeNumberException . 

EXECUTAR: javac NegativeNumberException.java Fatorial.java Main.java
*/
package Aula06.Atividade03;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message); // Chama o construtor da classe pai (Exception)
    }
}
