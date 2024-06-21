import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int sum = 0;

		// Find the sum of divisors
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		// Check if the number is a perfect number
		if (sum == number && number != 0) {
			System.out.println(number + " is a perfect number.");
		} else {
			System.out.println(number + " is not a perfect number.");
		}
	}
}
