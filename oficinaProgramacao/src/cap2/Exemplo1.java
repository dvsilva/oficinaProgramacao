package cap2;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Digite outro número: ");
		num2 = teclado.nextInt();
		soma = num1 + num2;
		
		System.out.print("A soma é " + soma);
	}
}