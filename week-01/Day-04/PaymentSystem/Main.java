public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   DAY 04: POLYMORPHISM IN PAYMENT SYSTEM DEMO    ");
        System.out.println("==================================================\n");

        PaymentProcessor processor = new PaymentProcessor();

        // 1. Instantiating various payment methods (Polymorphic references)
        PaymentMethod creditCard = new CreditCardPayment("4532758912349876", "Parth");
        PaymentMethod upi = new UpiPayment("parth@oksbi");
        PaymentMethod netBanking = new NetBankingPayment("HDFC Bank", "Parth");
        PaymentMethod simpleCard = new CreditCardPayment();

        // 2. Testing polymorphic execution
        System.out.println("--- 1. Processing Payments Dynamically ---");
        processor.processPayment(creditCard, 12500.50);
        processor.processPayment(upi, 850.00);
        processor.processPayment(netBanking, 45000.00);
        processor.processPayment(simpleCard, 299.00);
        System.out.println();

        // 3. Testing Polymorphism in a Collection (Batch Processing)
        System.out.println("--- 2. Batch Processing via PaymentMethod Array ---");
        PaymentMethod[] pendingPayments = {
            new UpiPayment("merchant@upi"),
            new CreditCardPayment("5412758933221144", "Aarav"),
            new NetBankingPayment("ICICI Bank", "Sneha")
        };

        double[] amounts = { 150.0, 3200.0, 18000.0 };

        for (int i = 0; i < pendingPayments.length; i++) {
            processor.processPayment(pendingPayments[i], amounts[i]);
        }
        System.out.println();

        // 4. Testing Edge Cases & Input Validation
        System.out.println("--- 3. Testing Edge Cases & Validations ---");
        System.out.println("Attempting payment with null method:");
        processor.processPayment(null, 500.0);

        System.out.println("\nAttempting payment with zero/negative amount:");
        processor.processPayment(upi, -100.0);
        processor.processPayment(upi, 0.0);

        System.out.println("\n==================================================");
        System.out.println("          PAYMENT SYSTEM TESTS COMPLETED          ");
        System.out.println("==================================================");
    }
}
