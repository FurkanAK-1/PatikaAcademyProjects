import java.util.Scanner;

public class Taximeter {

	public static void main(String[] args) {
		double min = 20;
		Scanner input = new Scanner(System.in);

		System.out.println("How many kilometers did you travel by taxi?");
		double km = input.nextDouble();

		double fee = 2.20 * km;

		if (fee < min) {
			System.out.println("The fee is " + min + " Turkish Liras.");
		} else {
			System.out.printf("The fee is " + fee + "Turkish Liras.");
		}

	}

}
