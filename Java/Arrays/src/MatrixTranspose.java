
public class MatrixTranspose {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		System.out.println("Transpose Matrix:");
		printTranspose(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	private static void printTranspose(int[][] matrix) {
		int rowCount = matrix.length;
		int colCount = matrix[0].length;

		for (int j = 0; j < colCount; j++) {
			for (int i = 0; i < rowCount; i++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}