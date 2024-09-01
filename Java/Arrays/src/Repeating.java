import java.util.Scanner;

public class Repeating {
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

		// Array to keep track of visited elements
		boolean[] visited = new boolean[n];

		System.out.println("Frequency of elements in the array:");
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (numbers[i] == numbers[j]) {
					visited[j] = true;
					count++;
				}
			}

			System.out.println(numbers[i] + " appears " + count + " time(s).");
		}
	}
}