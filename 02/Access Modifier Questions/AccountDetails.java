class AccountDetails {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    AccountDetails(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}

class SavingsAccount extends AccountDetails {
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + getBalance());
    }
}
public class Main{
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(123456, "John Doe", 5000.00);
        account.displayAccountDetails();

        account.setBalance(6000.00);
        System.out.println("\nUpdated Account Details:");
        account.displayAccountDetails();
    }
}

