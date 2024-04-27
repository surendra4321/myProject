package abstraction;

//Method Overloading -->>Compile time polymorphisms
class Calculator {
	// 2-parameter
	void sum(int a, int b) {
		int c = a + b;
		System.out.println("The sum of two no is :" + c);
	}

	// 3-parameter
	void sum(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("The sum of three no is :" + d);
	}

	// Change in the datatype(int to long)
	void sum(int a, int b, long c) {
		long d = a + b + c;
		System.out.println("The sum of three no is :" + d);
	}

	// Change in the datatype
	void sum(long a, int b, long c) {
		long d = a + b + c;
		System.out.println("The sum of three no is :" + d);
	}

	// Change in the datatype(int to double)
	void sum(long a, double b, long c) {
		double d = a + b + c;
		System.out.println("The sum of three no is :" + d);
	}
}

public class MethodDemo1 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.sum(10, 20);
		calculator.sum(20, 30, 40);
		calculator.sum(4, 6, 10000);
		calculator.sum(20000, 20.5, 3000);
		calculator.sum(2000, 10, 6000);

	}

}
