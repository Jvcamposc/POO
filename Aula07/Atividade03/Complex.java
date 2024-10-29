/*Crie uma classe chamada Complex para realizar aritmética com números complexos. Os números complexos têm a forma: parteReal + parteImaginaria * i

onde i é raiz quadrada de -1

Escreva um programa para testar sua classe. Utilize variáveis de ponto flutuantes para representar os dados private da classe. Forneça um construtor que permita um objeto dessa classe seja inicializado quando ele for declarado. Forneça um construtor sem argumento com valores-padrão caso nenhum inicializador seja fornecido. Forneça métodos public que realizam as seguintes operações:

a) Somar dois números Complex: as partes reais somadas de um lado e as partes imaginárias são somadas de outro.
b) Subtrair dois números Complex: A parte real do operando direito é subtraida da parte real do operando esquerdo e a parte imaginaria do operando direito é subtraida da parte imaginaria do operendo esquerdo.
c) Imprimir números Complex na forma (a,b), onde a é a parte real e b a parte imaginaria.*/
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
