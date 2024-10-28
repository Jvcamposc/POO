/*Faça um aplicativo que contenha duas classes DiarioNotas e DiarioNotasTest. Na primeira
classe, é necessário armazenar o nome do curso e as notas do aluno. Crie métodos para
verificar a maior e menor nota do estudante, a média delas e um gráfico de barras ( ”*” ). Na
classe DiarioNotasTest, você vai atribuir as notas para o objeto da classe DiarioNotas e
apresentar um relatório das notas, a maior nota, a menor nota e a distribuição num gráfico de
barras ( ”*” ) */
package Aula05.Atividade07;

import java.util.ArrayList;
import java.util.List;

public class DiarioNotas {
    private String nomeCurso;
    private List<Double> notas;

    public DiarioNotas(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double maiorNota() {
        return notas.stream().max(Double::compareTo).orElse(0.0);
    }

    public double menorNota() {
        return notas.stream().min(Double::compareTo).orElse(0.0);
    }

    public double mediaNotas() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public void graficoBarras() {
        System.out.println("Distribuição das Notas:");
        for (Double nota : notas) {
            int quantidadeAsteriscos = (int) (nota * 10); // Ajusta a escala para 1-10
            System.out.print(nota + ": ");
            for (int i = 0; i < quantidadeAsteriscos; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
}
