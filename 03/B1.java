class B1{
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    B1(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof B1) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: $" + balance);
        }
        public class Main1 {
            public static void main(String[] args) {
                B1 acc1 = new B1(101, "Alice", 5000.00);
                B1 acc2 = new B1(102, "Bob", 3000.00);

                acc1.displayDetails();
                System.out.println();
                acc2.displayDetails();

                System.out.println();
                B1.getTotalAccounts();
            }
        }
    }
    public class Main1{
        public static void main(String[] args) {
            B1 acc1 = new B1(101, "Alice", 5000.00);
            B1 acc2 = new B1(102, "Bob", 3000.00);

            acc1.displayDetails();
            System.out.println();
            acc2.displayDetails();

            System.out.println();
            B1.getTotalAccounts();
        }
    }
}