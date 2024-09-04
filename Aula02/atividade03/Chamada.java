package atividade03;

public class Chamada {
    private String nomeCurso;
    private String nomeProfessor;

    public Chamada(String nomeCurso, String nomeProfessor) {
        this.nomeCurso = nomeCurso;
        this.nomeProfessor = nomeProfessor;
    }
    
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void exibirMensagem() {
        System.out.println("Curso: " + nomeCurso + ", Professor: " + nomeProfessor);
    }
}
