import java.util.Scanner;

public class FlightTicketCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the distance in km: ");
		int distance = scanner.nextInt();

		System.out.println("Enter your age:");
		int age = scanner.nextInt();

		System.out.println("Enter the type of ticket (1 => One Way, 2 => Round Trip)");
		int ticketType = scanner.nextInt();
		int ticketPrice = (distance * 10) / 100;

		if (distance <= 0 || age <= 0) {
			System.out.println("Invalid Input!");
			return;
		}

		switch (ticketType) {

		case 1:
			break;

		case 2:
			ticketPrice = 2 * (ticketPrice * 80) / 100;
			break;

		default:
			System.out.println("Invalid Input!");
			return;

		}
		if (age < 12) {
			ticketPrice = (ticketPrice * 50) / 100;
		} else if (age >= 12 && age <= 24) {
			ticketPrice = (ticketPrice * 90) / 100;
		} else if (age >= 65) {
			ticketPrice = (ticketPrice * 70) / 100;
		}

		System.out.println("Total Price = " + ticketPrice);

	}

}
