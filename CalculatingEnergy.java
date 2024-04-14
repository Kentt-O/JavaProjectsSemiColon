import java.util.Scanner;

public class CalculatingEnergy {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilogram: ");
		double waterInKilogram = input.nextDouble();

		System.out.print("Enter the initial temprature: ");
		double waterInitialTemprature = input.nextDouble();

		System.out.print("Enter the final temprature: ");
		double waterFinalTemprature = input.nextDouble();

		double energyNeeded = waterInKilogram * (waterFinalTemprature - waterInitialTemprature) * 4184;

		System.out.println("The energy needed is " + energyNeeded);
	}
}