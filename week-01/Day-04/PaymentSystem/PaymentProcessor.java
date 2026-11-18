public class PaymentProcessor {

    public void processPayment(PaymentMethod payMethod, double amount) {
        if (payMethod == null) {
            System.out.println("Payment Failed: No payment method provided.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Payment Failed: Amount must be greater than zero. (Given: ₹" + amount + ")");
            return;
        }

        // Polymorphic call: delegates to whichever implementation of PaymentMethod is passed
        payMethod.processPayment(amount);
    }
}
