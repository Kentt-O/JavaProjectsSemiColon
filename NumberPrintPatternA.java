public class NumberPrintPatternA {

	public static void main (String... args) {
	
		
		for (int counter = 1; counter <= 6; counter++){

			for (int number = 1; number <= counter; number++){

				System.out.printf("%2d", number);
			}
		System.out.println();
		}
			
	}

}