/*Escreva um tipo enum TrafficLight, cuja constante (RED, GREEN, YELLOW) aceite um
parâmetro — a duração da luz. Escreva um programa para testar o enum TrafficLight de modo
que ele exiba a constante enum e suas durações */
package Aula07.Atividade01;

public enum TrafficLight {
    RED(30), GREEN(60), YELLOW(5);

    private final int duration;

TrafficLight(int duration){
    this.duration = duration;
}

    public int getDuration() {
        return duration;
    }
}