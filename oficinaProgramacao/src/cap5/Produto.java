package cap5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Produto {
	static final String URL_BD = "jdbc:mysql://localhost/mercado";

	private String nome;
	private String descricao;
	private int quantidade;
	private double preco;

	public Produto(String nome, String descricao, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void incluirProduto() {
		String sql = "INSERT INTO produto (Nome, Descricao, Quantidade, Preco) VALUES"
				+ "('" + nome + "', '" + descricao + "', " + quantidade + ", " + preco + ")";
		
		try {
			Connection conexao = DriverManager.getConnection(URL_BD, "root", "123456");
			PreparedStatement novoProduto = conexao.prepareStatement(sql);
			novoProduto.execute();
			
			conexao.close();
		} 
		catch (SQLException sqlExcecao) {
			System.out.println("Erro na operação no banco de dados: " + sqlExcecao.getMessage());
		}
	}
}
