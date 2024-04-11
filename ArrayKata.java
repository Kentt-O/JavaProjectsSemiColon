public class ArrayKata{

	public static int maximumIn (int [ ] maximumNumber) {
		
		int largestNumber = maximumNumber[0];
		
		for (int counter = 0; counter < maximumNumber.length; counter++) {
			if (maximumNumber [counter] > largestNumber) {
				largestNumber = maximumNumber [counter];
			}
		}
		return largestNumber;
	}

	public static int minimumIn (int [ ] minimumNumber) {
		
		int smallestNumber = minimumNumber[0];

		for (int counter = 0; counter < minimumNumber.length; counter++) {
			if (minimumNumber[counter] < smallestNumber) {
				smallestNumber = minimumNumber[counter];
			}
		}
		return smallestNumber;
	}

	public static int sumOf (int [ ] numbers) {
		
		int total = numbers[0];

		for (int counter = 0; counter < numbers.length; counter++) {
			total += numbers[counter];
		}
		return total;
	}

	public static int sumOfEvenNumbersIn(int [ ] numbers) {
		
		int evenNumber = numbers [0];

		for (int counter = 0; counter < numbers.length ; counter++){
			if (numbers[counter] % 2 == 0 ){
				evenNumber += numbers[counter];
			}
		}
		return evenNumber;
	}

	public static int sumOfOddNumbersIn(int [ ] numbers) {
		
		int oddNumbers = numbers [0];

		for (int counter = 0; counter < numbers.length ; counter++){
			if (numbers[counter] % 2 > 0 ) {
				oddNumbers += numbers[counter];
			}
		}
		return oddNumbers;
	}
	
	public static int[ ] maximumAndMinimumOf (int [ ] digits) {
	
		int maximumNumber = digits [0];
		int minimumNumber = digits [0];

		for (int counter = 0; counter < digits.length; counter++) {
			if (digits[counter] > maximumNumber) {
				maximumNumber = digits [counter];
			}
			if (digits[counter] < minimumNumber) {
				minimumNumber = digits[counter];
			}
		}
		int [ ] maxAndMinValues = new int [2];
		
		maxAndMinValues [0] = maximumNumber;
		maxAndMinValues [1] = minimumNumber;

		return maxAndMinValues;
	}


	public static int noOfOddNumbersIn(int [ ] numbers) {
		
		int oddNumbers = 0;
		
		for (int counter = 0; counter < numbers.length; counter++) {
			if ( numbers[counter] % 2 != 0) {			
				oddNumbers++;
			}
		}
		return oddNumbers;
	}


	public static int noOfEvenNumbersIn(int [ ] numbers) {

		int evenNumbers = 0;

		for (int counter = 0; counter < numbers.length; counter++) {
			if (numbers[counter] % 2 == 0){
				evenNumbers++;
			}
		}
		return evenNumbers;
	}


	public static int evenNumbersIn(int [ ] array) {


		for (int index = 0 ; index < array.length; index++) {
			if (array[index] % 2 == 0 ) {
				 System.out.println(array[index]);
			}
		}
	
	}









}