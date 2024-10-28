/*Crie um programa para cadastrar produtos em uma loja. O programa deve garantir que o preço
do produto seja positivo, lançando uma exceção personalizada
chamada PrecoInvalidoException se o preço inserido for negativo ou zero. */
package Aula06.Atividade05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("\nCadastrar um novo produto:");
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: R$ ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer do scanner

            try {
                Produto produto = new Produto(nome, preco);
                produtos.add(produto);
                System.out.println("Produto cadastrado com sucesso!");
            } catch (PrecoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.print("Deseja cadastrar outro produto? (s/n): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\nProdutos cadastrados:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        scanner.close();
    }
}
