// Classe Tigre que herda de Mamifero
public class Tigre extends Mamifero {

    public Tigre(String nome, int idade, String corPelo) {
        super(nome, idade, corPelo);
    }

    // Sobrescreve o método de emitir som
    @Override
    public void emitirSom() {
        System.out.println("O tigre faz o som: Roar!\n");
    }
}
