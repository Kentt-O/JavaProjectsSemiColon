public class Fire{

	public static void main (String... args){

		int[] inputArray = {1, 2, 3, 4, 5};
    		int[] resultArray = evenOdd(inputArray);
    		System.out.println(Arrays.toString(resultArray)); 

	}


	public static int [ ] doubleLength(int length , int [ ]chibuzos...){
		


	}
	public static int [ ] evenOdd(int [ ] numbers ) {

		for (int counter = 0; counter < numbers.length; counter ++){
			if (number[counter] % 2 == 0) {
				number [counter] = 0;
			}
			else { 
				number[counter] = 1;
			}
		}
		return numbers;
	}

	public static boolean[] replaceEvenOdd (int [ ] num) {
		boolean [ ] output = new boolean [num.length];

		for (int i = 0; i < array.length; i++) {
            		output[i] = num[i] % 2 != 0;
        	}
        	return result;
	}
}



