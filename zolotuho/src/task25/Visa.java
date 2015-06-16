package task25;

public class Visa extends DebitCard {
    private long monthlyPercent;

    public void transferToAnotherCard(long sum, PaymentCard paymentCard) {
        if (getBalance() - sum >= 0) {
            setBalance(getBalance() - sum);
        } else {
            setOverdraft(sum - getBalance());
        }
        ((DebitCard) paymentCard).setBalance(((DebitCard) paymentCard).getBalance() + sum);
    }

    public Visa(String bankName, long cardID, long balance, long overdraft, Currency currency, long monthlyPercent) {
        super(bankName, cardID, balance, overdraft, currency);
        this.monthlyPercent = monthlyPercent;
    }

    public long getMonthlyPercent() {
        return monthlyPercent;
    }

    public void setMonthlyPercent(long monthlyPercent) {
        this.monthlyPercent = monthlyPercent;
    }
}
