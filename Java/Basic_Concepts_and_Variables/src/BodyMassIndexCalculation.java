import java.util.Scanner;

public class BodyMassIndexCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double height, weight, bodyMassIndex;

		System.out.println("Enter your height (in meters): ");
		height = scanner.nextDouble();

		System.out.println("Enter your weight: ");
		weight = scanner.nextDouble();

		bodyMassIndex = weight / (height * height);

		System.out.println("Your Body Mass Index (BMI): " + bodyMassIndex);

	}

}
