/* Implemente a hierarquia Shape mostrada na Figura deste material. Cada TwoDimensionalShape
deve conter o método getArea para calcular a área da forma bidimensional. Cada
ThreeDimensionalShape deve ter métodos getArea e
getVolume para calcular a área do volume e superfície, respectivamente, da forma
tridimensional. Crie um programa que utiliza um array de referências Shape para objetos de
cada classe concreta na hierarquia. O programa deve imprimir uma descrição de texto do
objeto ao qual cada elemento no array se refere. Além disso, no loop que processa todas as
formas no array, determine se cada forma é uma
TwoDimensionalShape ou uma ThreeDimensionalShape . Se for uma TwoDimensionalShape , exiba sua área.
Se for uma
ThreeDimensionalShape , exiba sua área e volume.
 */
package Aula08.Atividade02;

public class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDescription() {
        return "Círculo com raio " + radius;
    }
}

