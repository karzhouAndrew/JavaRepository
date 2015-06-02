package lab25;

/**
 * Класс БелКард
 */
public class BelCard extends CreditCard {
    private String region;
    private String abstractOfAccount;

    public BelCard(String region, String abstractOfAccount) {
        this.region = region;
        this.abstractOfAccount = abstractOfAccount;
    }

    @Override
    public String toString() {
        return "BelCard{" +
                "Имя владельца= " + getOwnerName() + "\n" +
                ", Личный номер счета= " + getCount() + "\n" +
                ", Сумма денег на карточке= " + getNumberOfMoney() + "\n" +
                ", Регион=' " + region + '\'' + "\n" +
                ", Выписка = '" + abstractOfAccount + '\'' + "\n" +
                ", Процент по кредиту= " + getPercentOfUseCard() + "\n" +
                ", Конечная дата погашения кредита= " + getDayOfCreditRepayment() + "\n" +

                '}';
    }
}
