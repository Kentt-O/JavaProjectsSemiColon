public class Kata {
	public boolean isEven (int firstNumber){
		if (firstNumber % 2 == 0){
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrimeNumber(int numberEntered){
		int factor = 0;
		for(int count = 1; count <= number; count++){
			if (number % count == 0){
				factor++;
			}
		}
		if(factor ==2){
			return true;
		}else {
			return false;
		}
	}

	public int subtract (int firstNumber, int secondNumber){
		int difference = firstNumber - secondNumber;
		if (difference < 0){
			return - difference ;
		} else {
			return difference ;
		}
	}
	public static double divide (int firstDigit, int secondDigit){
		double division = firstDigit /  secondDigit;
		double out = System.out.printf("%.2f ", division);
		return out;
	}

	public static int factors (int theNumber){
		int counter = 1;
		int factors = 0;

		while (counter <= theNumber) {
			if(theNumber % counter == 0) {
				factors++;
			}
		counter++;
		}
		return factors;
	}

	public boolean isSquare(int number) {
		
	}

	public static long factorialOf (int digit){
		int count = 1;
		for (int num = 1; num <= digit; num++ ){
			count *= num;
		}
		return count;
	}
	public static boolean isPalindrome (int digitEntered) {
		int valueRemainder = digitEntered % 10;
		int reversedNum = valueRemainder;
		int trueReverse = reversedNum * 10;
		int newNumber = digitEntered / 10;

		if (newNumber > trueReverse) {
		retrun true;
		}
		if (newNumber < trueReverse) {
		return false;
		}

	}
}

