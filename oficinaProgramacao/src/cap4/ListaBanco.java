package cap4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ListaBanco {
	static final String URL_BD = "jdbc:mysql://localhost/mercado";

	public ListaBanco() {
		String sql = "SELECT * FROM produto";

		try {
			Connection conexao = DriverManager.getConnection(URL_BD, "root", "123456");
			
			Statement estadoConexao = conexao.createStatement();
			ResultSet resultado = estadoConexao.executeQuery(sql);
			ResultSetMetaData campo = resultado.getMetaData();
			
			int numColunas = campo.getColumnCount();
			
			for (int i = 1; i <= numColunas; i++)
				System.out.printf("%-20S\t", campo.getColumnName(i) + "");
			System.out.println("");
			
			while (resultado.next()) {
				for (int i = 1; i <= numColunas; i++)
					System.out.printf("%-20S\t", resultado.getObject(i));
				System.out.println("");
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