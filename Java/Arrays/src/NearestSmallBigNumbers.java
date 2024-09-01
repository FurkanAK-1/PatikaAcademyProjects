import java.util.Arrays;

public class NearestSmallBigNumbers {

	public static void main(String[] args) {
		int[] numbers = { 15, 12, 788, 1, -1, -778, 2, 0 };
		int inputNumber = 5;

		Arrays.sort(numbers);

		int closestSmaller = Integer.MIN_VALUE;
		int closestLarger = Integer.MAX_VALUE;

		for (int number : numbers) {
			if (number < inputNumber && number > closestSmaller) {
				closestSmaller = number;
			}
			if (number > inputNumber && number < closestLarger) {
				closestLarger = number;
			}
		}

		System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
		System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
	}
}