package laba25.card;


import laba25.Card;
import laba25.Currency;

public abstract class Visa extends Card {
    private double dollarsAccount;
    private final Currency currency = Currency.DOLLAR;

    public Visa(String nameHolder, int cardNumber, double dollarsAccount) {
        super(nameHolder, cardNumber);
        if (dollarsAccount >= 0) {
            this.dollarsAccount = dollarsAccount;
        }
    }

    public Visa(String nameHolder, int cardNumber) {
        super(nameHolder, cardNumber);
    }

    @Override
    protected void addMoney(double money) {
        dollarsAccount += money;
    }

    public double getDollarsAccount() {
        return dollarsAccount;
    }

    protected void setDollarsAccount(double dollarsAccount) {
        this.dollarsAccount = dollarsAccount;
    }
}
