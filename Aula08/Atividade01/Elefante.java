// Classe Elefante que herda de Mamifero
public class Elefante extends Mamifero {

    public Elefante(String nome, int idade, String corPelo) {
        super(nome, idade, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("O elefante faz o som: FUM UHH!\n");
    }
}
