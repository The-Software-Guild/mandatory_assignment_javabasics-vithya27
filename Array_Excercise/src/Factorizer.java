import java.util.ArrayList;
import java.util.Scanner;

public class Factorizer {
	private static final ArrayList<Integer> factors = new ArrayList<>();

	public static void getFactors(int number) {

		for (int i = 1; i <= number; ++i) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
	}

	public static void isPerfect (ArrayList<Integer> factors, int number) {
		int sum = 0;
		for (int i = 0; i < factors.size() - 1; i++) {
			sum += factors.get(i);

		}
		if (sum == number) {
			System.out.println(number + " is a perfect number");
		} else System.out.println(number + " is not a perfect number");
	}


	public static void main (String[]args){
		Scanner scanner = new Scanner(System.in);
		int input;

		while (true) {
			try {
				System.out.print("Enter the number which you would like to factorize: ");
				input = Integer.parseInt(scanner.nextLine().trim());
				break;
			} catch (java.lang.NumberFormatException p) {
				System.out.println("You have entered an invalid input. Please enter an integer.");
			}
		}

		getFactors(input);
		System.out.println("The factors of " + input + " are: " + factors);
		isPerfect(factors, input);
		if (factors.size() == 2) {
			System.out.println(input + " is a prime number");
		} else System.out.println(input + " is not a prime number");

	}
}

