/*Refaça os exercícios da seção anterior que utiliza a classe Scanner com a classe JOptionPane. (Dica: utilize o método static parseInt da classe Integer para converter String para Int). */
package atividade02;

import javax.swing.JOptionPane;

public class at2 {
    public static void main(String[] args) {
        double valor;
        int opcao;
        boolean continuar = true;

        ContaBanco2 conta = new ContaBanco2(0.0);

        while (continuar) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Seja Bem-vindo ao Banco! Qual operação deseja realizar?\n" +
                    "1 - Depositar\n2 - Consultar Saldo\n3 - Sair"));

            switch (opcao) {
                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "---- Depositar ----\nDigite o valor do depósito:"));
                    conta.depositar(valor);
                    JOptionPane.showMessageDialog(null, "Depósito de R$ " + valor + " realizado com sucesso!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + conta.getSaldo());
                    break;
                case 3:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}

