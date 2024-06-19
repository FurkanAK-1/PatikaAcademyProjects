import java.util.Scanner;

public class CombinationCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = scanner.nextInt();

		System.out.print("Enter the value of r: ");
		int r = scanner.nextInt();

		int result = calculateCombination(n, r);
		System.out.println("C(" + n + ", " + r + ") = " + result);
	}

	public static int calculateCombination(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}

	public static int factorial(int number) {
		if (number == 0) {
			return 1;
		}
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}

}
