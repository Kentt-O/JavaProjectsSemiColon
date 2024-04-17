import java.util.Arrays;

public class Summing {

	public static void main (String... args) {
		int [] adding = {2, 4, 5, 1,6};

		int [] subtract  = new int [5];
		int total = 0;

		for (int counter = 0; counter < adding.length ; counter ++) {
			total += adding[counter];
		}
		System.out.printf("Total array element:%d%n ", total);

		for (int counter = 0; counter < adding.length ; counter ++) {
			 subtract[counter] = total - adding[counter] ;
		}
		System.out.printf("Subtracted values :%s%n ", Arrays.toString(subtract));

		
	}
}
