/* Implemente uma classe de exceção personalizada chamada InvalidAgeException . Em um
programa principal, crie um método que solicite a idade de uma pessoa e jogue essa exceção
se a idade for inferior a 18

PARA COMPILAÇÃO: javac InvalidAgeException.java Cliente.java CadastroCliente.java
*/
package Aula06.Atividade02;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

