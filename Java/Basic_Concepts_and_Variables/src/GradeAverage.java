import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many of your course grades will you enter?");
		int numberOfLessons = scanner.nextInt();
		String[] lessons = new String[numberOfLessons];
		double[] notes = new double[numberOfLessons];
		double total = 0;

		for (int i = 0; i < lessons.length; i++) {
			System.out.println("Enter the lesson");
			lessons[i] = scanner.next();
			System.out.println("Enter the grade of " + lessons[i] + " lesson");
			notes[i] = scanner.nextDouble();

		}

		for (int i = 0; i < lessons.length; i++) {

			System.out.println(lessons[i] + ": " + notes[i]);
			total += notes[i];

		}

		System.out.println("Average Score: " + total / lessons.length);

	}

}
