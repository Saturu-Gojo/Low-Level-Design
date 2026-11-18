public class UpiPayment implements PaymentMethod {
    private String upiId;

    // Default constructor
    public UpiPayment() {
    }

    // Parameterized constructor
    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        if (upiId != null && !upiId.isEmpty()) {
            System.out.println("[UPI] Processing payment of ₹" + String.format("%,.2f", amount) 
                + " via UPI ID: " + upiId);
        } else {
            System.out.println("[UPI] Processing payment of amount: ₹" + String.format("%,.2f", amount));
        }
    }

    public String getUpiId() {
        return upiId;
    }
}
