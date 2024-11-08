public class Aguia extends Ave implements Voador {

    public Aguia(String nome, int idade, double tamanhoAsa) {
        super(nome, idade, tamanhoAsa);
    }
    @Override
    public void emitirSom() {
        System.out.println("A águia faz o som: Croac Cuaa!");
    }

    // Implementação do método voando da interface Voador
    @Override
    public void voando() {
        System.out.println("A águia está voando.");
    }
}
