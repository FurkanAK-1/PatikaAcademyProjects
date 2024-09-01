import java.util.Arrays;

public class RepeatingEvenNumbers {
	public static void main(String[] args) {
		int numbers[] = { 2, 2, 3, 3, 4, 5, 6, 4, 6, 7, 8, 9, 10, 10, 10 };

		Arrays.sort(numbers);

		int repeated = Integer.MIN_VALUE;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == numbers[i - 1] && numbers[i] % 2 == 0) {
				if (numbers[i] != repeated) {
					System.out.println(numbers[i]);
					repeated = numbers[i];
				}
			}
		}
	}
}