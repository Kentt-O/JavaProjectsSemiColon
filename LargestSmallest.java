import java.util.Scanner;

public class LargestSmallest {
	public static void main (String... args){
		Scanner keyboardInput = new Scanner (System.in);

		int largestNumber = 0;
		int smallestNumber = 0;
		int userInput = 0;
		
			

		while (userInput != -10 ) {
			System.out.print("Enter numbers (to stop press '-10'): ");
			userInput = keyboardInput.nextInt();

			if (userInput > largestNumber) {
			smallestNumber = largestNumber;
			largestNumber = userInput;
				userInput++;
			}
			

		}
		System.out.printf("%n The largest number is %d%n The smallest number is %d%n", largestNumber, smallestNumber);

	}
}