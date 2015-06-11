package task25;

public class CreditCard extends BankCard {
    private double creditPercent;
    private int creditCash;

    public CreditCard(String paymentSystem, int creditCash, double creditPercent) {
        super(paymentSystem);
        this.creditCash = creditCash;
        this.creditPercent = creditPercent;
    }

    public double getCreditPercent() {
        return creditPercent;
    }

    public int getCreditCash() {
        return creditCash;
    }
}
