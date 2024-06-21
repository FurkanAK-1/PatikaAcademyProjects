import java.util.Scanner;

public class MinMaxCal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many numbers will you enter? ");
		int n = scanner.nextInt();

		if (n <= 0) {
			System.out.println("Please enter a valid number of elements.");
			return;
		}

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 1; i <= n; i++) {
			System.out.print("Enter number " + i + ": ");
			int num = scanner.nextInt();

			if (num > max) {
				max = num;
			}

			if (num < min) {
				min = num;
			}
		}

		System.out.println("The largest number: " + max);
		System.out.println("The smallest number: " + min);
	}

}
