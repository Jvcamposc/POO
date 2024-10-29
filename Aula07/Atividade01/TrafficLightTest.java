/*Escreva um tipo enum TrafficLight, cuja constante (RED, GREEN, YELLOW) aceite um
parâmetro — a duração da luz. Escreva um programa para testar o enum TrafficLight de modo
que ele exiba a constante enum e suas durações */
package Aula07.Atividade01;

public class TrafficLightTest {
    public static void main(String[] args) {
        for(TrafficLight light : TrafficLight.values()){
            System.out.println(light + ": " + light.getDuration() + "seconds");
        }
    }
}
