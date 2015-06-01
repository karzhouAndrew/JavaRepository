package lab25;

/**
 *
 */
public abstract class Card {
    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", money=" + money +
                '}';
    }

    int cardNumber;
    public double money;

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
}
