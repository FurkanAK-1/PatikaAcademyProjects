import java.util.Scanner;

public class ActivitySuggestion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int temperature;

		System.out.print("Please enter the temperature value: ");
		temperature = input.nextInt();

		if (temperature <= 5) {
			System.out.println("You can go skiing. Temperature: " + temperature + " degrees");
		} else if (temperature > 5 && temperature <= 25) {
			if (temperature <= 15) {
				System.out.println("You can go to the cinema. Temperature: " + temperature + " degrees");
			}
			if (temperature >= 15 && temperature <= 25) {
				System.out.println("You can go for a picnic. Temperature: " + temperature + " degrees");
			}
		} else {
			System.out.println("You can go swimming. Temperature: " + temperature + " degrees");
		}

	}

}
