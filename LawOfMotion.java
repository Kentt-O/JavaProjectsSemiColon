import java.util.Scanner;

public class LawOfMotion {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter u, t, and a: ");
		double uInMetersPerSecond = input.nextDouble();
		double tForTimeSpan = input.nextDouble();
		double aAcceleration = input.nextDouble();

		double squaredATValue = (aAcceleration * aAcceleration) * (tForTimeSpan * tForTimeSpan);
		double distanceCovered = uInMetersPerSecond * tForTimeSpan + 0.5 / squaredATValue;

		System.out.println("The distance covered is " + distanceCovered);


	}
}