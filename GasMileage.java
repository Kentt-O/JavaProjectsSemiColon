import java.util.Scanner;

public class GasMileage {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
	
		int totalMiles = 0;
		int tripCounter = 0;
		double combinedMilesPerGallon = 0.0;
		double milesPerGallon = 0.0;


		System.out.print("Enter miles driven and gallons used in integer or 1 to quit: ");
		int milesDriven = input.nextInt();
		int gallonsUsed = input.nextInt();

		while (milesDriven != 1 && gallonsUsed != 1 ) {
			milesPerGallon = (double) milesDriven / gallonsUsed;
			totalMiles = totalMiles + milesDriven;
			tripCounter = tripCounter + 1;
			combinedMilesPerGallon = combinedMilesPerGallon + milesPerGallon;
	
			System.out.print("Enter miles driven and gallons used or 1 to quit: ");
			milesDriven = input.nextInt();
			gallonsUsed = input.nextInt();
		}

		if (tripCounter != 0) {
			double average = combinedMilesPerGallon / tripCounter;
		
			System.out.printf("%n The total miles per gallon for each trip is %.2f%n The combined miles per gallon is: %.2f%n", milesPerGallon, combinedMilesPerGallon);
			System.out.printf("%n The average Combined Miles Per trip %.2f", average);
		}

		else {
			System.out.println ("No trips were entered");

		}
	}

}