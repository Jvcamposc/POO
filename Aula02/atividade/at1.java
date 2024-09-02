/*Crie um aplicativo que mantém o saldo de uma conta bancária, realiza depósito e mostra o saldo da conta. Realize depósitos e apresente ao usuário seu saldo. (Dica: utilize o método nextDouble da classe Scanner.)*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class at1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;
        int opcao;
        boolean continuar = true;

        // Cria uma conta bancária com saldo inicial de 0.0
        ContaBanco conta = new ContaBanco(0.0);

        // Loop principal do aplicativo
        while (continuar) {
            // Exibe o menu de opções
            System.out.println("---Escolha uma opção---");
            System.out.println("1. Depositar");
            System.out.println("2. Mostrar Saldo");
            System.out.println("3. Sair");

            // Lê a opção do usuário
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do deposito: ");
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    conta.mostrarSaldo();
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}