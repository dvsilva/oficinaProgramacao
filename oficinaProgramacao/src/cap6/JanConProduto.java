package cap6;

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


public class JanConProduto extends JFrame {
	
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

	public JanConProduto() {
		super("Consulta de Produto");
		setBounds(100, 50, 340, 260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		getContentPane().setLayout(null);
		
		rotulo1 = new JLabel("CONSULTAR PRODUTO");
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
		campo2.setEnabled(false);
		add(campo2);
		
		campo3 = new JTextField();
		campo3.setBounds(100, 120, 200, 20);
		campo3.setToolTipText("Digite aqui a descrição");
		campo3.setEnabled(false);
		add(campo3);
		
		campo4 = new JTextField();
		campo4.setBounds(100, 150, 200, 20);
		campo4.setToolTipText("Digite aqui a quantidade");
		campo4.setEnabled(false);
		add(campo4);
		
		campo5 = new JTextField();
		campo5.setBounds(100, 180, 200, 20);
		campo5.setToolTipText("Digite aqui o preço");
		campo5.setEnabled(false);
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
		
	}
	
	public static void main(String[] args) {
		JanConProduto jcp = new JanConProduto();
		jcp.setVisible(true);
	}
}