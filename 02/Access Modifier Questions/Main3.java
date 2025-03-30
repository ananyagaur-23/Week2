public class Main3 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(123456, "John Doe", 5000.00);
        account.displayAccountDetails();

        account.setBalance(6000.00);
        System.out.println("\nUpdated Account Details:");
        account.displayAccountDetails();
    }
}
