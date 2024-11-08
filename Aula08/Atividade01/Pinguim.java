// Classe Pinguim que herda de Ave e implementa Nadador
public class Pinguim extends Ave implements Nadador {

    public Pinguim(String nome, int idade, double tamanhoAsa) {
        super(nome, idade, tamanhoAsa);
    }
    //Som
    @Override
    public void emitirSom() {
        System.out.println("O pinguim faz o som: Qua qua!\n");
    }

    @Override
    public void nadando() {
        System.out.println("----Ação----");
        System.out.println("O pinguim está nadando.");
    }
}
