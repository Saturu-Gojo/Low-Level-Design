public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   DAY 02: ENCAPSULATION & DATA VALIDATION DEMO   ");
        System.out.println("==================================================\n");

        // 1. Successful Account Creation
        System.out.println("--- 1. Creating Valid Bank Accounts ---");
        BankAccount account1 = new BankAccount("AC-1001", "Parth", 15000.0);
        BankAccount account2 = new BankAccount("AC-1002", "Aarav", 5000.0);

        account1.displayDetails();
        System.out.println();
        account2.displayDetails();
        System.out.println();

        // 2. Normal Deposit & Withdrawal Operations
        System.out.println("--- 2. Performing Valid Transactions ---");
        System.out.println("Depositing ₹5,000 into Parth's account...");
        account1.deposit(5000.0);
        System.out.println("New Balance: ₹" + account1.getBalance());

        System.out.println("\nWithdrawing ₹3,000 from Parth's account...");
        account1.withdraw(3000.0);
        System.out.println("New Balance: ₹" + account1.getBalance());
        System.out.println();

        // 3. Testing Validation 1: Negative Initial Balance
        System.out.println("--- 3. Testing Validation: Negative Initial Balance ---");
        try {
            System.out.println("Attempting to create account with balance -500.0...");
            BankAccount invalidAccount = new BankAccount("AC-9999", "Invalid User", -500.0);
            invalidAccount.displayDetails();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }
        System.out.println();

        // 4. Testing Validation 2: Invalid Deposit Amount (<= 0)
        System.out.println("--- 4. Testing Validation: Invalid Deposit Amount ---");
        try {
            System.out.println("Attempting to deposit ₹0...");
            account1.deposit(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        try {
            System.out.println("Attempting to deposit -₹1,000...");
            account1.deposit(-1000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }
        System.out.println();

        // 5. Testing Validation 3: Insufficient Funds on Withdrawal
        System.out.println("--- 5. Testing Validation: Insufficient Balance ---");
        try {
            System.out.println("Current Balance for Parth: ₹" + account1.getBalance());
            System.out.println("Attempting to withdraw ₹50,000 (exceeds balance)...");
            account1.withdraw(50000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }
        System.out.println();

        // 6. Proving State Independence Between Accounts
        System.out.println("--- 6. Verifying State Independence ---");
        System.out.println("Parth's Account Details:");
        account1.displayDetails();
        System.out.println("\nAarav's Account Details (Unchanged):");
        account2.displayDetails();
        System.out.println("\n==================================================");
    }
}
