import java.util.Scanner;

public class Power {
	public static void main (String... args) {
		Scanner scan = new Scanner(System.in);


			System.out.print("Enter first digit: ");
			int digit1 = scan.nextInt();

			System.out.print("Enter second digit: ");
			int digit2 = scan.nextInt();

			int exponential = 1;


			for (int counter = 1; counter <= digit2; counter++) {
				exponential *= digit1;
        		}

		System.out.println(digit1 + " raised to the power of " + digit2 + " is: " + exponential);
	}

}