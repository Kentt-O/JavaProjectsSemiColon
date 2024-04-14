import java.util.Scanner;

public class AppForBMI {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your weight: ");
		double userWeight = input.nextDouble();

		System.out.print("Enter your height: ");
		double userHeight = input.nextDouble();

		// Weights in pound to kilogram
		double weightInPounds = 0.45359237;
		double weightToKilogram = userWeight * weightInPounds;


		// height to meters
		double heightInInches = 0.0254;
		double heightToMeters = userHeight * heightInInches;

		double heightSquared = heightToMeters * heightToMeters;
	
		double BMIresult = weightToKilogram / heightSquared;

		System.out.println("BMI is" +      BMIresult);
	}
}