package eg;

public class Demo {

	public static void main(String[] args) {
		Calculator c = new Calculator("hari");
		System.out.println(c.add());
		
		c=new Calculator(99,100);
		
		System.out.println(c.add());// old reference got garbage collected
		// Constructor overloading
	}
}
