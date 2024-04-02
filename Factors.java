import java.util.Scanner;

public class Factors{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);

			System.out.print("Enter a digit: ");
			int userInput = input.nextInt();

			int counter = 1;
			int factors = 0;

			while (counter <= userInput) {
				if(userInput % counter == 0) {
					factors++;
				}
			counter++;
			}
			System.out.printf("The factors are %d%n", factors);

	}		

}