package cap8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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

	public Produto() {
		// TODO Auto-generated constructor stub
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
	
	public int consultarProduto(int id) {
		String sql = "SELECT * FROM produto WHERE id=" + id;

		int retorno = 0;
		
		try {
			Connection conexao = DriverManager.getConnection(URL_BD, "root", "123456");
			PreparedStatement produtoConsultado = conexao.prepareStatement(sql);
			ResultSet resultado = produtoConsultado.executeQuery(sql);
			resultado.last();
			
			int numLinhas = resultado.getRow();
			resultado.first();
			
			if (numLinhas != 0){
				nome = (String) resultado.getObject(2);
				descricao = (String) resultado.getObject(3);
				quantidade = (Integer) resultado.getObject(4);
				preco = (Double) resultado.getObject(5);
				
				retorno = 1;
			}
			
			resultado.close();
			produtoConsultado.close();
			conexao.close();
			
		} catch (SQLException sqlExcecao) {
			System.out.println("Erro na operação no banco de dados: " + sqlExcecao.getMessage());
		}
		
		return retorno;
	}
	
	
	public void alterarProduto(int id) {
		String sql = "UPDATE produto SET Nome = '" + nome + "', Descricao ='" + descricao + "', "
				+ "Quantidade = " + quantidade + ", Preco = " + preco + " WHERE id = " + id;
		
		try {
			Connection conexao = DriverManager.getConnection(URL_BD, "root", "123456");
			PreparedStatement produtoAlterado = conexao.prepareStatement(sql);
			
			produtoAlterado.executeUpdate();
			
			produtoAlterado.close();
			conexao.close();
		} 
		catch (SQLException sqlExcecao) {
			System.out.println("Erro na operação no banco de dados: " + sqlExcecao.getMessage());
		}
	}
	
	public void excluirProduto(int id) {
		
		String sql = "DELETE FROM produto WHERE id=" + id;
		
		try {
			Connection conexao = DriverManager.getConnection(URL_BD, "root", "123456");
			PreparedStatement produtoExcluido = conexao.prepareStatement(sql);
			produtoExcluido.executeUpdate();
			
			produtoExcluido.close();
			conexao.close();
		} 
		catch (SQLException sqlExcecao) {
			System.out.println("Erro na operação no banco de dados: " + sqlExcecao.getMessage());
		}
	}
}
