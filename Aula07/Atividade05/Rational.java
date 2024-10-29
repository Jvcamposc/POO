/* Crie uma classe chamada Rational para realizar aritmética com frações. Escreva um programa
para testar sua classe. Use variáveis de inteiros para representar as variáveis de instância
private da classe — o numerator e o denominator. Forneça um construtor que permita que um
objeto dessa classe seja inicializado quando ele for declarado. O construtor deve armazenar a
fração em uma forma reduzida. A fração
é equivalente a 1/2 e seria armazenada no objeto como 1 no numerator e 2 no denominator.
Forneça um construtor sem argumento com valores padrão caso nenhum inicializador seja
fornecido. Forneça métodos public que realizam cada uma das operações a seguir:
parteReal + parteImaginaria ∗ i
i = −1
1/2
Programação Orientada a Objetos: Construtores, Enum e Static11
a) Somar dois números Rational: o resultado da adição deve ser armazenado na forma
reduzida. Implemente isso como um método static.
b) Subtrair dois números Rational: o resultado da subtração deve ser armazenado na forma
reduzida. Implemente isso como um método static.
c) Multiplicar dois números Rational: o resultado da multiplicação deve ser armazenado na
forma reduzida. Implemente isso como um método static.
d) Dividir dois números Rational: o resultado da divisão deve ser armazenado na forma
reduzida. Implemente isso como um método static.
e) Retorne uma representação String de um número Rational na forma a/b, onde a é o
numerator e b é o denominator.
f) Retorne uma representação String de um número Rational no formato de ponto flutuante. */
package Aula07.Atividade05;

public class Rational {
    private int numerator;   // Numerador
    private int denominator; // Denominador

    // Construtor com parâmetros
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
        // Reduz a fração
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

        // Se o denominador for negativo, invertemos o sinal
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    // Construtor sem argumentos (fração padrão 0/1)
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Método para calcular o máximo divisor comum
    private int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

    // Método estático para somar duas frações
    public static Rational add(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Método estático para subtrair duas frações
    public static Rational subtract(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Método estático para multiplicar duas frações
    public static Rational multiply(Rational r1, Rational r2) {
        int num = r1.numerator * r2.numerator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Método estático para dividir duas frações
    public static Rational divide(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        int num = r1.numerator * r2.denominator;
        int den = r1.denominator * r2.numerator;
        return new Rational(num, den);
    }

    // Representação da fração como string (a/b)
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Representação da fração como ponto flutuante
    public double toDouble() {
        return (double) numerator / denominator;
    }
}
