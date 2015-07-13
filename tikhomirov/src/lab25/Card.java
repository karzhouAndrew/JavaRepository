package lab25;

/**
 *
 */
public abstract class Card {
    protected int cardNumber;
    protected double money;

    public Card(int cardNumber, double money) {
        this.cardNumber = cardNumber;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", money=" + money +
                '}';
    }
}