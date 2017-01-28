package cap3;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Janela7 extends JFrame {
	
	private JPanel contentPane;
	
	private JLabel rotulo1;
	private JLabel rotulo2;
	private JLabel rotulo3;
	private JLabel rotulo4;
	private JLabel rotulo5;
	
	private JCheckBox opcao1;
	private JCheckBox opcao2;
	private JCheckBox opcao3;
	
	private JComboBox lista1;
	
	private static final String[] fontes = { "Arial", "Arial Black", "Comic Sans MS", "Courier New", "Tahoma", "Verdana" };

	public Janela7() {
		super("Exemplo 7 de Janela");
		setBounds(300, 200, 310, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		getContentPane().setLayout(null);
		
		rotulo1 = new JLabel("FORMATAÇÃO DO TEXTO");
		rotulo1.setBounds(75, 20, 150, 20);
		add(rotulo1);
		
		opcao1 = new JCheckBox();
		opcao1.setBounds(20, 60, 20, 20);
		add(opcao1);
		
		rotulo2 = new JLabel("Negrito");
		rotulo2.setBounds(40, 60, 150, 20);
		add(rotulo2);
		
		opcao2 = new JCheckBox();
		opcao2.setBounds(100, 60, 20, 20);
		add(opcao2);
		
		rotulo3 = new JLabel("Itálico");
		rotulo3.setBounds(120, 60, 150, 20);
		add(rotulo3);
		
		opcao3 = new JCheckBox();
		opcao3.setBounds(180, 60, 20, 20);
		add(opcao3);
		
		rotulo4 = new JLabel("Sublinhado");
		rotulo4.setBounds(200, 60, 150, 20);
		add(rotulo4);
		
		rotulo5 = new JLabel("Tipo de Fonte:");
		rotulo5.setBounds(20, 90, 150, 20);
		add(rotulo5);
		
		lista1 = new JComboBox(fontes);
		lista1.setMaximumRowCount(6);
		lista1.setBounds(110, 90, 150, 20);
		add(lista1);
	}
}