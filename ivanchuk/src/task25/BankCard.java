package task25;

public abstract class BankCard {
    private String paymentSystem;

    public BankCard(String paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public String getPaymentSystem() {
        return paymentSystem;
    }
}
