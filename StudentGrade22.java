import java.util.Scanner;

public class StudentGrade22  {
    public static void main(String... args) {

        String prompt = """
                Welcome to student grade
                1 -> Enter 1 to calculate
                2 -> Enter 2 to exit
                """;

        System.out.println(prompt);

        Scanner keyboardInput = new Scanner(System.in);
        int userInput = keyboardInput.nextInt();

        switch(userInput) {
            case 1 -> {
                Scanner input = new Scanner(System.in);

		System.out.print("How many grade would you like to calculate: ");
                int numberOfGrade = input.nextInt();

		int count = 1;

		while (count <= numberOfGrade){

		
                System.out.print("Enter student name: ");
                String studentName = input.next();

                System.out.print("Enter score 1: ");
                int score1 = input.nextInt();

                System.out.print("Enter score 2: ");
                int score2 = input.nextInt();

                System.out.print("Enter score 3: ");
                int score3 = input.nextInt();

                int totalScore = score1 + score2 + score3;
                int passMark = 50;
                int aV = 80;
                int bV = 70;
                int cV = 60;

                if (totalScore >= aV) {
                    System.out.printf("%n%s, You passed by A. Your score is %d%n", studentName, totalScore);
                } else if (totalScore >= bV) {
                    System.out.printf("%n%s, You passed by B. Your score is %d%n", studentName, totalScore);
                } else if (totalScore >= cV) {
                    System.out.printf("%n%s, You passed by C. Your score is %d%n", studentName, totalScore);
                } else if (totalScore >= passMark) {
                    System.out.printf("%n%s, You failed. Your score is %d%n", studentName, totalScore);
                } else {
                    System.out.printf("%n%s, You failed by D. Your score is %d%n", studentName, totalScore);
                }
		count ++;
            }
}
            case 2 -> {
                System.out.println("Exit");
                break;
            }

            default -> {
                System.out.println("Invalid input");
            }
        }
    }
}
