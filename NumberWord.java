import java.util.Scanner;

public class NumberWord {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int digitsEntered = input.nextInt();



		if (digitsEntered == 1){
			System.out.printf("%s", "One");
		}
		if (digitsEntered == 2){
			System.out.printf("%s", "Two");
		}
		if (digitsEntered == 3){
			System.out.printf("%s", "Three");
		}
		if (digitsEntered == 4){
			System.out.printf("%s", "Four");
		}
		if (digitsEntered == 5){
			System.out.printf("%s", "Five");
		}
		if (digitsEntered == 6){
			System.out.printf("%s", "Six");
		}
		if (digitsEntered == 7){
			System.out.printf("%s", "Seven");
		}
		if (digitsEntered == 8){
			System.out.printf("%s", "Eight");
		}
		if (digitsEntered == 9){
			System.out.printf("%s", "Nine");
		}
		if (digitsEntered == 10){
			System.out.printf("%s", "Ten");
		}


	}
}


