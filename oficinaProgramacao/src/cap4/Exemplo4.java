package cap4;

import java.util.Scanner;

public class Exemplo4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o id do produto: ");
		int idProduto = leia.nextInt();
		
		ConsultaBanco consulta = new ConsultaBanco(idProduto);
	}
}