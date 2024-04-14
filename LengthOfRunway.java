import java.util.Scanner;

public class LengthOfRunway {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Speed and acceleration : ");
	double airplaneSpeed = input.nextDouble();
	double airplaneAcceleration = input.nextDouble();

	double speedSquared = airplaneSpeed * airplaneSpeed;

	int two = 2;
	double acceleration2 = two * airplaneAcceleration;

	double lengthOfRunway = speedSquared / acceleration2;
	
	System.out.print("The minimum runway length for this airplane is " + lengthOfRunway);

	}
}