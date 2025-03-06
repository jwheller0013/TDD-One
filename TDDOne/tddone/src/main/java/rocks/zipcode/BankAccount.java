package rocks.zipcode;

/** 
 * EXERCISE 2: BankAccount
 * 
 * Implement a BankAccount class that passes all the tests.
 * The class should handle deposits, withdrawals, and maintain a balance.
 */


// Student must implement this class
public class BankAccount {
    // TODO: Implement this class to make the tests pass
    private String accountNumber;
    private String ownerName;
    private double balance = 0.0;

    
    public BankAccount(String accountNumber, String ownerName) {
        // Your implementation here
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        // Your implementation here
        return this.accountNumber;
    }
    
    public String getOwnerName() {
        // Your implementation here
        return this.ownerName;
    }
    
    public double getBalance() {
        // Your implementation here
        return this.balance;
    }
    
    public void deposit(double amount) {
        // Your implementation here
        if (amount > 0) {
            this.balance = balance + amount;
        }
        else {
            System.out.println("Deposit amount must be positive");
        }

    }
    
    public void withdraw(double amount) {
        // Your implementation here
        if (amount <= balance && amount > 0) {
            this.balance = balance - amount;
        }
        else {
            System.out.println("Insufficient funds");;
        }
    }
}
