package lab25;

public abstract class CreditCard extends Card {

    public int getMaxSumOfCredit() {
        return maxSumOfCredit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "maxSumOfCredit=" + maxSumOfCredit +
                ", overdraftDuration=" + overdraftDuration +
                '}';
    }

    public int getOverdraftDuration() {
        return overdraftDuration;
    }

    int maxSumOfCredit;
    int overdraftDuration;

    public CreditCard(int cardNumber, double money, int maxSumOfCredit, int overdraftDuration) {
        super(cardNumber, money);
        this.maxSumOfCredit = maxSumOfCredit;
        this.overdraftDuration = overdraftDuration;
    }


}
