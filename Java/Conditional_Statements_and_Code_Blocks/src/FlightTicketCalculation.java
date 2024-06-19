import java.util.Scanner;

public class FlightTicketCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mesafeyi km türünden giriniz: ");
		int mesafe = scanner.nextInt();

		System.out.println("Yaşınızı giriniz:");
		int yas = scanner.nextInt();

		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş)");
		int yolculukTipi = scanner.nextInt();
		int biletfiyati = (mesafe * 10) / 100;

		if (mesafe <= 0 || yas <= 0) {
			System.out.println("Hatalı Veri Girdiniz!");
			return;
		}

		switch (yolculukTipi) {

		case 1:
			break;

		case 2:
			biletfiyati = 2 * (biletfiyati * 80) / 100;
			break;

		default:
			System.out.println("Hatalı Veri Grdiniz!");
			return;

		}
		if (yas < 12) {
			biletfiyati = (biletfiyati * 50) / 100;
		} else if (yas >= 12 && yas <= 24) {
			biletfiyati = (biletfiyati * 90) / 100;
		} else if (yas >= 65) {
			biletfiyati = (biletfiyati * 70) / 100;
		}

		System.out.println("Toplam Tutar = " + biletfiyati);

	}

}
