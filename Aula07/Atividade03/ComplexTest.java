package Aula07.Atividade03;

public class ComplexTest {
    public static void main(String[] args) {
        Complex abc = new Complex(4.5, 6.7);
        Complex def = new Complex(7.8, -9.1);
        Complex zero = new Complex();
        System.out.println(abc); // imprime o numero (4.5, 6.7)
        System.out.println(def); // imprime o numero (7.8, -9.1)
        System.out.println(Complex.somar(abc, def)); // imprime a soma, que eh (12.3, -2.4)
        System.out.println(Complex.subtrair(abc, def)); // imprime a soma, que eh (-3.3, 15.8)
    }
}
