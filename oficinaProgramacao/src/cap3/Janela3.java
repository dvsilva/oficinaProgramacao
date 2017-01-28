package cap3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Janela3 extends JFrame {
	
	private JPanel contentPane;
	
	private JLabel rotulo1;
	private JLabel rotulo2;
	private JLabel rotulo3;
	
	private JTextField campo1;
	private JPasswordField campo2;

	public Janela3() {
		super("Exemplo 3 de Janela");
		setBounds(100, 50, 270, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		getContentPane().setLayout(null);
		
		rotulo1 = new JLabel("LOGIN NO SISTEMA");
		rotulo1.setBounds(80, 20, 120, 20);
		add(rotulo1);
		
		rotulo2 = new JLabel("Usuário:");
		rotulo2.setBounds(20, 60, 100, 20);
		add(rotulo2);
		
		rotulo3 = new JLabel("Senha:");
		rotulo3.setBounds(20, 90, 100, 20);
		add(rotulo3);
		
		campo1 = new JTextField();
		campo1.setBounds(80, 60, 150, 20);
		campo1.setToolTipText("Digite aqui o seu usuário");
		add(campo1);
		
		campo2 = new JPasswordField();
		campo2.setBounds(80, 90, 100, 20);
		campo2.setToolTipText("Digite aqui sua senha");
		add(campo2);
	}
}