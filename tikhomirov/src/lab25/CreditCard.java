package lab25;

public abstract class CreditCard extends Card {

    protected int maxSumOfCredit;
    protected int overdraftDuration;

    public CreditCard(int cardNumber, double money, int maxSumOfCredit, int overdraftDuration) {
        super(cardNumber, money);
        this.maxSumOfCredit = maxSumOfCredit;
        this.overdraftDuration = overdraftDuration;
    }

    public int getMaxSumOfCredit() {
        return maxSumOfCredit;
    }

    public int getOverdraftDuration() {
        return overdraftDuration;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "maxSumOfCredit=" + maxSumOfCredit +
                ", overdraftDuration=" + overdraftDuration +
                '}';
    }


}
