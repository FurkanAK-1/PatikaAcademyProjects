import java.util.Scanner;

public class PowersOfFourAndFive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		System.out.println("Powers of 4 and 5:");
		for (int i = 1; i <= number; i++) {
			System.out.println("4^" + i + " = " + Math.pow(4, i));
			System.out.println("5^" + i + " = " + Math.pow(5, i));
		}
	}

}
