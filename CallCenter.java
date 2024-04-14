import java.util.Scanner;

public class CallCenter {
	public static void main (String... args) {
		String prompt = """
		Hi, Welcome
		Press
		1 -> For English 
		2 -> For Yoruba
		3 -> For Hausa
		""";

		String englishPrompt = """
		1 -> For Network
		2 -> For Data
		""";

		String yorubaPrompt = """
		1 -> For Network
		2 -> For Data
		""";

		String hausaPrompt = """
		1 -> For Network
		2 -> For Data
		""";



		System.out.println(prompt);
		Scanner KeyboardInput = new Scanner(System.in);
		int userInput = KeyboardInput.nextInt();

		switch(userInput){
			case 1: {
				System.out.println("English");

					System.out.println(englishPrompt);
					KeyboardInput = new Scanner(System.in);
					int digitEntered = KeyboardInput.nextInt();

					switch (digitEntered){

						case 1: {
							System.out.println("Network");
							break;
						}
						case 2: {
							System.out.println("Data");
							break;
						}
					}
				break;
			}
			case 2: {
				System.out.println("Yoruba");

					System.out.println(englishPrompt);
					KeyboardInput = new Scanner(System.in);
					int digitEntered = KeyboardInput.nextInt();

					switch (digitEntered){

						case 1: {
							System.out.println("Network");
							break;
						}
						case 2: {
							System.out.println("Data");
							break;
						}
					}



				break;
			}
			case 3: {
				System.out.println("Hausa");

					System.out.println(englishPrompt);
					KeyboardInput = new Scanner(System.in);
					int digitEntered = KeyboardInput.nextInt();

					switch (digitEntered){

						case 1: {
							System.out.println("Network");
							break;
						}
						case 2: {
							System.out.println("Data");
							break;
						}
					}



				break;
			}

			
			

		}


	}
}