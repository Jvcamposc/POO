/*Escreva um jogo da velha para dois jogadores. O jogo deve perguntar onde você quer jogar e
alternar entre os jogadores. A cada jogada, verifique se a posição está livre. Verifique também
quando um jogador venceu a partida. Um jogo da velha pode ser visto como um array de 3
elementos, na qual cada elemento é outro array também com três elementos */
package Aula05.Atividade05;
import java.util.Scanner;
public class JogodaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        imprimirTabuleiro(tabuleiro);
        char jogadorAtual = 'X';
        
        while (true) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", escolha a linha (0-2) e a coluna (0-2): ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            // Verifica se a posição é válida
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição inválida. Tente novamente.");
                continue;
            }

            // Verifica se a posição já está ocupada
            if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Essa posição já está ocupada. Tente novamente.");
                continue;
            }

            // Marca a posição com o símbolo do jogador atual
            tabuleiro[linha][coluna] = jogadorAtual;

            // Verifica se o jogador atual venceu
            if (verificaVitoria(tabuleiro, jogadorAtual)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                break;
            }

            // Verifica se o tabuleiro está cheio (empate)
            if (tabuleiroCheio(tabuleiro)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Empate!");
                break;
            }

            // Alterna o jogador
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    private static boolean tabuleiroCheio(char[][] tabuleiro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tabuleiroCheio'");
    }

    private static void imprimirTabuleiro(char[][] tabuleiro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirTabuleiro'");
    }

    private static boolean verificaVitoria(char[][] tabuleiro, char jogadorAtual) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificaVitoria'");
    }
}
