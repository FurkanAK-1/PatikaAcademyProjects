import java.util.Scanner;

public class MineSweeper {
	private int rows;
	private int cols;
	private int[][] board;
	private char[][] displayBoard;
	private boolean[][] visited;
	private int totalMines;
	private int remainingTiles;

	public MineSweeper(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.board = new int[rows][cols];
		this.displayBoard = new char[rows][cols];
		this.visited = new boolean[rows][cols];
		this.totalMines = (rows * cols) / 4; // Calculate the number of mines
		this.remainingTiles = rows * cols;
		initializeBoard();
		placeMines();
		printBoard();
	}

	public void initializeBoard() {
		// Fill the matrix and image matrix with initial values
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				board[i][j] = 0;
				displayBoard[i][j] = '-';
			}
		}

	}

	public void printBoard() {
		// Print image matrix to screen
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(displayBoard[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void printBoard2() {
		// Print image matrix to screen
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void placeMines() {
		// Place random mines
		int count = 0;
		while (count < totalMines) {
			int randRow = (int) (Math.random() * rows);
			int randCol = (int) (Math.random() * cols);
			if (board[randRow][randCol] != -1) {
				board[randRow][randCol] = -1;
				count++;
			}
		}
	}

	public void play() {
		Scanner scanner = new Scanner(System.in);
		while (remainingTiles > totalMines) {
			System.out.print("Enter line: ");
			int row = scanner.nextInt();
			System.out.print("Enter column: ");
			int col = scanner.nextInt();

			if (row < 0 || row >= rows || col < 0 || col >= cols) {
				System.out.println("Invalid coordinate. Please re-enter.");
				continue;
			}

			if (visited[row][col]) {
				System.out.println("This coordinate has been selected before. Enter another coordinate.");
				continue;
			}

			if (board[row][col] == -1) {
				System.out.println("You stepped on a mine! You lost the game.");
				displayBoard[row][col] = '*';
				printBoard();
				return;
			} else {
				int count = countAdjacentMines(row, col);
				displayBoard[row][col] = (char) (count + '0');
				remainingTiles--;
				visited[row][col] = true;
				printBoard();
			}
		}
		System.out.println("Congratulations, you found all the mines! You won the game.");
	}

	private int countAdjacentMines(int row, int col) {
		int count = 0;
		for (int i = row - 1; i <= row + 1; i++) {
			for (int j = col - 1; j <= col + 1; j++) {
				if (i >= 0 && i < rows && j >= 0 && j < cols && board[i][j] == -1) {
					count++;
				}
			}
		}
		return count;
	}
}
