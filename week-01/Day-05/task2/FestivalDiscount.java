public class FestivalDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        int discount = 50;
        return amount - amount * discount / 100;
    }
}
