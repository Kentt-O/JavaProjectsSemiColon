import java.util.Arrays;
import java.util.Scanner;

public class ScoresCollectorPrint2 {
	public static void main (String... args){
		Scanner scan = new Scanner (System.in);
		
		int [ ] scores = new int [10];

		for (int counter = 0; counter < 10; counter ++){
			System.out.println("Enter scores: ");

			int scoresInput = scan.nextInt();
			scores[counter] = scoresInput;
		}

		for (int count = 0; count < 10; count++){

		}
			System.out.printf("Scores are :%s%n ", Arrays.toString(scores));
	}

}