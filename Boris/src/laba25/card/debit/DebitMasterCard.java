package laba25.card.debit;

import laba25.Debit;
import laba25.card.MasterCard;


public class DebitMasterCard extends MasterCard implements Debit {
    private int percent;

    public DebitMasterCard(String nameHolder, int cardNumber, double euroAccount, int percent) {
        super(nameHolder, cardNumber, euroAccount);
        this.percent = percent;
    }

    public DebitMasterCard(String nameHolder, int cardNumber, int percent) {
        super(nameHolder, cardNumber);
        this.percent = percent;
    }

    @Override
    public void addPercent() {
        super.setEuroAccount(getEuroAccount() + getEuroAccount() * percent / 100);
    }
}
