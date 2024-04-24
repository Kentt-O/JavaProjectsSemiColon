import java.util.Scanner;

public class SevenSegmentDisplayII {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a segment: ");
            String userInput = input.nextLine();

            String a = "####";
            String b = "#";
            String c = "#";
            String d = "####";
            String e = "#";
            String f = "#";
            String g = "####";
            String result = "";

            if  (userInput.charAt(0) == '1') {
                result += a + "\n";
            } else result += "" + "\n";

            if  (userInput.charAt(5) == '1') {
                result += f + "  ";
            } else result += "  ";

            if  (userInput.charAt(1) == '1') {
                result += b + "\n";
            } else result += "" + "\n";
            
            if  (userInput.charAt(6) == '1') {
                result += g + "\n";
            } else result += "";

            if  (userInput.charAt(4) == '1') {
                result += e + "  ";
            } else result += "  ";

            if  (userInput.charAt(2) == '1') {
                result += c + "\n";
            } else result += "" + "\n";

            if  (userInput.charAt(3) == '1') {
                result += d + "\n";
            } else result += "" + "\n";


            System.out.println(result);     
            

        }


}