package laba25.card.credit;

import laba25.Credit;
import laba25.card.BelCard;


public class CreditBelCard extends BelCard implements Credit {
    private int percent;

    public CreditBelCard(String nameHolder, int cardNumber, double rubleAccount, int percent) {
        super(nameHolder, cardNumber, rubleAccount);
        this.percent = percent;
    }

    public CreditBelCard(String nameHolder, int cardNumber, int percent) {
        super(nameHolder, cardNumber);
        this.percent = percent;
    }

    @Override
    public void writeOffPercent() {
        if (getRubleAccount() < 0) {
            setRubleAccount(getRubleAccount() - getRubleAccount() * percent / 100);
        }
    }
}
