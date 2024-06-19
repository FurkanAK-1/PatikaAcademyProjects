import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		String username = "patika";
		String password = "java101";
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Enter your username (type 'exit' to quit): ");
			String enteredUsername = input.nextLine();
			if (enteredUsername.equals("exit")) {
				System.out.println("Exiting the program...");
				break;
			}

			System.out.println("Enter your password: ");
			String enteredPassword = input.nextLine();

			if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
				System.out.println("Login successful.");
				break;
			} else {
				System.out.println("Incorrect username or password. Would you like to change your password? Y/N");
				String passwordChangeResponse = input.nextLine();
				if (passwordChangeResponse.equalsIgnoreCase("Y")) {
					System.out.println("Enter your new password: ");
					String newPassword = input.nextLine();
					if (newPassword.equals(password)) {
						System.out.println("You entered the same password.");
					} else {
						password = newPassword;
						System.out.println("Your password has been successfully changed.");
					}
				} else {
					System.out.println("Please try again.");
				}
			}
		}

		input.close();
	}
}
