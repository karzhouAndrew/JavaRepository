package lab25;

public abstract class DebetCard extends Card {

    protected int interestPerDay;
    protected int MoneyLimit;

    public DebetCard(int cardNumber, double money, int interestPerDay, int moneyLimit) {
        super(cardNumber, money);
        this.interestPerDay = interestPerDay;
        MoneyLimit = moneyLimit;
    }

    public int getInterestPerDay() {
        return interestPerDay;
    }

    public int getMoneyLimit() {
        return MoneyLimit;
    }

    public double moneyInterest(double money) {
        this.money = money;
        money = (1 + interestPerDay / 100) * money;
        return money;
    }

    @Override
    public String toString() {
        return "DebetCard{" +
                "interestPerDay=" + interestPerDay +
                ", MoneyLimit=" + MoneyLimit +
                '}';
    }
}
