import java.util.Scanner;

public class SumDigitsOfAnInteger {
	public static void main (String... args) {
		Scanner scan = new Scanner(System.in);

			System.out.print("Enter a number between 0 and 1000: ");
			int userInput = scan.nextInt();

			int extractDigit = userInput % 10;
			int extract = (userInput / 10) % 10;
			int extraction = (userInput / 10) / 10;
			int sum = extractDigit + extract + extraction;

		System.out.printf("The sum of the digits is %d", sum);
			

			
	}
}