public class Main{
    public static void main(String[] args){
        BankAccount[] accounts = {
                new SavingsAccount("SA0023","Natasha",10000),
                new CurrentAccount("CA00101","Barry",250000)
        };
        for(BankAccount acc : accounts){
            System.out.println("Account Holder: "+ acc.getHolderName());
            System.out.println("Account Number: "+ acc.getAccountNumber());
            System.out.println("Balance: "+ acc.getBalance());
            System.out.println("Interest: "+ acc.calculateInterest());

            if (acc instanceof Loanable){
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan();
                System.out.println("Loan Eligible: "+ loanAcc.calculateLoanEligibility());
            }
            else{
                System.out.println("Loan Feature Not Availible");
            }
            System.out.println();
        }
    }
}