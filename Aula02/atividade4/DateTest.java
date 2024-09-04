package atividade4;

import java.util.Scanner;
public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        at4 minhaData = new at4(9, 3, 2024);

        // Exibe a data inicial
        System.out.println("Data inicial:");
        minhaData.displayDate();

        System.out.print("Digite o mês (1-12): ");
        int mes = input.nextInt();
        System.out.print("Digite o dia (1-31): ");
        int dia = input.nextInt();
        System.out.print("Digite o ano: ");
        int ano = input.nextInt();
    
        minhaData.setMes(mes);
        minhaData.setDia(dia);
        minhaData.setAno(ano);
    
        System.out.println("Data atualizada:");
        minhaData.displayDate();
        
        input.close(); 
    }
}
