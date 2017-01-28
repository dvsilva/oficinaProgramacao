package cap1;

import java.util.Scanner;

public class Exemplo6 {
	public static void main(String[] args) {
		int num = 0, soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		while (num >= 0) {
			soma += num;
			System.out.print("Digite um número: ");
			num = teclado.nextInt();
		}
		
		System.out.print("A soma é " + soma);
	}
}