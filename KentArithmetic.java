import java.util.Scanner;

public class KentArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");

        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int input1Squared = number1 * number1;
        int input2Squared = number2 * number2;

        int summedSquares = input1Squared + input2Squared;

        int minusSquares = input1Squared - input2Squared;

        System.out.printf("%s %d%n%s %d%n", "The value for the first squared input is:", input1Squared, "The value for the second squared input is:", input2Squared);
        System.out.printf("%s %d%n", "The squared sum is:", summedSquares);
        System.out.printf("%s %d%n", "The minus is:", minusSquares);
    }
}