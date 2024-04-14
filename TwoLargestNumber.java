import java.util.Scanner;

public class TwoLargestNumber {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		int counter = 1;
		int number = 0;
		int largest = 0;
		int secondLargest = 0;


		while (counter <= 10) {
			System.out.print("Enter a number: ");
			int digitsEntered = input.nextInt();
			number = number + digitsEntered;
			
			if (digitsEntered > largest) {
			secondLargest = largest;
			largest = digitsEntered;

			}

			counter = counter + 1;
		}

		System.out.printf("%n The largest number is %d%n The second largest number is %d%n", largest, secondLargest);
	}
			
}



