import java.util.Scanner;

public class SumEvenAndMultiplesOf4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int number;

		// Continue to accept numbers until an odd number is entered
		while (true) {
			System.out.print("Enter a number: ");
			number = scanner.nextInt();

			// If the number is odd, exit the loop
			if (number % 2 != 0) {
				break;
			}

			// If the number is even and a multiple of 4, add it to the sum
			if (number % 2 == 0 && number % 4 == 0) {
				sum += number;
			}
		}

		// Output the result
		System.out.println("Sum of even numbers and multiples of 4: " + sum);
	}

}
