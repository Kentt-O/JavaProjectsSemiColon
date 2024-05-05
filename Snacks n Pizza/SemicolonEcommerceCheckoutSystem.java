import java.util.ArrayList;
import java.util.Scanner;

public class SemicolonEcommerceCheckoutSystem 
{
	public static void main (String... args)
	 {
		Scanner scan = new Scanner(System.in);

		int totalCostOfGoods = 0;
		final double VAT_IN_PERCENTAGE = 17.50;
		
		System.out.println("Enter Customer name: ");
		String customerName = scan.nextLine();

		String customerResponse;

		ArrayList<String> items = new ArrayList<>();
		ArrayList<Integer> quantities = new ArrayList<>();
		ArrayList<Integer> prices = new ArrayList<>();

		while (true) {
			System.out.println("What did the customer buy? ");
			String itemPurchased = scan.nextLine();
			items.add(itemPurchased);

			System.out.println("How many pieces? ");
			int itemQuantity = scan.nextInt();
			quantities.add(itemQuantity);

			System.out.println("How much per unit? ");
			int unitPrice = scan.nextInt();
			prices.add(unitPrice);

			if (itemQuantity != 0) {
				totalCostOfGoods += (unitPrice * itemQuantity);
			}

			System.out.println("Add more items? (yes / no)");
			scan.nextLine();
			customerResponse = scan.nextLine();

			if (customerResponse.equalsIgnoreCase("no")) {
				break;
			}
		}

		System.out.println("What is your name (Cashier's Name)? ");
		String cashiersName = scan.nextLine();

		System.out.println("How much discount will he get");
		int percentageDiscount = scan.nextInt();

		double discount = (percentageDiscount / 100.0) * totalCostOfGoods;
		double vat = (VAT_IN_PERCENTAGE / 100.0) * totalCostOfGoods;
		double totalBill = totalCostOfGoods - discount + vat; 

		System.out.printf("%nSEMICOLON STORES%nMAIN BRANCH%nLOCATION:  312,  HERBERT MACAULAY WAY, SABO YABA, LAGOS.%nTEL:  03293828343%nDate :	11- APRIL - 24	 12 : 10 : 11  pm%nCashier:  %s%nCustomer Name:  %s%n", cashiersName, customerName);


		System.out.println("=".repeat(65));
		System.out.println(String.format("%-15s %-15s %-15s %-15s", "ITEM", "QTY", "PRICES", "TOTAL(NGN)"));
		System.out.println("=".repeat(65));


		for(int index = 0; index < items.size(); index++) {
			System.out.printf("%-15s %-15d %-15d %-15d\n", items.get(index), quantities.get(index), prices.get(index), quantities.get(index) * prices.get(index));
		}
		
		System.out.println("-".repeat(65));

		

	} 
}
