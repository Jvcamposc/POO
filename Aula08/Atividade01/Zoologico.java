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
