/*Crie um programa para cadastrar produtos em uma loja. O programa deve garantir que o preço
do produto seja positivo, lançando uma exceção personalizada
chamada PrecoInvalidoException se o preço inserido for negativo ou zero. */
package Aula06.Atividade05;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("O preço do produto deve ser positivo.");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s, Preço: R$ %.2f", nome, preco);
    }
}
