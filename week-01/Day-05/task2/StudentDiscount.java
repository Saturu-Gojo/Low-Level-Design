public class StudentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        int discount = 60;
        return amount - amount * discount / 100;
    }

}
