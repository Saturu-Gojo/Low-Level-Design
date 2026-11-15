public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (balance < 0) {
            throw new IllegalArgumentException(
                    "initial balance can't be negative");
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient balance");
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive");
        }

        balance += amount;
    }

    public void displayDetails() {
        System.out.println("Account Details are :");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }

}
