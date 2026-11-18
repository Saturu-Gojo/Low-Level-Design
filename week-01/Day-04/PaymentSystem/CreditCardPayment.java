public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolder;

    // Default constructor
    public CreditCardPayment() {
    }

    // Parameterized constructor
    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment(double amount) {
        if (cardNumber != null && !cardNumber.isEmpty()) {
            String maskedCard = cardNumber.length() > 4
                    ? "**** **** **** " + cardNumber.substring(cardNumber.length() - 4)
                    : cardNumber;
            System.out.println("[Credit Card] Processing payment of ₹" + String.format("%,.2f", amount)
                    + " for " + cardHolder + " (Card: " + maskedCard + ")");
        } else {
            System.out.println("[Credit Card] Processing payment of amount: ₹" + String.format("%,.2f", amount));
        }
    }

    public String getCardHolder() {
        return cardHolder;
    }
}