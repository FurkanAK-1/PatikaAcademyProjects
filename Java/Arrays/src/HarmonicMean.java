
public class HarmonicMean {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 8 };
		double harmonicMean = calculateHarmonicMean(numbers);
		System.out.println("Dizideki sayıların harmonik ortalaması: " + harmonicMean);
	}

	public static double calculateHarmonicMean(int[] numbers) {
		double sum = 0.0;
		for (int number : numbers) {
			sum += 1.0 / number;
		}
		return numbers.length / sum;
	}
}