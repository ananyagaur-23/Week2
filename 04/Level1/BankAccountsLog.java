import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Account> accounts;

    public Bank(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account account = new Account(this, customer, initialDeposit);
        accounts.add(account);
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.getName() + " at " + name + " with balance $" + initialDeposit);
    }

    public void displayAccounts() {
        System.out.println("Bank: " + name + " - Accounts:");
        for (Account acc : accounts) {
            acc.displayAccount();
        }
    }
}
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for customer: " + name);
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.getBank().getName() + ", Balance: $" + acc.getBalance());
        }
    }
}
class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("Customer: " + customer.getName() + ", Balance: $" + balance);
    }
}
public class BankAccountsLog {
    public static void main(String[] args) {
        Bank bank1 = new Bank("HDFC");
        Bank bank2 = new Bank("SBI");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank1.openAccount(customer1, 1000);
        bank2.openAccount(customer1, 2500);
        bank1.openAccount(customer2, 500);

        System.out.println();
        customer1.viewBalance();
        System.out.println();
        customer2.viewBalance();
        System.out.println();
        bank1.displayAccounts();
        System.out.println();
        bank2.displayAccounts();
    }
}
