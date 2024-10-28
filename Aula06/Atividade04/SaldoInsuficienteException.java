/*Crie um programa para simular um sistema bancário que permite ao usuário realizar saques e
depósitos. Se o usuário tentar sacar mais do que o saldo disponível, uma exceção
chamada SaldoInsuficienteException deve ser lançada */
package Aula06.Atividade04;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}