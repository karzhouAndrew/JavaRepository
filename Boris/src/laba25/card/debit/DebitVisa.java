package laba25.card.debit;

import laba25.Debit;
import laba25.card.Visa;


public class DebitVisa extends Visa implements Debit {
    private int percent;

    public DebitVisa(String nameHolder, int cardNumber, double dollarsAccount, int percent) {
        super(nameHolder, cardNumber, dollarsAccount);
        this.percent = percent;
    }

    public DebitVisa(String nameHolder, int cardNumber, int percent) {
        super(nameHolder, cardNumber);
        this.percent = percent;
    }

    @Override
    public void addPercent() {
        super.setDollarsAccount(getDollarsAccount() + getDollarsAccount() * percent / 100);

    }
}
