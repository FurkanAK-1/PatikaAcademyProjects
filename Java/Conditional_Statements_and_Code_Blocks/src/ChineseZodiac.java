import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your birth year: ");
		int birthYear = scanner.nextInt();

		String[] zodiacList = { "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
				"Horse", "Sheep" };

		int index = birthYear % 12;
		String zodiac = zodiacList[index];

		System.out.println("Your Chinese Zodiac Sign: " + zodiac);

	}

}
