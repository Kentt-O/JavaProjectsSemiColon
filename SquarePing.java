import java.util.Scanner;

public class SquarePing {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number in square meter: ");
		double numberInSquareMeters = input.nextDouble();

		double valueForOnePing = 0.3025;
		double convertFromSquareMetersToPing = numberInSquareMeters * valueForOnePing;

		System.out.println(numberInSquareMeters +" square meters is " + convertFromSquareMetersToPing + " pings");
	}
}