package lab25;

public abstract class DebetCard extends Card {

    int interestPerDay;
    int MoneyLimit;

    public int getInterestPerDay() {
        return interestPerDay;
    }

    @Override
    public String toString() {
        return "DebetCard{" +
                "interestPerDay=" + interestPerDay +
                ", MoneyLimit=" + MoneyLimit +
                '}';
    }

    public int getMoneyLimit() {
        return MoneyLimit;
    }

    public DebetCard(int cardNumber, double money, int interestPerDay, int moneyLimit) {
        super(cardNumber, money);
        this.interestPerDay = interestPerDay;
        MoneyLimit = moneyLimit;
    }

    public double moneyInterest(double money) {
        this.money = money;
        money = (1 + interestPerDay / 100) * money;
        return money;
    }
}
