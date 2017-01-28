package cap1;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		idade = teclado.nextInt();
		if (idade >= 18)
			System.out.print("Maior de Idade");
	}
}