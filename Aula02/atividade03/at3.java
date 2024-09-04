/*Modifique a classe Chamada com: Inclua uma variável de instância String que representa o nome do professor do curso; Forneça os métodos set e get para alterar e recuperar o nome do professor, respectivamente; Modifique o construtor para especificar dois parâmetros; Modifique o método chamada para gerar a saída de mensagem para o nome do curso e nome do professor. */
package atividade03;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Chamada minhaChamada = new Chamada("Programação Orientada a Objeto", "João Victor");
        
        System.out.println("Nome do curso inicial: " + minhaChamada.getNomeCurso());
        System.out.println("Nome do professor inicial: " + minhaChamada.getNomeProfessor());
        System.out.println("\n--Se deseja cadastrar outra materia preenche--");
        System.out.print("Coloque o nome do curso: ");
        String curso = input.nextLine();
        
        System.out.print("Coloque o nome do professor: ");
        String professor = input.nextLine();
        
        minhaChamada.setNomeCurso(curso);
        minhaChamada.setNomeProfessor(professor);
        
        minhaChamada.exibirMensagem();
        
        input.close(); 
    }
}


