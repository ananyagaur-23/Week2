interface Loanable{
    String applyForLoan();
    boolean calculateLoanEligibility();
}
abstract class BankAccount{
    String accountNumber;
    String holderName;
    double balance;

    BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount > 0  && amount <= balance){
            balance -= amount;
        }
    }
    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable{
    SavingsAccount(String accountNumber, String holderName, double balance){
        super(accountNumber,holderName,balance);
    }
    public double calculateInterest(){
        return getBalance() * 0.04;
    }
    public String applyForLoan(){
        return ("Loan application submitted for Savings Account.");
    }
    public boolean calculateLoanEligibility(){
        return getBalance() >= 5000;
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(String accountNumber, String holderName, double balance){
        super(accountNumber,holderName,balance);
    }
    public double calculateInterest() {
        return getBalance() * 0.02;
    }
}
