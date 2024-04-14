import java.util.Scanner;

public class InvestmentValue {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();

		double decimalNumber = annualInterestRate / 100.0;
		double monthlyInterestRate = decimalNumber / 12;
		double squaredValue = numberOfYears * 12;
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, squaredValue);

		System.out.printf("Future value is %.2f", futureInvestmentValue);

	}
}

