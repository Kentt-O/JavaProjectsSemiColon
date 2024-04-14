import java.util.Scanner;

public class IsPalindrome {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three-digit integer: ");
		int digitEntered = input.nextInt();

		int valueRemainder = digitEntered % 10;
		int reversedNum = valueRemainder;
		int trueReverse = reversedNum * 10;
		int newNumber = digitEntered / 10;

		if (newNumber > trueReverse) {
		System.out.println(digitEntered + " is a palindrome");
		}
		if (newNumber < trueReverse) {
		System.out.println(digitEntered + " is not a palindrome");
		}
		
		

	}
}
