package Aula05.Atividade05;
public class Tabuleiro{
private static void Tabuleiro(char[][] tabuleiro) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            tabuleiro[i][j] = ' '; // Inicializa com espaços em branco
        }
    }
}

private static void imprimirTabuleiro(char[][] tabuleiro) {
    System.out.println("Tabuleiro:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(tabuleiro[i][j]);
            if (j < 2) System.out.print(" | ");
        }
        System.out.println();
        if (i < 2) System.out.println("---------");
    }
}

private static boolean verificaVitoria(char[][] tabuleiro, char jogador) {
    // Verifica linhas e colunas
    for (int i = 0; i < 3; i++) {
        if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
            (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
            return true;
        }
    }
    // Verifica diagonais
    return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
           (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
}

private static boolean tabuleiroCheio(char[][] tabuleiro) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[i][j] == ' ') {
                return false; // Ainda há espaços disponíveis
            }
        }
    }
    return true; // Tabuleiro cheio
}
}
