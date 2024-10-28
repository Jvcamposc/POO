/* Implemente uma classe de exceção personalizada chamada InvalidAgeException . Em um
programa principal, crie um método que solicite a idade de uma pessoa e jogue essa exceção
se a idade for inferior a 18

PARA COMPILAÇÃO: javac InvalidAgeException.java Cliente.java CadastroCliente.java
*/
package Aula06.Atividade02;

public class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) throws InvalidAgeException {
        if (idade <= 0 || idade < 18) {
            throw new InvalidAgeException("A idade deve ser maior que 18 anos.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

