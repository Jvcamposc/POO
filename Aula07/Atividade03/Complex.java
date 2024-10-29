package Aula07.Atividade03;

public class Complex {
    // Utilize variáveis de ponto flutuante para representar os dados private da classe
    private double a; // Parte real
    private double b; // Parte imaginária

    // Forneça um construtor que permita que um objeto seja inicializado quando for declarado
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Forneça um construtor sem argumentos com valores padrão
    public Complex() {
        this.a = 0.0;
        this.b = 0.0;
    }

    // Forneça um método para somar 2 números Complex
    public static Complex somar(Complex x, Complex y) {
        return new Complex(x.a + y.a, x.b + y.b);
    }

    // Forneça um método para subtrair 2 números Complex
    public static Complex subtrair(Complex x, Complex y) {
        return new Complex(x.a - y.a, x.b - y.b);
    }

    // Forneça um método para imprimir números Complex na forma (a,b)
    @Override
    public String toString() {
        return "(" + a + ", " + b + ")";
    }
}
