import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		int a, b;
		double c;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first length: ");
		a = input.nextInt();

		System.out.print("Enter the second length: ");
		b = input.nextInt();

		c = Math.sqrt((a * a) + (b * b));
		System.out.println("The length of the hypotenuse: " + c);

	}

}
