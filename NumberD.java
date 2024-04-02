import java.util.Scanner;

public class NumberD {
	public static void main (String... args){
		Scanner noWeakness = new Scanner (System.in);

		int positiveNumbers = 0;
		int negativeNumbers = 0;
		int zeros = 0;
		int userInput = 0;
		

		
		while (userInput != -100000 ) {

			System.out.print("Enter numbers (to stop press '-100000'): ");
			userInput = noWeakness.nextInt();

			if (userInput == 0) {
				zeros++;	
			} 
			else if (userInput < 0) {
				negativeNumbers++;
			} 
			else {
				positiveNumbers++;
			}

		}
		System.out.printf("Positive numbers are %d%nNegative numbers are %d%nZeros are %d%n ", positiveNumbers, negativeNumbers, zeros);		

	}


}

