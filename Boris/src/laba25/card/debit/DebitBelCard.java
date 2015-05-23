package laba25.card.debit;

import laba25.Debit;
import laba25.card.BelCard;


public class DebitBelCard extends BelCard implements Debit {
    private int percent;

    public DebitBelCard(String nameHolder, int cardNumber, double rubleAccount, int percent) {
        super(nameHolder, cardNumber, rubleAccount);
        this.percent = percent;
    }

    public DebitBelCard(String nameHolder, int cardNumber, int percent) {
        super(nameHolder, cardNumber);
        this.percent = percent;
    }

    @Override
    public void addPercent() {
        super.setRubleAccount(getRubleAccount() + getRubleAccount() * percent / 100);
    }
}
