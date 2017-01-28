package cap1;

import java.util.Scanner;

public class Exemplo7 {
	public static void main(String[] args) {
		int num = 0, soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		do {
			soma += num;
			System.out.print("Digite um número: ");
			num = teclado.nextInt();
		} 
		while (num >= 0);
		
		System.out.print("A soma é " + soma);
	}
}