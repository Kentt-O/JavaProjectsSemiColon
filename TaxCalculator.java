import java.util.Scanner;

public class TaxCalculator {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int count = 1;
		
		System.out.print ("Enter name: ");
		String citizensName = input.next();
		System.out.print ("Enter citzen's earning: ");
		int citizensEarning = input.nextInt();

		while (count <= 3) {
			double totalTax;
			count = count +1;
		
		if (citizensEarning <= 30000) {
			double convertion = 15 / 100.0;
			totalTax = citizensEarning * convertion;
			
		}
			else {
				double convertPercentage = 20 / 100.0;
				totalTax = citizensEarning * convertPercentage;
			}

		System.out.printf("%n Citizen total tax %.2f", totalTax);

		}
	}

}