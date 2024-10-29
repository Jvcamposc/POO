/*(Números complexos) Crie uma classe chamada Complex para realizar aritmética com números complexos. Os números complexos têm a forma: parteReal + parteImaginaria * i

onde i é raiz quadrada de -1

Escreva um programa para testar sua classe. Utilize variáveis de ponto flutuantes para representar os dados private da classe. Forneça um construtor que permita um objeto dessa classe seja inicializado quando ele for declarado. Forneça um construtor sem argumento com valores-padrão caso nenhum inicializador seja fornecido. Forneça métodos public que realizam as seguintes operações:

a) Somar dois números Complex: as partes reais somadas de um lado e as partes imaginárias são somadas de outro.
b) Subtrair dois números Complex: A parte real do operando direito é subtraida da parte real do operando esquerdo e a parte imaginaria do operando direito é subtraida da parte imaginaria do operendo esquerdo.
c) Imprimir números Complex na forma (a,b), onde a é a parte real e b a parte imaginaria. */
package Aula07.Atividade03;

class ComplexTest {
    public static void main(String[] args) {
        Complex abc = new Complex(4.5, 6.7);
        Complex def = new Complex(7.8, -9.1);
        Complex zero = new Complex();

        System.out.println(abc); // imprime o número (4.5, 6.7)
        System.out.println(def); // imprime o número (7.8, -9.1)
        System.out.println(Complex.somar(abc, def)); // imprime a soma, que é (12.3, -2.4)
        System.out.println(Complex.subtrair(abc, def)); // imprime a subtração, que é (-3.3, 15.8)
    }
}
