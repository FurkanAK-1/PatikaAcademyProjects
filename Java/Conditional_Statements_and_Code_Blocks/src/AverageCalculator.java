import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int sum = 0;
		int count = 0;

		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				sum += i;
				count++;
			}
		}

		if (count > 0) {
			double average = (double) sum / count;
			System.out.println("The average of numbers divisible by 3 and 4: " + average);
		} else {
			System.out.println("There are no numbers divisible by both 3 and 4.");
		}
	}

}
