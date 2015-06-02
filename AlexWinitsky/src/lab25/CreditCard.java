package lab25;

/**
 * Класс для кредитных карт
 */
public class CreditCard extends BankCard {
    private int percentOfUseCard;
    private String dayOfCreditRepayment;

    public int getPercentOfUseCard() {
        return percentOfUseCard;
    }

    public void setPercentOfUseCard(int percentOfUseCard) {
        this.percentOfUseCard = percentOfUseCard;
    }

    public String getDayOfCreditRepayment() {
        return dayOfCreditRepayment;
    }

    public void setDayOfCreditRepayment(String dayOfCreditRepayment) {
        this.dayOfCreditRepayment = dayOfCreditRepayment;
    }
}
