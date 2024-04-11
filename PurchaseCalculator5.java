import java.util.Scanner;

public class PurchaseCalculator5 {
	public static void main (String... args){
		Scanner scan = new Scanner(System.in);

		int counter = 1;
		int totalCost = 0;
		int itemCost = 0;

		do {
			System.out.printf("Welcome to E-Store:%n");
			System.out.print("Enter Customer name: ");
			String customerName = scan.nextLine();

			System.out.print("Please enter percentage discount: ");
			int percentageDiscount = scan.nextInt();

			System.out.printf("Please enter cost for item %d or -1 to quit: ",counter);
			itemCost = scan.nextInt();
			totalCost += itemCost;
				counter++;
		
			if (totalCost >= 200) {
				double discount = (percentageDiscount / 100.0) * totalCost;
				double discountedPrice = totalCost - discount;

				System.out.printf("Customer Name: %s%nOriginal cost: %d%nDiscount cost: %.2f%nThank you for your patronage!", customerName, totalCost, discountedPrice);
			}
 
			else {
				System.out.printf("Customer Name: %s%nOriginal cost: %d%nDiscount cost: %s%nThank you for your patronage!", customerName, totalCost, "0 (no discount added)");

			}

		}
		while(itemCost != -1); 
	
	
	}

}