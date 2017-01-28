package cap4;

import java.util.Scanner;

public class Exemplo5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o id do produto: ");
		int idProduto = leia.nextInt();
		
		AlteraBanco consulta = new AlteraBanco(idProduto);
	}
}