import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Please enter your guess: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0 and 99.");
                if (isWrong) {
                    right++;
                    System.out.println("Too many invalid entries. Remaining attempts: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Further invalid entries will reduce your attempts.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, correct guess! The number was: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Incorrect guess!");
                if (selected > number) {
                    System.out.println(selected + " is greater than the secret number.");
                } else {
                    System.out.println(selected + " is less than the secret number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining attempts: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost!");
            if (!isWrong) {
                System.out.println("Your guesses: " + Arrays.toString(wrong));
            }
        }

        input.close();
    }
}
