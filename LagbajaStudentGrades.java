import java.util.Scanner;

public class LagbajaStudentGrades {
	
	public static void main (String... args){
		Scanner scan = new Scanner(System.in);

		System.out.println("How many students do you have? ");
        	int numberOfStudents = scan.nextInt();

		System.out.println("How many subject do they offer? ");
		int numberOfSubjectsOfferedByStudent = scan.nextInt();

		System.out.print("Saving >>>>>>>>>>>>>>>>>>>>\nSaved successfully\n\n");

		
		int[][] grades = new int[numberOfStudents][numberOfSubjectsOfferedByStudent];
			
	
		for (int index = 0; index < numberOfStudents; index++){
			for (int count = 0; count < numberOfSubjectsOfferedByStudent; count ++){
				System.out.println("Enter score for student " + (index+1) + "\nEnter score for subject " + (count+1) );
				int score = scan.nextInt();

				System.out.print("Saving >>>>>>>>>>>>>>>>>>>>\nSaved successfully\n\n");

				if(score >= 0 && score <= 100) {
					grades[index][count] = score;
				} else {
					System.out.println("Invalid score. Please enter a score between 0 and 100.");
					count--; 
				}
			}

		}

		System.out.println("===========================================================================");
		System.out.printf("%s%8s%5s%5s%5s%5s%8s%n", "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
		
		for(int index = 0; index < numberOfStudents; index++) {
			System.out.print("Student " + (index+1));
			int totalSG = 0;

			for(int count = 0; count < numberOfSubjectsOfferedByStudent; count ++) {
				System.out.printf("%5d", grades[index][count]);
				totalSG += grades[index][count];
			}
	
			System.out.println(     totalSG);

			double average = (double) totalSG / numberOfSubjectsOfferedByStudent;
			System.out.println("The average score for student " + (index+1) + " is: " + average);
		}
	}
}
