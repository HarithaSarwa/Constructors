package eg;

public class Calculator {
	int x;
	int y;

	public Calculator(String n) {

		System.out.println("n = " + n);
		;
	}

	public Calculator(int a, int b) {

		x = a;
		y = b;
	}

	public int add() {

		return x + y;
	}
}
