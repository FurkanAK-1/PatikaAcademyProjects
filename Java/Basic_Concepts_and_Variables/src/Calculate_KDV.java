import java.util.Scanner;

public class Calculate_KDV {

	public static void main(String[] args) {
		double amount, kdvRate = 0.18, kdvAmount, totalAmountWithKdv;

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the Amount: ");
		amount = inputScanner.nextDouble();
		double totalAmount=amount;
		
		totalAmount+=amount*kdvRate;
		

		System.out.println("Amount without KDV: " + amount);
		System.out.println("KDV Rate: " + kdvRate);
		System.out.println("KDV Amount: " + amount*kdvRate);
		System.out.println("Amount with KDV: " + totalAmount);
	}

}
