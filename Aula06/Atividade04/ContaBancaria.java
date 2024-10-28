/*Crie um programa para simular um sistema bancário que permite ao usuário realizar saques e
depósitos. Se o usuário tentar sacar mais do que o saldo disponível, uma exceção
chamada SaldoInsuficienteException deve ser lançada */
package Aula06.Atividade04;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso. Saldo atual: R$ %.2f%n", valor, saldo);
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        } else if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso. Saldo atual: R$ %.2f%n", valor, saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
