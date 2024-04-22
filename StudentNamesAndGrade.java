import java.util.Scanner;

public class StudentNamesAndGrade {
	public static void main (String... args) {
		Scanner scan = new Scanner (System.in);

		String [ ] studentNames = new String [5];
		int [ ] studentGrades = new int [5];

		for (int counter = 0; counter < 5 ; counter ++) {
			System.out.println("Enter student name : ");

			scan.nextLine();
			String nameInput = scan.nextLine();
			studentNames[counter] = nameInput;

			System.out.println("Enter student grade : ");
			int gradeInput = scan.nextInt();
			studentGrades[counter] = gradeInput;
		}

		for (int counter = 0; counter < 5; counter ++) {

			System.out.println(studentNames[counter]);
			System.out.println(studentGrades[counter]);
		}
		
	}

}