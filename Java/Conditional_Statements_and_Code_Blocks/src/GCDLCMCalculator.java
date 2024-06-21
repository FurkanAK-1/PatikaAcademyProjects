import java.util.Scanner;

public class GCDLCMCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		int originalNum1 = num1;
		int originalNum2 = num2;

		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		int gcd = num1;

		// Calculate LCM (Least Common Multiple)
		int lcm = (originalNum1 * originalNum2) / gcd;

		System.out.println("GCD (Greatest Common Divisor): " + gcd);
		System.out.println("LCM (Least Common Multiple): " + lcm);
	}

}
