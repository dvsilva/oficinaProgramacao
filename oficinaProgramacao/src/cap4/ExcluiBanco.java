package cap4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExcluiBanco {
	
	static final String URL_BD = "jdbc:mysql://localhost/mercado";

	public ExcluiBanco(int id) {
		
		String sql = "SELECT * FROM produto WHERE id=" + id;
		
		try {
			Connection conexao = DriverManager.getConnection(URL_BD, "root", "123456");
			Statement estadoConexao = conexao.createStatement();
			ResultSet resultado = estadoConexao.executeQuery(sql);
			resultado.last();
			
			int numLinhas = resultado.getRow();
			resultado.first();
			
			if (numLinhas == 0){
				System.out.println("Produto não encontrado");
			}
			else {
				ResultSetMetaData campo = resultado.getMetaData();
				int numColunas = campo.getColumnCount();
				
				for (int i = 1; i <= numColunas; i++)
					System.out.printf("%-20S\t", campo.getColumnName(i) + "");
				System.out.println("");
				
				for (int i = 1; i <= numColunas; i++)
					System.out.printf("%-20S\t", resultado.getObject(i));
				System.out.println("");
				
				System.out.print("Tem certeza que deseja excluir o produto<S/N>? ");
				
				Scanner leia = new Scanner(System.in);
				String resp = leia.nextLine();
				
				if (resp.compareTo("S") == 0) {
					String sql2 = "DELETE FROM produto WHERE id=" + id;
					PreparedStatement produtoExcluido = conexao.prepareStatement(sql2);
					produtoExcluido.executeUpdate();
					System.out.println("Produto excluído com sucesso");
				}
			}
			
			resultado.close();
			estadoConexao.close();
			conexao.close();
		} 
		catch (SQLException sqlExcecao) {
			System.out.println("Erro na operação no banco de dados: " + sqlExcecao.getMessage());
		}
	}
}