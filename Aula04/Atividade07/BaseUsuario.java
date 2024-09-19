/*De acordo com o CNNMoney.com, o Facebook alcançou um bilhão de usuários em outubro de 2012. Supondo que a base de usuários cresça a uma taxa de 4% ao mês, quantos meses levarão para que o Facebook aumente sua base de usuários para 1,5 bilhão? Quantos meses serão necessários para que o Facebook expanda sua base de usuários para dois bilhões?
 */
package Aula04.Atividade07;

public class BaseUsuario {
    public static void main(String[] args) {
        double usuariosIniciais = 1000000000; // 1 bilhão
        double taxa = 0.04; // 4%
        int meses = 0;

        // Calcular meses para 1,5 bilhões
        double Objetivo1 = 1500000000;
        double usuarios = usuariosIniciais;
        
        while (usuarios < Objetivo1) {
            usuarios += usuarios * taxa;
            meses++;
        }  
        System.out.println("Falta: " + meses + " meses para alcançar 1,5 bilhões");

        // Calcular meses para 2 bilhões
        double Objetivo2 = 2_000_000_000;
        usuarios = usuariosIniciais; // Reinicia a contagem de usuários
        int mesesFinal = 0;

        while (usuarios < Objetivo2) {
            usuarios += usuarios * taxa;// Aumenta o número de usuários
            mesesFinal++  ;      
        }
        System.out.println("Falta: " + mesesFinal + " meses para alcançar 2 bilhões");
    }
}
