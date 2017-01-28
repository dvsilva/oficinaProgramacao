package cap3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Janela2 extends JFrame {
	
	private JPanel contentPane;
	
	private JLabel rotulo1;
	private JLabel rotulo2;
	private JLabel rotulo3;

	public Janela2() {
		super("Exemplo 2 de Janela");
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
	}
}