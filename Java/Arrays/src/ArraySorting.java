import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get the size of the array from the user
		System.out.print("Array size n: ");
		int n = scanner.nextInt();

		// Initialize the array and get the elements from the user
		int[] numbers = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}

		// Sort the array in ascending order
		Arrays.sort(numbers);

		// Print the sorted array
		System.out.print("Sorted array: ");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}