import java.util.Scanner;

public class NaturalNumber {
	public static void main (String... args) {
		Scanner scan = new Scanner(System.in);

		int counter = 1;
		int totalSum = 0;
		

		do {
			System.out.print ("Enter number: ");
			int digitsEntered = scan.nextInt();
				counter++;
				totalSum += digitsEntered;
				
		}
		while (counter <=10);

		System.out.printf("The sum is %d",totalSum);
				
	}


}