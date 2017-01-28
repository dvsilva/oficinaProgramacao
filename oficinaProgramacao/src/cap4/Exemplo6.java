package cap4;

import java.util.Scanner;

public class Exemplo6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o id do produto: ");
		int idProduto = leia.nextInt();
		
		ExcluiBanco consulta = new ExcluiBanco(idProduto);
	}
}