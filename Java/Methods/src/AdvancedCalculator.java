import java.util.Scanner;

public class AdvancedCalculator {

	static void plus() {
		Scanner scan = new Scanner(System.in);
		int number, result = 0, i = 1;
		while (true) {
			System.out.print(i++ + ". number :");
			number = scan.nextInt();
			if (number == 0) {
				break;
			}
			result += number;
		}
		System.out.println("Result : " + result);
	}

	static void minus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers will you enter: ");
		int counter = scan.nextInt();
		int number, result = 0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". number :");
			number = scan.nextInt();
			if (i == 1) {
				result += number;
				continue;
			}
			result -= number;
		}

		System.out.println("Result : " + result);
	}

	static void times() {
		Scanner scan = new Scanner(System.in);
		int number, result = 1, i = 1;

		while (true) {
			System.out.print(i++ + ". number :");
			number = scan.nextInt();

			if (number == 1)
				break;

			if (number == 0) {
				result = 0;
				break;
			}
			result *= number;
		}

		System.out.println("Result : " + result);
	}

	static void divided() {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers will you enter: ");
		int counter = scan.nextInt();
		double number, result = 0.0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". number :");
			number = scan.nextDouble();
			if (i != 1 && number == 0) {
				System.out.println("You cannot enter 0 as a divisor.");
				continue;
			}
			if (i == 1) {
				result = number;
				continue;
			}
			result /= number;
		}

		System.out.println("Result : " + result);
	}

	static void power() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the base value: ");
		int base = scan.nextInt();
		System.out.print("Enter the exponent value: ");
		int exponent = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}

		System.out.println("Result : " + result);
	}

	static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println("Result : " + result);
	}

	static void mod() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the dividend: ");
		int dividend = scan.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = scan.nextInt();
		int result = dividend % divisor;
		System.out.println("Result : " + result);
	}

	static void rectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		int length = scan.nextInt();
		System.out.print("Enter the width of the rectangle: ");
		int width = scan.nextInt();
		int area = length * width;
		int perimeter = 2 * (length + width);
		System.out.println("Area : " + area);
		System.out.println("Perimeter : " + perimeter);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		String menu = "1- Addition\n" + "2- Subtraction\n" + "3- Multiplication\n" + "4- Division\n" + "5- Power\n"
				+ "6- Factorial\n" + "7- Mod\n" + "8- Rectangle Area and Perimeter\n" + "0- Exit";

		do {
			System.out.println(menu);
			System.out.print("Please select an operation :");
			select = scan.nextInt();
			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mod();
				break;
			case 8:
				rectangle();
				break;
			case 0:
				break;
			default:
				System.out.println("You entered an invalid value, please try again.");
			}
		} while (select != 0);
	}
}
