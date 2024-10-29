/*Crie um programa que solicite ao usuário um número entre 1 e 100. Use uma assertiva para
verificar se o número está dentro do intervalo. Caso contrário, o programa deve lançar um erro. */
package Aula06.Atividade06;

public class NumeroInvalidoException extends Exception {
    public NumeroInvalidoException(String message) {
        super(message);
    }
}
