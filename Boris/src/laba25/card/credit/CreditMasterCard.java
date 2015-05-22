package laba25.card.credit;

import laba25.Credit;
import laba25.card.MasterCard;


public class CreditMasterCard extends MasterCard implements Credit {
    private int percent;

    public CreditMasterCard(String nameHolder, int cardNumber, double euroAccount, int percent) {
        super(nameHolder, cardNumber, euroAccount);
        this.percent = percent;
    }

    public CreditMasterCard(String nameHolder, int cardNumber, int percent) {
        super(nameHolder, cardNumber);
        this.percent = percent;
    }

    @Override
    public void writeOffPercent() {
        if (getEuroAccount() < 0) {
            setEuroAccount(getEuroAccount() - getEuroAccount() * percent / 100);
        }
    }
}
