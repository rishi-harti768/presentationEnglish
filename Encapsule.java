// demo for encapsulation
class BankAccount {
    // these data members are accessible only within the class
    private String accountHolderName;
    private double balance;

    // Constructor for object initialization
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // these functions are accessible outside the class
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

public class Encapsule {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.00);

        // Accessing and modifying data through public methods
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(500.00);
        System.out.println("Updated Balance: $" + account.getBalance());

        account.withdraw(300.00);
        System.out.println("Updated Balance: $" + account.getBalance());

        // Attempt invalid operations
        account.withdraw(1500.00); // Insufficient balance
        account.deposit(-100.00); // Invalid deposit amount

        // System.out.println(account.accountHolderName);
        // System.out.println(account.balance);
    }
}
