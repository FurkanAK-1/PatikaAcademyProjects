import java.util.Scanner;

public class HoroscopeFinding {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int month, day;

		System.out.print("Please enter your birth month as a number (1-12): ");
		month = input.nextInt();
		System.out.print("Please enter your birth day (1-31): ");
		day = input.nextInt();

		// Determine the zodiac sign based on the birth date
		if (month == 1) {
			if (day >= 1 && day <= 21) {
				System.out.println("Your birth date: " + day + " January - Your zodiac sign: Capricorn");
			} else {
				System.out.println("Your birth date: " + day + " January - Your zodiac sign: Aquarius");
			}
		} else if (month == 2) {
			if (day >= 1 && day <= 19) {
				System.out.println("Your birth date: " + day + " February - Your zodiac sign: Aquarius");
			} else {
				System.out.println("Your birth date: " + day + " February - Your zodiac sign: Pisces");
			}
		} else if (month == 3) {
			if (day >= 1 && day <= 20) {
				System.out.println("Your birth date: " + day + " March - Your zodiac sign: Pisces");
			} else {
				System.out.println("Your birth date: " + day + " March - Your zodiac sign: Aries");
			}
		} else if (month == 4) {
			if (day >= 1 && day <= 20) {
				System.out.println("Your birth date: " + day + " April - Your zodiac sign: Aries");
			} else {
				System.out.println("Your birth date: " + day + " April - Your zodiac sign: Taurus");
			}
		} else if (month == 5) {
			if (day >= 1 && day <= 21) {
				System.out.println("Your birth date: " + day + " May - Your zodiac sign: Taurus");
			} else {
				System.out.println("Your birth date: " + day + " May - Your zodiac sign: Gemini");
			}
		} else if (month == 6) {
			if (day >= 1 && day <= 22) {
				System.out.println("Your birth date: " + day + " June - Your zodiac sign: Gemini");
			} else {
				System.out.println("Your birth date: " + day + " June - Your zodiac sign: Cancer");
			}
		} else if (month == 7) {
			if (day >= 1 && day <= 22) {
				System.out.println("Your birth date: " + day + " July - Your zodiac sign: Cancer");
			} else {
				System.out.println("Your birth date: " + day + " July - Your zodiac sign: Leo");
			}
		} else if (month == 8) {
			if (day >= 1 && day <= 22) {
				System.out.println("Your birth date: " + day + " August - Your zodiac sign: Leo");
			} else {
				System.out.println("Your birth date: " + day + " August - Your zodiac sign: Virgo");
			}
		} else if (month == 9) {
			if (day >= 1 && day <= 22) {
				System.out.println("Your birth date: " + day + " September - Your zodiac sign: Virgo");
			} else {
				System.out.println("Your birth date: " + day + " September - Your zodiac sign: Libra");
			}
		} else if (month == 10) {
			if (day >= 1 && day <= 22) {
				System.out.println("Your birth date: " + day + " October - Your zodiac sign: Libra");
			} else {
				System.out.println("Your birth date: " + day + " October - Your zodiac sign: Scorpio");
			}
		} else if (month == 11) {
			if (day >= 1 && day <= 21) {
				System.out.println("Your birth date: " + day + " November - Your zodiac sign: Scorpio");
			} else {
				System.out.println("Your birth date: " + day + " November - Your zodiac sign: Sagittarius");
			}
		} else if (month == 12) {
			if (day >= 1 && day <= 21) {
				System.out.println("Your birth date: " + day + " December - Your zodiac sign: Sagittarius");
			} else {
				System.out.println("Your birth date: " + day + " December - Your zodiac sign: Capricorn");
			}
		}

	}

}
