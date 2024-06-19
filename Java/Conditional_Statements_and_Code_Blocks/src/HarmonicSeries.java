import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		double sum = 0.0;
		for (int i = 1; i <= number; ++i) {
			sum += 1.0 / i;
		}

		System.out.println("Harmonic series sum of " + number + " terms: " + sum);
	}

}
