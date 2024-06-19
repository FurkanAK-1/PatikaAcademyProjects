import java.util.Scanner;

public class ClassPassing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int math, physics, turkish, chemistry, music;
		double average;

		System.out.print("Enter your Math grade: ");
		math = input.nextInt();

		System.out.print("Enter your Turkish grade: ");
		turkish = input.nextInt();

		System.out.print("Enter your Physics grade: ");
		physics = input.nextInt();

		System.out.print("Enter your Chemistry grade: ");
		chemistry = input.nextInt();

		System.out.print("Enter your Music grade: ");
		music = input.nextInt();

		average = (math + turkish + physics + chemistry + music) / 5.0;

		if (average <= 55) {
			System.out.println("Unfortunately, you failed the class. Your average is: " + average);
		} else {
			System.out.println("Congratulations, you passed the class! Your average is: " + average);
		}

	}

}
