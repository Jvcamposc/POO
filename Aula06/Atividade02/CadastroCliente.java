/* Implemente uma classe de exceção personalizada chamada InvalidAgeException . Em um
programa principal, crie um método que solicite a idade de uma pessoa e jogue essa exceção
se a idade for inferior a 18 */
package Aula06.Atividade02;

public class CadastroCliente {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("João", 21); // Deve lançar a exceção
            System.out.printf("Cliente: %s | Idade: %d%n", cliente.getNome(), cliente.getIdade());
        } catch (InvalidAgeException e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }
}

