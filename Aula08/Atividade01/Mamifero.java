// Classe Mamifero que herda de Animal
abstract class Mamifero extends Animal {
    protected String corPelo;

    // Construtor que inicializa o nome, idade e cor do pelo
    public Mamifero(String nome, int idade, String corPelo) {
        super(nome, idade); 

        this.corPelo = corPelo;
    }
}
