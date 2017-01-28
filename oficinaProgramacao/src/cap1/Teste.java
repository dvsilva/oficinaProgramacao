package cap1;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		int idade = 17;
		double altura = 1.71;
		double peso = 78.9;
		char sexo = 'M';
		boolean peso_ideal = true;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a idade: ");
		idade = teclado.nextInt();
		System.out.print("Digite a altura: ");
		altura = teclado.nextFloat();
		System.out.print("Digite peso: ");
		peso = teclado.nextFloat();
		System.out.print("Digite o sexo: ");
		sexo = teclado.next().charAt(0);
		
	}
}