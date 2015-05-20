package laba25.card.credit;

import laba25.Credit;
import laba25.card.Visa;


public class CreditVisa extends Visa implements Credit {
    private int percent;

    public CreditVisa(String nameHolder, int cardNumber, double dollarsAccount, int percent) {
        super(nameHolder, cardNumber, dollarsAccount);
        this.percent = percent;
    }

    public CreditVisa(String nameHolder, int cardNumber, int percent) {
        super(nameHolder, cardNumber);
        this.percent = percent;
    }

    @Override
    public void writeOffPercent() {
        if (getDollarsAccount() < 0) {
            setDollarsAccount(getDollarsAccount() - getDollarsAccount() * percent / 100);
        }
    }
}
