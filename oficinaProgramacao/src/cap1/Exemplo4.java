package cap1;

import java.util.Scanner;

public class Exemplo4 {
	public static void main(String[] args) {
		int dia;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número entre 1 e 7: ");
		dia = teclado.nextInt();
		
		switch (dia) {
		case 1:
			System.out.print("Domingo");
			break;
		case 2:
			System.out.print("Segunda-feira");
			break;
		case 3:
			System.out.print("Terça-feira");
			break;
		case 4:
			System.out.print("Quarta-feira");
			break;
		case 5:
			System.out.print("Quinta-feira");
			break;
		case 6:
			System.out.print("Sexta-feira");
			break;
		case 7:
			System.out.print("Sábado");
			break;
		default:
			System.out.print("Dia Inválido");
		}
	}
}