import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome number.");
		} else {
			System.out.println(number + " is not a palindrome number.");
		}
 System.out.println("tessadt");
		scanner.close();
	}

	static boolean isPalindrome(int num) {
		int originalNumber = num;
		int reverseNumber = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			num = num / 10;
		}
		return originalNumber == reverseNumber;
	}

}
