public class BillingService {
    private DiscountStrategy ds;

    public BillingService(DiscountStrategy ds) {
        this.ds = ds;

    }

    public void setDS(DiscountStrategy ds) {
        this.ds = ds;
    }

    public double calculateBill(double amount) {
        if (ds == null) {
            return amount;
        }
        return ds.applyDiscount(amount);
    }

}
