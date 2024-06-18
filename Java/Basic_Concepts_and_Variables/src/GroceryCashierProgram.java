import java.util.Scanner;

public class GroceryCashierProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pear, apple, tomato, banana, eggplant, total = 0;

		System.out.println("How many kilograms of pears?");
		pear = scanner.nextDouble();
		total += pear * 2.14;

		System.out.println("How many kilograms of apples?");
		apple = scanner.nextDouble();
		total += apple * 3.67;

		System.out.println("How many kilograms of tomatoes?");
		tomato = scanner.nextDouble();
		total += tomato * 1.11;

		System.out.println("How many kilograms of bananas?");
		banana = scanner.nextDouble();
		total += banana * 0.95;

		System.out.println("How many kilograms of eggplants?");
		eggplant = scanner.nextDouble();
		total += eggplant * 5;

		System.out.println("Total Cost: " + total);

	}

}
