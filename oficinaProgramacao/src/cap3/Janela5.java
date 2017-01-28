package cap3;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Janela5 extends JFrame {
	
	private JPanel contentPane;
	
	private JLabel rotulo1;
	private JLabel rotulo2;
	private JLabel rotulo3;
	private JLabel rotulo4;
	private JLabel rotulo5;
	
	private JTextField campo1;
	
	private JRadioButton opcao1;
	private JRadioButton opcao2;
	
	private ButtonGroup grupo;
	
	private JButton botao1;

	public Janela5() {
		super("Exemplo 5 de Janela");
		setBounds(200, 100, 300, 230);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		getContentPane().setLayout(null);
		
		rotulo1 = new JLabel("CADASTRO DE ANIMAIS");
		rotulo1.setBounds(80, 20, 150, 20);
		add(rotulo1);
		
		rotulo2 = new JLabel("Nome do animal:");
		rotulo2.setBounds(20, 60, 150, 20);
		add(rotulo2);
		
		rotulo3 = new JLabel("Espécie:");
		rotulo3.setBounds(20, 90, 150, 20);
		add(rotulo3);
		
		campo1 = new JTextField();
		campo1.setBounds(120, 60, 150, 20);
		campo1.setToolTipText("Digite o nome do animal aqui");
		add(campo1);
		
		opcao1 = new JRadioButton("Canina", true);
		opcao1.setBounds(120, 90, 15, 20);
		add(opcao1);
		
		opcao2 = new JRadioButton("Felina", false);
		opcao2.setBounds(120, 110, 15, 20);
		add(opcao2);
		
		grupo = new ButtonGroup();
		grupo.add(opcao1);
		grupo.add(opcao2);
		
		rotulo4 = new JLabel("Canina");
		rotulo4.setBounds(140, 90, 150, 20);
		add(rotulo4);
		
		rotulo5 = new JLabel("Felina");
		rotulo5.setBounds(140, 110, 150, 20);
		add(rotulo5);
		
		botao1 = new JButton("Cadastrar Animal");
		botao1.setBounds(75, 150, 150, 20);
		add(botao1);
	}
}