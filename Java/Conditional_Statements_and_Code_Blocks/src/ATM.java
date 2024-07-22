import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		String username, password;
		Scanner input = new Scanner(System.in);
		int attempts = 3;
		int balance = 1500;
		int choice;
		while (attempts > 0) {
			System.out.print("Usernameaa: ");
			username = input.nextLine();
			System.out.print("Password: ");
			password = input.nextLine();

			if (username.equals("patika") && password.equals("dev123")) {
				System.out.println("Welcome to Kodluyoruz Bank!");
				do {
					System.out.println("1-Deposit\n" + "2-Withdraw\n" + "3-Balance Inquiry\n" + "4-Exit");
					System.out.print("Please select an operation: ");
					choice = input.nextInt();
					switch (choice) {
					case 1:
						System.out.print("Enter the amount to deposit: ");
						int depositAmount = input.nextInt();
						balance += depositAmount;
						break;
					case 2:
						System.out.print("Enter the amount to withdraw: ");
						int withdrawAmount = input.nextInt();
						if (withdrawAmount > balance) {
							System.out.println("Insufficient funds.");
						} else {
							balance -= withdrawAmount;
						}
						break;
					case 3:
						System.out.println("Your balance: " + balance);
						break;
					case 4:
						System.out.println("Goodbye.");
						break;
					default:
						System.out.println("Invalid operation. Please try again.");
						break;
					}
				} while (choice != 4);
				break;
			} else {
				attempts--;
				System.out.println("Invalid username or password. Please try again.");
				if (attempts == 0) {
					System.out.println("Your account has been blocked. Please contact the bank.");
				} else {
					System.out.println("Attempts left: " + attempts);
				}
			}
		}
	}

}
