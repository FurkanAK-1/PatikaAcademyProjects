import java.util.Scanner;

public class RecursivePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number....: ");
        int number = scanner.nextInt();
        
        recursivePattern(number, number, false);
        
        scanner.close();
    }

    static void recursivePattern(int original, int current, boolean isIncreasing) {
        System.out.print(current + " ");

        if (!isIncreasing) {
            if (current <= 0) {
                isIncreasing = true;
            } else {
                recursivePattern(original, current - 5, isIncreasing);
            }
        }

        if (isIncreasing && current != original) {
            recursivePattern(original, current + 5, isIncreasing);
        }
    }
}
