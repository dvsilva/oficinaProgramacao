package cap7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JanAltProduto extends JFrame {
	
	private JPanel contentPane;
	
	private JLabel rotulo1;
	private JLabel rotulo2;
	private JLabel rotulo3;
	private JLabel rotulo4;
	private JLabel rotulo5;
	private JLabel rotulo6;
	
	private JTextField campo1;
	private JTextField campo2;
	private JTextField campo3;
	private JTextField campo4;
	private JTextField campo5;
	
	private JButton botao1;
	private JButton botao2;

	public JanAltProduto() {
		super("Alteração de Produto");
		setBounds(100, 50, 340, 260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		getContentPane().setLayout(null);
		
		rotulo1 = new JLabel("ALTERAR PRODUTO");
		rotulo1.setBounds(100, 20, 200, 20);
		add(rotulo1);
		
		rotulo2 = new JLabel("Código:");
		rotulo2.setBounds(20, 60, 100, 20);
		add(rotulo2);
		
		rotulo3 = new JLabel("Nome:");
		rotulo3.setBounds(20, 90, 100, 20);
		add(rotulo3);
		
		rotulo4 = new JLabel("Descrição:");
		rotulo4.setBounds(20, 120, 100, 20);
		add(rotulo4);
		
		rotulo5 = new JLabel("Quantidade:");
		rotulo5.setBounds(20, 150, 100, 20);
		add(rotulo5);
		
		rotulo6 = new JLabel("Preço:");
		rotulo6.setBounds(20, 180, 100, 20);
		add(rotulo6);
		
		campo1 = new JTextField();
		campo1.setBounds(100, 60, 50, 20);
		campo1.setToolTipText("Digite aqui o código");
		add(campo1);
		
		campo2 = new JTextField();
		campo2.setBounds(100, 90, 200, 20);
		campo2.setToolTipText("Digite aqui o nome");
		campo2.setEditable(false);
		add(campo2);
		
		campo3 = new JTextField();
		campo3.setBounds(100, 120, 200, 20);
		campo3.setToolTipText("Digite aqui a descrição");
		campo3.setEditable(false);
		add(campo3);
		
		campo4 = new JTextField();
		campo4.setBounds(100, 150, 75, 20);
		campo4.setToolTipText("Digite aqui a quantidade");
		campo4.setEditable(false);
		add(campo4);
		
		campo5 = new JTextField();
		campo5.setBounds(100, 180, 75, 20);
		campo5.setToolTipText("Digite aqui o preço");
		campo5.setEditable(false);
		add(campo5);
		
		botao1 = new JButton("Consultar Produto");
		botao1.setBounds(160, 60, 140, 20);
		add(botao1);
		botao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto();
				int achou = produto.consultarProduto(Integer.parseInt(campo1.getText()));
				
				if(achou == 1){
					campo2.setText(produto.getNome());
					campo3.setText(produto.getDescricao());
					campo4.setText(Integer.toString(produto.getQuantidade()));	
					campo5.setText(Double.toString(produto.getPreco()));
					
					campo1.setEditable(false);
					campo2.setEditable(true);
					campo3.setEditable(true);
					campo4.setEditable(true);
					campo5.setEditable(true);
				}
				else {
					campo2.setText(null);
					campo3.setText(null);
					campo4.setText(null);	
					campo5.setText(null);
					
					JOptionPane.showMessageDialog(null, "Produto não encontrado");
				}
			}
		});
		
		botao2 = new JButton("Alterar");
		botao2.setBounds(185, 180, 115, 20);
		add(botao2);
		botao2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					int id = Integer.parseInt(campo1.getText());
					String nome = campo2.getText();
					String descricao = campo3.getText();
					int quantidade = Integer.parseInt(campo4.getText());
					double preco = Double.parseDouble(campo5.getText());
					
					Produto produto = new Produto(nome, descricao, quantidade, preco);
					produto.alterarProduto(id);
					
					campo1.setEditable(true);
					campo2.setEditable(false);
					campo3.setEditable(false);
					campo4.setEditable(false);
					campo5.setEditable(false);
					
					JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
				}
		});
		
	}
	
	public static void main(String[] args) {
		JanAltProduto jcp = new JanAltProduto();
		jcp.setVisible(true);
	}
}