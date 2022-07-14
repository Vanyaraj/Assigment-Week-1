package assignment;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10, 20, 30));
		System.out.println(calculator.sub(30, 20));
		System.out.println(calculator.mul(2d, 7d));
		System.out.println(calculator.divide(3f, 5f));
	}

}
