import java.util.Scanner;

public class PrimeNumberRecursive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (isPrime(number, 2)) {
			System.out.println(number + " is a PRIME numberasdas!");
		} else {
			System.out.println(number + " is NOT a PRIME number!");
		}

		scanner.close();
	}

	static boolean isPrime(int number, int divisor) {
		if (number <= 2) {
			return (number == 2);
		}
		if (number % divisor == 0) {
			return false;
		}
		if (divisor * divisor > number) {
			return true;
		}
		return isPrime(number, divisor + 1);
	}
}
