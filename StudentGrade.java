import java.util.Scanner;

public class StudentGrade  {
	public static void main(String... args){




		String calculate = """

		Welcome to student grade
		1 -> Enter 1 to calculate
		2 -> Enter 2 to exit
		""";


			System.out.println(prompt);
			Scanner KeyboardInput = new Scanner(System.in);
			int userInput = KeyboardInput.nextInt();

			

			switch(userInput){
					case 1-> {
						System.out.println("");


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
			
						if (totalScore > 70 && totalScore < bV) {

							System.out.printf("%n %s You passed by B %n Your score is %d",studentName, totalScore);
						}

						if (totalScore > passMark && totalScore < cV) {
							System.out.printf("%n %s You passed by C %n Your score is %d",studentName, totalScore);
						}

						if (totalScore < passMark){
							System.out.printf("%n The student %s failed by %d ", studentName, totalScore );
						if (totalScore < 49 ){
							System.out.printf("%n %s You failed by D %n Your score is %d",studentName, totalScore);
						}
					
			}
						case 2 -> {System.out.print("Exit");}

					
					}
					



			}


	}

}
}