import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int choice, num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Choose an operation:\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n->");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if ((num1 == 0) || (num2 == 0)) {
                    System.out.println("A number cannot be divided by zero!");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid selection. Please try again!");
        }
    }
}
