package Week3_3;

public class BankAccount {
    // Your variable declarations and code here
    private static int accountAmount = 0;
    private double balance;
    private int accountNumber = 1;

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " has been deposited");
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + " has been withdrawn");
        } else {
            System.out.println("Account balance too low for withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }
    public BankAccount(double balance){
        this.balance = balance;
        this.accountNumber += accountAmount;
        accountAmount += 1;
    }
    public static int getTotalAccounts(){
        return accountAmount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}