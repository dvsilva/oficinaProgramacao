package cap4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncluiBanco {
	static final String URL_BD = "jdbc:mysql://localhost/mercado";

	public IncluiBanco(String nome, String descricao, int quantidade, double preco) {
		String sql = "INSERT INTO produto (Nome, Descricao, Quantidade, Preco) VALUES"
				+ "('" + nome + "', '" + descricao + "', " + quantidade + ", " + preco + ")";
		
		try {
			Connection conexao = DriverManager.getConnection(URL_BD, "root", "123456");
			PreparedStatement novoProduto = conexao.prepareStatement(sql);
			novoProduto.execute();
			
			System.out.println("Produto cadastrado com sucesso");
			conexao.close();
		} 
		catch (SQLException sqlExcecao) {
			System.out.println("Erro na operação no banco de dados: " + sqlExcecao.getMessage());
		}
	}
}