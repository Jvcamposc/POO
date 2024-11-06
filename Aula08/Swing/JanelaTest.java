import javax.swing.JFrame;

public class JanelaTest{
    public static void main(String[]args){
        Janela login = new Janela("Login");
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(310,600); //Tamanho da tela
        login.setVisible(true); //Deixar a tele visível 
    }
}