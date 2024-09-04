/*Refaça os exercícios da seção anterior que utiliza a classe Scanner com a classe JOptionPane. (Dica: utilize o método static parseInt da classe Integer para converter String para Int). */
package atividade02;
import javax.swing.JOptionPane;

class ContaBanco2 {
    private double saldo;
    public ContaBanco2(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    // realizar um depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            JOptionPane.showMessageDialog(null, "O valor do depósito deve ser positivo.");
        }
    }
    // Método para obter o saldo atual
    public double getSaldo() { //get: retorna o valor atual do saldo da conta.
        return saldo;
    }
}