import java.util.Scanner;

public class PizzaHut 
{
	public static void main(String... args)
	{
		
		Object[][] pizzas = new Object [4][3];
		
		pizzas [0] = new  Object [ ] {"Sapa size", 4, 2000};
		pizzas [1] = new  Object [ ] {"Small money", 6, 2400};
		pizzas [2] = new  Object [ ] {"Big boys", 8, 3000};
		pizzas [3] = new  Object [ ] {"Odogwu", 12, 4200};

		System.out.println("IYA AFEEZ MENU LIST");
		System.out.println("=".repeat(60));
		System.out.println(String.format("%-20s %-20s %-20s", "Pizza type", "Number of Slices", "Price per box"));
		System.out.println("=".repeat(60));

		for(Object[] pizza : pizzas)
		{
			String pizzaType = (String) pizza[0];
			int slices = (int) pizza [1];
			int price = (int) pizza [2];
			System.out.printf("%-20s %-20d %-20d\n", pizzaType, slices, price);
		
		}

		System.out.println("=".repeat(60));


		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter the number of guest(s) expected : ");
		int numberOfGuests = sc.nextInt();

		String prompt = """
		\nSELECT THE PIZZA YOU WANT
		0 -> Sapa size 
		1 -> Small money
		2 -> Big boys
		3 -> Odogwu
		""";

			//for(int index = 0; index < pizzas.length; index++) {
				//int slices = (int) pizzas[index][1];
				//int boxesNeeded = (int) Math.ceil((double) numberOfGuests / slices);
				//int remainder = (boxesNeeded * slices) - numberOfGuests;
			//}
		
			
			System.out.println(prompt);
			int userInput = sc.nextInt();

			switch(userInput){
				case 0: {
					int slices = (int) pizzas[userInput - 0][1];
					int boxesNeeded = (int) Math.ceil((double) numberOfGuests / slices);
					int remainder = (boxesNeeded * slices) - numberOfGuests;
					int price = (int) pizzas[userInput][2] * boxesNeeded;

					System.out.println("You selected Sapa Size" + ". \nFor " + numberOfGuests + " guests, you will need " + boxesNeeded + " boxes. \nAfter each guest gets one slice, there would be " + remainder + " slices left over.");
					System.out.println("Total Price = " + price);	
					break;
				}
				case 1: {
					int slices = (int) pizzas[userInput][1];
					int boxesNeeded = (int) Math.ceil((double) numberOfGuests / slices);
					int remainder = (boxesNeeded * slices) - numberOfGuests;
					int price = (int) pizzas[userInput][2] * boxesNeeded;

					System.out.println("You selected Small Money" + ". \nFor " + numberOfGuests + " guests, you will need " + boxesNeeded + " boxes. \nAfter each guest gets one slice, there would be " + remainder + " slices left over.");
					System.out.println("Total price = " + price);
					break;
				}
				case 2: {
					int slices = (int) pizzas[userInput][1];
					int boxesNeeded = (int) Math.ceil((double) numberOfGuests / slices);
					int remainder = (boxesNeeded * slices) - numberOfGuests;
					int price = (int) pizzas[userInput][2] * boxesNeeded;

					System.out.println("You selected Big Boys" + ". \nFor " + numberOfGuests + " guests, you will need " + boxesNeeded + " boxes. \nAfter each guest gets one slice, there would be " + remainder + " slices left over.");
					System.out.println("Total price = " + price);
					break;
				}
				case 3: {
					int slices = (int) pizzas[userInput][1];
					int boxesNeeded = (int) Math.ceil((double) numberOfGuests / slices);
					int remainder = (boxesNeeded * slices) - numberOfGuests;
					int price = (int) pizzas[userInput][2] * boxesNeeded;

					System.out.println("You selected Odogwu" + ". \nFor " + numberOfGuests + " guests, you will need " + boxesNeeded + " boxes. \nAfter each guest gets one slice, there would be " + remainder + " slices left over.");
					System.out.println("Total price = " + price);
					break;
				}
				default:{
					System.out.print("Invalid input");
					break;
				} 


			}


	}

}