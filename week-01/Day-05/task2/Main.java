public class Main {
    public static void main(String[] args) {
        double amount = 10000;
        BillingService s = new BillingService(new StudentDiscount());
        double total = s.calculateBill(amount);
        System.out.println("Amount :" + total);

        BillingService s2 = new BillingService(new PremiumDiscount());
        double total2 = s2.calculateBill(amount);
        System.out.println("Amount :" + total2);

        BillingService s3 = new BillingService(new FestivalDiscount());
        double total3 = s3.calculateBill(amount);
        System.out.println("Amount :" + total3);
    }
}
