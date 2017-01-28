package cap4;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		String nome, descricao;
		int quantidade;
		double preco;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();
		
		System.out.print("Digite a descrição: ");
		descricao = leia.nextLine();
		
		System.out.print("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		System.out.print("Digite o preço: R$ ");
		preco = leia.nextDouble();
		
		IncluiBanco inclusao = new IncluiBanco(nome, descricao, quantidade, preco);
	}
}