/* Faça um programa que leia uma expressão com parênteses. Usando pilhas, verifique se os
parênteses foram abertos e fechados na ordem correta.
Exemplo:
(()) OK
()()(()()) OK
( ) ) Erro
Você pode adicionar elementos à pilha sempre que encontrar abre parênteses e desempilhá-la
a cada fecha parênteses. Ao desempilhar, verifique se o topo da pilha é um abre parênteses. Se
a expressão estiver correta, sua pilha estará vazia no final. */
package Aula05.Atividade03;
import java.util.Scanner;
public class VerificarParenteses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a expressão com parênteses:");
        String expressao = scanner.nextLine();
        
        if (verificaParenteses(expressao)) {
            System.out.println("OK");
        } else {
            System.out.println("Erro");
        }
        
        scanner.close();
    }

    public static boolean verificaParenteses(String expressao) {
        int contador = 0;
        
        for (char ch : expressao.toCharArray()) {
            if (ch == '(') {
                contador++; 
            } else if (ch == ')') {
                contador--; 
            
                if (contador < 0) {
                    return false;
                }
            }
        }

        return contador == 0;
    }
}
