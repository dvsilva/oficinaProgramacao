package cap2;

public class A {
	private int num;

	public void x(B ptrB) {
		num++; // é o mesmo que this.num++;
		ptrB.y();
		printNum(); // é o mesmo que this.printNum++;
	}

	public void printNum() {
		System.out.println(num);
	}
}