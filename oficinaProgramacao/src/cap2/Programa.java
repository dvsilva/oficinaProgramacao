package cap2;

public class Programa {
	public static void main(String[] args) {
		Pessoa p1, p2, p3;
		p1 = new Pessoa("123456789-09", "José Maria");
		p2 = new Pessoa("098765432-21", "Maria da Conceição");

		p3 = p1;
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
	}
}