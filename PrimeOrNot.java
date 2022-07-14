package assignment;


public class PrimeOrNot {

	public static void main(String[] args) {
		int a = 15;
		int count = 0;
		for (int i = 2; i < a - 1; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}

	}

}
