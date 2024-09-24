package Aula05.Atividade04;

import java.util.Scanner;

public class ControleCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] lugaresVagos = {10, 2, 1, 3, 0};
        
        while (true) {
            System.out.println("Digite o número da sala (1 a 5) ou 0 para sair:");
            int sala = scanner.nextInt();
            
            // Saída do programa
            if (sala == 0) {
                System.out.println("Saindo do programa.");
                break;
            }
            
            // Verifica se o número da sala está dentro do intervalo
            if (sala < 1 || sala > 5) {
                System.out.println("Número da sala inválido. Tente novamente.");
                continue;
            }
            
            System.out.println("Digite a quantidade de lugares solicitados:");
            int lugaresSolicitados = scanner.nextInt();
        
            if (lugaresSolicitados <= lugaresVagos[sala - 1]) {
                lugaresVagos[sala - 1] -= lugaresSolicitados; // Atualiza o número de lugares vagos
                System.out.println("Venda realizada com sucesso! Lugares restantes na sala " + sala + ": " + lugaresVagos[sala - 1]);
            } else {
                System.out.println("Não há lugares suficientes na sala " + sala + ". Lugares disponíveis: " + lugaresVagos[sala - 1]);
            }
        }
        scanner.close();
    }
}

