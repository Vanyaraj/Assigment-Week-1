package assignment;

public class PositiveNumber {

	public static void main(String[] args) {
		int number = 40;
		if (number < 0) {
			System.out.println("Negative Number");
			number = number * -1;
			System.out.println("Converted Positive Number is :" + number);
		}
		else {
			System.out.println("Positive Number");
		}
	}
}
