package cap2;

public class A {
	private int num;

	public void x(B ptrB) {
		num++; // � o mesmo que this.num++;
		ptrB.y();
		printNum(); // � o mesmo que this.printNum++;
	}

	public void printNum() {
		System.out.println(num);
	}
}