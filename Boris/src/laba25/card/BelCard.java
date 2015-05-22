package laba25.card;

import laba25.Card;
import laba25.Currency;


public abstract class BelCard extends Card {
    private double rubleAccount;
    private Currency currency = Currency.RUBLE;

    public BelCard(String nameHolder, int cardNumber, double rubleAccount) {
        super(nameHolder, cardNumber);
        if (rubleAccount >= 0) {
            this.rubleAccount = rubleAccount;
        }
    }

    public BelCard(String nameHolder, int cardNumber) {
        super(nameHolder, cardNumber);
    }

    public double getRubleAccount() {
        return rubleAccount;
    }

    protected void setRubleAccount(double rubleAccount) {
        this.rubleAccount = rubleAccount;
    }

    @Override
    public void addMoney(double money) {
        rubleAccount += money;
    }
}
