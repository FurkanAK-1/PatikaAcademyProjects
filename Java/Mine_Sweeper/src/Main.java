import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Minesweeper Game!");
		System.out.print("Enter the number of rows:");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = scanner.nextInt();

		MineSweeper game = new MineSweeper(rows, cols);
		
		
		game.play();

	}

}
