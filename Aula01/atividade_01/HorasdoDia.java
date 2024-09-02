import java.util.Scanner;
public class HorasdoDia {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

	int dias, horas, minutos, totalSegundos, segundos;
	
        System.out.print("Digite a quantidade de segundos: ");
        totalSegundos = scanner.nextInt();

        dias = totalSegundos / 86400; 
        horas = totalSegundos / 3600; //horas = segundos
        minutos = totalSegundos  / 60; 
        segundos = totalSegundos % 60; 

        System.out.println("Resultado:");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");

        scanner.close();
	}
}