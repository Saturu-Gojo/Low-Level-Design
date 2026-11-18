public class PremiumDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        int discount = 80;
        return amount - amount * discount / 100;

    }
}
