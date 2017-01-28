package cap1;

import java.util.Scanner;

public class Exemplo5 {
	public static void main(String[] args) {
		int i, num, soma = 0;
		Scanner teclado = new Scanner(System.in);
		for (i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			num = teclado.nextInt();
			soma += num;
		}
		System.out.print("A soma é " + soma);
	}
}