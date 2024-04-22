import java.util.Scanner;

public class MonthlyInterest {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter balance and interest rate (e.g.. 3 for 3%):  ");
		int fundBalance = input.nextInt();
		double annualInterestRate = input.nextDouble();


		double monthlyInterest = fundBalance * (annualInterestRate / 1200);

		System.out.printf("The interest is %.5f", monthlyInterest);
	}
}