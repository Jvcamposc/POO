//Faça um programa que calcule o valor aproximado de cos(x) pela série de Taylor, dado pela aproximação abaixo:
package Aula04.Atividade10;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class CalculandoTaylon {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com x para cos(x): "));
    
        JOptionPane.showMessageDialog(null, "cos(" + x + ") = " + Trigonometria.cos(x));
    }
}

class Trigonometria {

    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i; 
        }
        return fat;
    }

    public static double cos(double x) {
        double cosseno = 0;
        x = Math.toRadians(x); 
        for (int i = 0; i < 10; i++) {
            int termo = 2 * i; 
            cosseno += Math.pow(-1, i) * Math.pow(x, termo) / fatorial(termo);
        }
        return cosseno;
    }
}
