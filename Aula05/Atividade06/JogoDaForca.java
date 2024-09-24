/*Faça um jogo da Forca utilizando arraylist. Dada uma palavra, dê algumas chances para o
usuário acertar */
package Aula05.Atividade06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class JogoDaForca {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("java");
        palavras.add("programacao");
        palavras.add("desenvolvedor");
        palavras.add("computador");
        palavras.add("tecnologia");

        Random random = new Random();
        String palavraSecreta = palavras.get(random.nextInt(palavras.size()));
        ArrayList<Character> letrasAcertadas = new ArrayList<>();
        int tentativas = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Jogo da Forca!");

        while (tentativas > 0) {
            System.out.print("Palavra: ");
            mostrarPalavra(palavraSecreta, letrasAcertadas);
            System.out.println("\nTentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.nextLine().charAt(0);

            if (letrasAcertadas.contains(letra)) {
                System.out.println("Você já tentou essa letra.");
            } else if (palavraSecreta.indexOf(letra) >= 0) {
                letrasAcertadas.add(letra);
                System.out.println("Você acertou uma letra!");
            } else {
                tentativas--;
                System.out.println("Letra incorreta!");
            }

            if (palavraAcertada(palavraSecreta, letrasAcertadas)) {
                System.out.println("Parabéns! Você adivinhou a palavra: " + palavraSecreta);
                break;
            }
        }

        if (tentativas == 0) {
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
        }

        scanner.close();
    }

    private static void mostrarPalavra(String palavra, ArrayList<Character> letrasAcertadas) {
        for (char letra : palavra.toCharArray()) {
            if (letrasAcertadas.contains(letra)) {
                System.out.print(letra + " ");
            } else {
                System.out.print("_ ");
            }
        }
    }

    private static boolean palavraAcertada(String palavra, ArrayList<Character> letrasAcertadas) {
        for (char letra : palavra.toCharArray()) {
            if (!letrasAcertadas.contains(letra)) {
                return false;
            }
        }
        return true;
    }
}
