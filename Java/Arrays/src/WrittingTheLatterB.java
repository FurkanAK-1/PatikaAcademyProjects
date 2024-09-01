
public class WrittingTheLatterB {
	public static void main(String[] args) {

		char[][] letterB = new char[7][4];

		for (int i = 0; i < letterB.length; i++) {
			for (int j = 0; j < letterB[i].length; j++) {

				if (j == 0) {
					letterB[i][j] = '*';
				}

				else if ((i == 0 || i == 3 || i == 6) && j < 3) {
					letterB[i][j] = '*';
				}

				else if ((i == 1 || i == 2 || i == 4 || i == 5) && j == 3) {
					letterB[i][j] = '*';
				}

				else {
					letterB[i][j] = ' ';
				}
			}
		}

		for (char[] row : letterB) {
			for (char ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}