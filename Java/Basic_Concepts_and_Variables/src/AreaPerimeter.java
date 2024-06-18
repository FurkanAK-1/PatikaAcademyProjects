import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		int r;
		double pi = 3.14;

		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");
		r = inp.nextInt();

		double area = pi * r * r;
		double circumference = 2 * pi * r; 

		System.out.println("The area of the circle: " + area);
		System.out.println("The circumference of the circle: " + circumference);

	}

}
