package cap4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AlteraBanco {

	static final String URL_BD = "jdbc:mysql://localhost/mercado";

	public AlteraBanco(int id) {
		String sql = "SELECT * FROM produto WHERE id = " + id;
		
		try {
			Connection conexao = DriverManager.getConnection(URL_BD, "root", "123456");
			Statement estadoConexao = conexao.createStatement();
			ResultSet resultado = estadoConexao.executeQuery(sql);
			resultado.last();
			
			int numLinhas = resultado.getRow();
			resultado.first();
			
			if (numLinhas == 0){
				System.out.println("Produto n�o encontrado");
			}
			else {
				Scanner leia = new Scanner(System.in);
				
				System.out.println("Nome atual: " + resultado.getObject(2));
				System.out.print("Digite o novo nome: ");
				String nome = leia.nextLine();
				
				System.out.println("Descri��o atual: " + resultado.getObject(3));
				System.out.print("Digite a nova descri��o: ");
				String descricao = leia.nextLine();
				
				System.out.println("Quantidade atual: " + resultado.getObject(4));
				System.out.print("Digite a nova quantidade: ");
				int quantidade = leia.nextInt();
				
				System.out.println("Pre�o atual: R$ " + resultado.getObject(5));
				System.out.print("Digite o novo pre�o: R$ ");
				Double preco = leia.nextDouble();
				
				String sql2 = "UPDATE produto SET Nome = '" + nome + "', Descricao ='" + descricao + "', "
						+ "Quantidade = " + quantidade + ", Preco = " + preco + " WHERE id = " + id;
				
				PreparedStatement produtoAlterado = conexao.prepareStatement(sql2);
				produtoAlterado.executeUpdate();
				
				System.out.println("Produto alterado com sucesso");
			}
			
			resultado.close();
			estadoConexao.close();
			conexao.close();
			
		} 
		catch (SQLException sqlExcecao) {
			System.out.println("Erro na opera��o no banco de dados: " + sqlExcecao.getMessage());
		}
	}
}