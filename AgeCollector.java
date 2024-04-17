import java.util.Scanner;

public class AgeCollector {
	public static void main (String... args){
		Scanner scan = new Scanner (System.in);
		
		int [ ] age = new int [5];

		for (int counter = 0; counter < 5; counter ++){
			System.out.println("Enter age: ");

			int ageInput = scan.nextInt();
			age[counter] = ageInput;
		}

		for (int count = 0; count <5; count++){
			System.out.println(age[count]);
		}

	}

}