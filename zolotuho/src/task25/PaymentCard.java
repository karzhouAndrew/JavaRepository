package task25;

public abstract class PaymentCard {
    private final String bankName;
    private final long cardID;

    public PaymentCard(String bankName, long cardID) {
        this.bankName = bankName;
        this.cardID = cardID;
    }

    public String getBankName() {
        return bankName;
    }

    public long getCardID() {
        return cardID;
    }
}
