import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter student name: ");
		String studentName = input.next();

		System.out.print("Enter score 1: ");
		int score1 = input.nextInt();

		System.out.print("Enter score 2: ");
		int score2 = input.nextInt();

		System.out.print("Enter score 3: ");
		int score3 = input.nextInt();

		int totalScore = score1 + score2 + score3 ;
		int passMark = 50;
		int fail =  passMark - totalScore;
		int flagValue = 100;
		int aV = 80;
		int bV = 79;
		int cV = 69;
		int dV = 49;
		


		
			if (totalScore > flagValue) {
				System.out.println ("Invalid score cannot calculate");
			}
			if (totalScore < flagValue ){
				
			if (totalScore > 80 ){
				System.out.printf("%n %s You passed by A %n Your score is %d",studentName, totalScore);
				}
			
			if (totalScore > 70 && < bV) {
					System.out.printf("%n %s You passed by B %n Your score is %d",studentName, totalScore);
					}

			if (totalScore > passMark && < cV) {
				System.out.printf("%n %s You passed by C %n Your score is %d",studentName, totalScore);
			}

			if (totalScore < passMark){
				System.out.printf("%n The student %s failed by %d ", studentName, totalScore );
				if (totalScore < 49 ){
				System.out.printf("%n %s You failed by D %n Your score is %d",studentName, totalScore);
				}
			}

	}
}
}