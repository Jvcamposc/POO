// Classe Ave que herda de Animal
public abstract class Ave extends Animal {
    protected double tamanhoAsa;

    // Construtor que inicializa o nome, idade e tamanho da asa
    public Ave(String nome, int idade, double tamanhoAsa) {
        super(nome, idade);  // Chama o construtor da classe Animal
        this.tamanhoAsa = tamanhoAsa;
    }
}
