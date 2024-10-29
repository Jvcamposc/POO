package Aula07.Atividade03;

public class Complex {
    // utilize variaveis de ponto flutuante para representar os dados private da
    // classe
    private double a;
    private double b;

    // forneca um construtor que permita que um objeto seja inicializado quando for
    // declarado
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // forneca um construtor sem argumentos com valores padrao caso nenhum
    // inicializador seja fornecido
    public Complex() {
        this.a = 0.0;
        this.b = 0.0;
    }

    // forneca um metodo para somar 2 numeros Complex
    public static Complex somar(Complex x, Complex y) {
        return new Complex(x.a + y.a, x.b + y.b);
    }

    // forneca um metodo para subtrair 2 numeros Complex
    public static Complex subtrair(Complex x, Complex y) {
        return new Complex(x.a - y.a, x.b - y.b);
    }

    // forneca um metodo para imprimir numeros Complex na forma (a,b)
    public String toString() {
    return "(" + a + ", " + b + ")";
    }
}
