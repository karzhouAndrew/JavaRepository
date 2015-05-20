package laba25.card;

import laba25.Card;
import laba25.Currency;


public abstract class MasterCard extends Card {
    private double euroAccount;
    private Currency currency = Currency.EURO;

    public MasterCard(String nameHolder, int cardNumber, double euroAccount) {
        super(nameHolder, cardNumber);
        if (euroAccount >= 0) {
            this.euroAccount = euroAccount;
        }
    }

    public MasterCard(String nameHolder, int cardNumber) {
        super(nameHolder, cardNumber);
    }

    public double getEuroAccount() {
        return euroAccount;
    }

    protected void setEuroAccount(double euroAccount) {
        this.euroAccount = euroAccount;
    }

    @Override
    protected void addMoney(double money) {
        euroAccount += money;
    }
}
