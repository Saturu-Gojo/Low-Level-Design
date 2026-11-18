public class NetBankingPayment implements PaymentMethod {
    private String bankName;
    private String accountHolder;

    public NetBankingPayment(String bankName, String accountHolder) {
        this.bankName = bankName;
        this.accountHolder = accountHolder;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("[NetBanking] Processing payment of ₹" + String.format("%,.2f", amount) 
            + " via " + bankName + " for " + accountHolder);
    }
}
