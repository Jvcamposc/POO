/*Crie um programa para cadastrar produtos em uma loja. O programa deve garantir que o preço
do produto seja positivo, lançando uma exceção personalizada
chamada PrecoInvalidoException se o preço inserido for negativo ou zero. */
package Aula06.Atividade05;

public class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException(String message) {
        super(message);
    }
}
