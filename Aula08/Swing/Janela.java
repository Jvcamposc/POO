import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;


public class Janela extends JFrame{
    private final JTextField userField;//Login
    private final JPasswordField passwordField;//Senha
    private final JLabel userLabel; //titulo pro campo
    private final JLabel passwordLabel;
    private final JButton entrarButton;//criar botão
    private final JButton cadastrarButton;//criar botão
    private final JCheckBox checkBox;
    private final JRadioButton profRadioButton;
    private final JRadioButton estRadioButton;
    private final JComboBox comboBox;
    private final JLabel iconLabel;


    public Janela(String titulo){
        super(titulo);

        setLayout(new FlowLayout());
                            //("Nome da fonte", Formato, Tamanho)
        Font fonte = new Font("Dialog", Font.PLAIN, 22);// mudando o tipo da fonte 

        userLabel = new JLabel("Usuario: ");
        userLabel.setFont(fonte);
        passwordLabel = new JLabel("Senha: ");
        passwordLabel.setFont(fonte);

        userField = new JTextField("usuario", 10);
        passwordField = new JPasswordField("senha", 10);

        //Criar botão
        entrarButton = new JButton("Acessar");
        cadastrarButton = new JButton("Cadastrar");

        checkBox = new JCheckBox("Lembrar-me");

        profRadioButton = new JRadioButton("Docente", false);
        profRadioButton.setFont(fonte);

        estRadioButton = new JRadioButton("Dicente", false);
        estRadioButton.setFont(fonte);

        ButtonGroup bg = new ButtonGroup();
        bg.add(profRadioButton);
        bg.add(estRadioButton);

        String[] curso = {"Engenharia de Software", "Sistema de Informação", "Análise de Dsenvolvimento de Software", "Ciência da Computação", "Gestão da Tecnologia da Informação"};
        comboBox = new JComboBox<String>(curso);
        comboBox.setMaximumRowCount(3);

        ImageIcon icon = new ImageIcon(getClass().getResource("docente.png"));
        Image img = icon.getImage().getScaledInstance(256, 256, Image.SCALE_SMOOTH);

        iconLabel = new JLabel(new ImageIcon(img));

        add(iconLabel);
        add(userLabel);
        add(userField); //adicionar o JTextField na tela 
        add(passwordLabel);
        add(passwordField);//adicionar o JPasswordField na tela
        add(entrarButton);
        add(cadastrarButton);
        add(profRadioButton);
        add(estRadioButton);
        add(checkBox);
        add(comboBox);
    }
}