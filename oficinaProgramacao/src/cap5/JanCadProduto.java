package cap5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class JanCadProduto extends JFrame {
	
	private JPanel contentPane;
	
	private JLabel rotulo1;
	private JLabel rotulo2;
	private JLabel rotulo3;
	private JLabel rotulo4;
	private JLabel rotulo5;
	
	private JTextField campo1;
	private JTextField campo2;
	private JTextField campo3;
	private JTextField campo4;
	
	private JButton botao1;

	public JanCadProduto() {
		super("Cadastro de Produto");
		setBounds(100, 50, 340, 260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		getContentPane().setLayout(null);
		
		rotulo1 = new JLabel("CADASTRAR PRODUTO");
		rotulo1.setBounds(100, 20, 200, 20);
		add(rotulo1);
		
		rotulo2 = new JLabel("Nome:");
		rotulo2.setBounds(20, 60, 100, 20);
		add(rotulo2);
		
		rotulo3 = new JLabel("Descrição:");
		rotulo3.setBounds(20, 90, 100, 20);
		add(rotulo3);
		
		rotulo4 = new JLabel("Quantidade:");
		rotulo4.setBounds(20, 120, 100, 20);
		add(rotulo4);
		
		rotulo5 = new JLabel("Quantidade:");
		rotulo5.setBounds(20, 120, 100, 20);
		add(rotulo5);
		
		rotulo5 = new JLabel("Preço:");
		rotulo5.setBounds(20, 150, 100, 20);
		add(rotulo5);
		
		campo1 = new JTextField();
		campo1.setBounds(100, 60, 200, 20);
		campo1.setToolTipText("Digite aqui o nome");
		add(campo1);
		
		campo2 = new JTextField();
		campo2.setBounds(100, 90, 200, 20);
		campo2.setToolTipText("Digite aqui a descrição");
		add(campo2);
		
		campo3 = new JTextField();
		campo3.setBounds(100, 120, 200, 20);
		campo3.setToolTipText("Digite aqui a quantidade");
		add(campo3);
		
		campo4 = new JTextField();
		campo4.setBounds(100, 150, 200, 20);
		campo4.setToolTipText("Digite aqui o preço");
		add(campo4);
		
		botao1 = new JButton("Cadastrar Produto");
		botao1.setBounds(75, 185, 150, 20);
		botao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = campo1.getText();
				String descricao = campo2.getText();
				String quantidade = campo3.getText();
				String preco = campo4.getText();
				
				Produto produto = new Produto(nome, descricao, Integer.parseInt(quantidade), Double.parseDouble(preco));
				produto.incluirProduto();
				
				JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso");
				new JanCadProduto();
			}
		});
		
		add(botao1);
	}
	
	public static void main(String[] args) {
		JanCadProduto jcp = new JanCadProduto();
		jcp.setVisible(true);
	}
}