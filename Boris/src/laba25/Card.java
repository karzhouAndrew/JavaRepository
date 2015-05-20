package laba25;

//Создать иерархию классов, описывающих банковские карточки. Иерарзия должна иметь хоят бы три уровня.
abstract public class Card {
    private String nameHolder;
    private int cardNumber;

    public Card(String nameHolder, int cardNumber) {
        this.nameHolder = nameHolder;
        this.cardNumber = cardNumber;
    }

    protected abstract void addMoney(double money);

}
