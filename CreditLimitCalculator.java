import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.println("Enter your account number: ");
        int accountNumber = input.nextInt();
        customer.setAccountNumber(accountNumber);

        System.out.print("Enter balance at the beginning of the month: ");
        int balanceAtTheBeginningOfTheMonth = input.nextInt();
        customer.setBalanceAtTheBeginningOfTheMonth(balanceAtTheBeginningOfTheMonth);

        System.out.print("Enter total of all credit charged: ");
        int totalOfAllCreditsCharged = input.nextInt();
        customer.setTotalOfAllCreditsCharged(totalOfAllCreditsCharged);

        
        System.out.print("Enter total of all items charged: ");
        int totalOfAllItemsCharged = input.nextInt();
        customer.setTotalOfAllItemsCharged(totalOfAllItemsCharged);
        
        System.out.print("Enter allowed credit limit: ");
        int allowedCreditLimit = input.nextInt();
        customer.setAllowedCreditLimit(allowedCreditLimit);

        System.out.println("\n");
        System.out.printf("""
                This is your account number %d
                This is your balance at the begining of the month %d 
                This is your total of all credit charged %d
                This is the total of all items charged %d
                This is your credit limit %d

                """, customer.getAccountNumber() , customer.getBalanceAtTheBeginningOfTheMonth() , customer.getTotalOfAllCreditsCharged(),  customer.getTotalOfAllItemsCharged(),  customer.getAllowedCreditLimit() );

                customer.calculateNewBalance();

    }

}

public class Customer {
        private int accountNumber;
        private int balanceAtTheBeginningOfTheMonth;
        private int totalOfAllCreditsCharged;
        private int allowedCreditLimit;
        private int totalOfAllItemsCharged; 

        public void setAccountNumber (int accountNumber){
            this.accountNumber = accountNumber;
        }
        
        public int getAccountNumber (){
            return accountNumber;
        }
        public void setBalanceAtTheBeginningOfTheMonth (int balanceAtTheBeginningOfTheMonth){
            this.balanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth;
        }

        public int getBalanceAtTheBeginningOfTheMonth (){
            return balanceAtTheBeginningOfTheMonth;
        }
        public void setTotalOfAllCreditsCharged (int totalOfAllCreditsCharged){
            this.totalOfAllCreditsCharged = totalOfAllCreditsCharged;
        }

        public int getTotalOfAllCreditsCharged (){
            return totalOfAllCreditsCharged;
        }
        public void setAllowedCreditLimit (int allowedCreditLimit){
            this.allowedCreditLimit = allowedCreditLimit;
        }

        public int getAllowedCreditLimit (){
            return allowedCreditLimit;
        }
        public void setTotalOfAllItemsCharged (int totalOfAllItemsCharged){
            this.totalOfAllItemsCharged = totalOfAllItemsCharged;
        }

        public int getTotalOfAllItemsCharged (){
            return totalOfAllItemsCharged;
        }

        public void calculateNewBalance (){
            int newBalance = getBalanceAtTheBeginningOfTheMonth() + getTotalOfAllItemsCharged() - getTotalOfAllCreditsCharged();
            System.out.println("New Balance is " + newBalance);
            
            if (newBalance > getAllowedCreditLimit()) {
                System.out.println("Your credit limit has been exceeded");
            }
            else {
                System.out.println("Your credit is on point.");
            }

        }
}