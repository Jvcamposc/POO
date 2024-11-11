/* Suponha que você esteja desenvolvendo um sistema de gerenciamento de animais em um
zoológico. Você foi designado para criar a estrutura de classes que representará diferentes
tipos de animais e suas características. Cada animal terá atributos específicos, como nome,
idade, e método para produzir som.
Definição de Classes:
Crie uma classe abstrata Animal que terá os seguintes atributos protegidos:
nome String) - o nome do animal.
idade (int) - a idade do animal.
Defina um construtor na classe Animal para inicializar esses atributos.
Defina um método emitirSom() na classe Animal que será abstrato e deverá ser
implementado pelas subclasses.
Crie uma classe Mamifero que estende Animal e tem um atributo adicional protegido corPelo
String) e um construtor para inicializar esse atributo.
Crie uma classe Ave que estende Animal e tem um atributo adicional protegido tamanhoAsa
(double) e um construtor para inicializar esse atributo.
Implementação de Interfaces:
Defina uma interface Nadador que contenha um método nadando() .
Defina uma interface Voador que contenha um método voando() .
Implementação de Subclasses:
Crie classes concretas que implementem as interfaces e herdem das classes abstratas
conforme necessário, como Elefante , Tigre , Pinguim , Aguia , etc.
Sobrescreva o método emitirSom() em cada uma das subclasses para produzir o som
característico do animal.
Teste do Sistema:
Na classe principal do programa, crie instâncias de diferentes tipos de animais e teste os
métodos definidos */
public class Zoologico {

    public static void main(String[] args) {
        // Criando instâncias de animais
        Animal elefante = new Elefante("Elefante", 10, "Cinza");
        Animal tigre = new Tigre("Tigre", 5, "Laranja com listras");
        Animal pinguim = new Pinguim("Pinguim", 3, 0.8);
        Animal aguia = new Aguia("Águia", 7, 1.5);

        // Testando o método emitirSom
        System.out.println(elefante.nome + " (" + elefante.idade + " anos):");
        elefante.emitirSom();

        System.out.println(tigre.nome + " (" + tigre.idade + " anos):");
        tigre.emitirSom();

        System.out.println(pinguim.nome + " (" + pinguim.idade + " anos):");
        pinguim.emitirSom();

        System.out.println(aguia.nome + " (" + aguia.idade + " anos):");
        aguia.emitirSom();

        // Testando os métodos das interfaces
        if (pinguim instanceof Nadador) {
            ((Nadador) pinguim).nadando();
        }

        if (aguia instanceof Voador) {
            ((Voador) aguia).voando();
        }
    }
}
