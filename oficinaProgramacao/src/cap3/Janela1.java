package cap3;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Janela1 extends JFrame {
	
	private JPanel contentPane;

	public Janela1() {
		super("Exemplo 1 de Janela");
		setBounds(100, 50, 270, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		getContentPane().setLayout(null);
	}
}